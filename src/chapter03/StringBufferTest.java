package chapter03;

public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("this");
		System.out.println(sb);

		sb.append(" is pencil");
		// sb.append(100);
		System.out.println(sb);

		sb.insert(7, "my");
		System.out.println(sb);
		
		sb.setLength(5);
		System.out.println(sb);
		
		
		StringBuffer sb2 = new StringBuffer("This");
		sb2.append(" is pencil").insert(7, " my");
		System.out.println(sb2);
		
		
		//+ 연산자 변환 
		
		//case1
		String s = "Hello" + 1234 + "world";
		
		
		//case2
		StringBuffer sb3 = new StringBuffer("Hello");
		sb3.append(1234).append("world");
		
		
		//case 3
		String s2 = new StringBuffer("Hello").append(1234).append("world").toString();
		
		// case 1~3 are same!!!!! process of StringBuffer!!!!
	}
}
