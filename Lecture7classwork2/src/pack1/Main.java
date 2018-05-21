package pack1;

public class Main {

	public static void main(String[] args) {
		
		Monitor mon=new Monitor();
		
		Thread pull=new Thread(new Pull(mon),"Th1");
		Thread push=new Thread(new Push(mon),"Th2");
		
		push.start();
		pull.start();

	}

}
