package chapter03;

public class BoxTest {

	public static void main(String[] args){
		Box box = new Box();
		box.setObject("Hello");
		String s = (String)box.getObject(); 
		// return값이 box인데 그 값이 String인 것을 아니깐 사용
		// But, 뭐가 들어갔는 지 잘 모르는 경우엔??
		
		//Use generic!!!!
	}
}
