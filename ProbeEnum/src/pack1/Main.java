package pack1;

import java.text.ParseException;

public class Main {

	public static void main(String[] args) {
		
	
		Student studProbe=null;
		try {
			studProbe=new Student("femail", "Gulnara", "Karimova", "06:08:1999", "Kazahstammn", 2.5);
		} catch (ParseException e1) {
			
			e1.printStackTrace();
		}
		Student pr=new Student();
		System.out.println(studProbe);
		

		
}

}
