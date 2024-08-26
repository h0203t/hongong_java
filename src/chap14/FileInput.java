package chap14;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileInput {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("C:/Temp/test3.db");

			byte[] buffer = new byte[5];

			int readNum = is.read(buffer, 2, 3);
			if(readNum != -1 ) {
				for(int i=0; i<buffer.length; i++) {
					System.out.println(buffer[i]);
				}
			}
			
			is.close();
		} catch (Exception e) {
			System.out.println("오류 발생!!!");
		}
	}

}
