package pack1;

public class Main {

	public static void main(String[] args) {
		
		FactorialTask fact1=new FactorialTask(10);
		FactorialTask fact2=new FactorialTask(10);
		FactorialTask fact3=new FactorialTask(10);
		
		Thread th1=new Thread(fact1);
		Thread th2=new Thread(fact2);
		Thread th3=new Thread(fact3);
		
		th1.start();
		th2.start();
		th3.start();
		
		th1.interrupt();
		th2.interrupt();
		th3.interrupt();
		
		Thread th=Thread.currentThread();
		
		System.out.println(th.getName()+" Stop!!!");
		
		FileOutputStream fk;
		
	}

}
