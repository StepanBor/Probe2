package pack1;

import java.math.BigInteger;

public class FactorialTask implements Runnable{
	
	private int number;

	public FactorialTask(int number) {
		super();
		this.number = number;
	}

	public FactorialTask() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	private BigInteger factorial(int n) {
		BigInteger fact=new BigInteger("1");
		for (int i=1; i<=n; i+=1) {
			fact=fact.multiply(new BigInteger(""+i));
		}
		return fact;
			
	}
	
	

	@Override
	public void run() {
		
		Thread thr=Thread.currentThread();
		for(int i=1; i<this.number; i+=1) {
			System.out.println(thr.getName()+": "+i+"! = "+factorial(i));
			if(thr.isInterrupted()) {
				System.out.println(thr.getName()+" interuprt");
				return;
			}
			
		}
		
	}
	
	
	

}
