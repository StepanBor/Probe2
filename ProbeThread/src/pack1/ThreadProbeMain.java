package pack1;

public class ThreadProbeMain {

	public static void main(String[] args) {
		Thread thr1=new Thread( new NewThread(), "2 thr" );
		Thread thr2=new Thread( new NewThread(), "3 thr" );
		Thread thr3=new Thread( new NewThread(), "4 thr" );
				
		thr1.start();
		thr2.start();
		thr3.start();
		try {
			thr1.join();
			thr2.join();
			thr3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System. out.println( "Stop programm" );

	}

}
