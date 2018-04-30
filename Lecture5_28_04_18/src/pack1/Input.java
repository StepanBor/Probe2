package pack1;

import java.io.FileInputStream;
import java.util.Arrays;
import java.io.*;
public class Input {

	public static void main(String[] args) {
		
		File file=new File("lecture");
		File file2=new File("b.txt");
		
		
		try (InputStream is=new FileInputStream(file)){
			
			Copy.copyFile(file,file2);
			int n=is.read();
			
			System.out.println(n);
			
			byte[] byteArray=new byte[5];
			
			int b=is.read(byteArray);
			
			System.out.println(Arrays.toString(byteArray));
			System.out.println(b);
			b=is.read(byteArray);
			System.out.println(Arrays.toString(byteArray));
			
			
			
		} catch (IOException e){
			System.out.println(e);
		}
	}

}
