package chapter03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	public static void main(String[] args){
		
		try {
			FileReader fr = new FileReader("test.txt");
			int data = -1;
			int count = 0;
			while((data = fr.read())!= -1){
						System.out.print((char)data);
						count++;
					}
			System.out.println("읽은  횟수:"+count);

			fr.close();
			count = 0;
			
			FileInputStream fis = new FileInputStream("test.txt");
			while((data = fis.read())!= -1){
				System.out.print((char)data);
				count++;
			}
			System.out.println("읽은  횟수:"+count);

			fis.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일이 존재하지 않습니다");
			e.printStackTrace();
		} catch(IOException e){
			e.printStackTrace();
		}
		
	}
}
