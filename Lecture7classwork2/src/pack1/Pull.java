package pack1;

public class Pull implements Runnable{
	private String text = "Pull";
//	private boolean check = false;
	Monitor mon;

	public Pull(Monitor mon) {
		super();
		this.mon = mon;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	synchronized public void run() {
		for (int i = 0; i < 5; i++) {
			for (; mon.isCheck()==true;) {
				try {
					wait();
				} catch (InterruptedException e) {

				}

			}
			mon.setCheck(false);
			System.out.println(text);
			notifyAll();
		}

	}
}
