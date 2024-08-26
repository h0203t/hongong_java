package chap14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileOutput {
	
	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("C:/Temp/test3.db");
			byte[] array = { 10, 20, 30, 40, 50, 60 };
			
			os.write(array, 1, 3);
			
			os.flush();
			os.close();
		} catch (Exception e) {
			System.out.println("오류 발생!");
		}
	}
}
