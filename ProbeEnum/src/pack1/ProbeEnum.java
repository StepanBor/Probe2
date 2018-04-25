package pack1;

import java.text.ParseException;

public class ProbeEnum {

	public static void main(String[] args) {
		
		
//			Colors colorOne;
//			colorOne = Colors.RED;
//			if ( colorOne == Colors.RED) {
//			System. out.println( "Color = RED" );
//			}
//			System. out.println( colorOne.getColorCode());
//			colorOne.setColorCode( "12345" );
//			System. out.println( colorOne.getColorCode());
//			}
//		
		
		
		Student studProbe;
		try {
			studProbe=new Student("femail", "Gulnara", "Karimova", "06:08:1999", "Kazahstammn", 2.5);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println(studProbe);
		

}

}
