package chapter03;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			//123이 저장되지 않았다. > 왜?
			// ascii code값이 무엇으로 정의될 지 정하지 않았다.
			FileOutputStream fos = new FileOutputStream("123.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos,5); // 5; buffer_size
			
			for(int i='0';i<'9';i++){ //이렇게 하면 012345678이 저장됨
				//for (int i=0;i<9;i++){ 이면 제대로 저장되지 않음
//				fos.write(i);
				
				bos.write(i); // buffer에 저장. buffersize가 5니깐 버퍼가 다 차게되면 기반스트림에서 ????뭐지 뭘까(43분 참고 ㅠㅠㅠㅠ)
				
			}
/*
			fos.close();
			bos.close();
			*/
			
			bos.close(); // 보조스트림을 닫으면 기반스트림도 자동으로 닫히게된다
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}

}
