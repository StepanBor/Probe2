package pack1;

public class Push implements Runnable {

	private String text = "Push";
//	private boolean check = false;
	Monitor mon;

	public Push(Monitor mon) {
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
			for (; mon.isCheck() == false;) {
				try {
					wait();
				} catch (InterruptedException e) {

				}

			}
			mon.setCheck(true);
			System.out.println(text);
			notifyAll();
		}

	}

}
