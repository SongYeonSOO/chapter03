package chapter03;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOEx01 {
public static void main(String[] args){
	byte[] src = {0,1,2,3,4,5};
	byte[] dest = null;
	ByteArrayInputStream bis = new ByteArrayInputStream(src);
	ByteArrayOutputStream bos = new ByteArrayOutputStream(); // to print byte array stream
	
//	int data = bis.read(); 한번 읽었다 
	int data =-1;
	
	//data != -1 which means bis.read()
	while((data = bis.read())!= -1){
		bos.write(data); // read한 data를 write 함
	}
	
//	bis.close();
//	bos.close();
	dest = bos.toByteArray(); // 안에 있는 buffer를 만들어서 넘겨준다
	
	System.out.println(Arrays.toString(src));
	System.out.println(Arrays.toString(dest));
}
}
