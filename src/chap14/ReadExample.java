package chap14;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) {
		try {
			Reader reader = new FileReader("C:/Temp/test7.txt");
			while(true) {
				int data = reader.read();
				if(data == -1) {
					break;
				}
				System.out.println((char)data);
			}
			reader.close();
		} catch (Exception e) {
			System.out.println("오류 발생");
		}

	}

}
