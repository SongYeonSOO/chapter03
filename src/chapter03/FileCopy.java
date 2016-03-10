package chapter03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args){
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\bit\\Desktop\\EST_YS2\\WorkSpace\\profile.jpg");
			FileOutputStream fos = new FileOutputStream("profile.bak.jpg");
			int data = -1;
			while((data = fis.read())==-1){
				fos.write(data);
			}	
				fis.close();
				fos.close();
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
