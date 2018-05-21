package pack1;

import java.lang.reflect.*;

public class Main {

	public static void main(String[] args) {

		Cat cat1 = new Cat(4, "Vaska", "Black");
		Cat cat2 = new Cat(4, "Vaska", "Black");

		System.out.println(cat1.hashCode());
		System.out.println(cat2.hashCode());

		System.out.println(cat1 == cat2);
		System.out.println(cat1.equals(cat2));

		Class catClass = cat1.getClass();

		Field[] catField = catClass.getDeclaredFields();

		for (int i = 0; i < catField.length; i++) {
			System.out.println(catField[i]);
		}
		
		

	}

}
