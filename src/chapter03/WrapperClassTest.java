package chapter03;

public class WrapperClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer i = new Integer(10);
		System.out.println(i);
		
		Integer i2 = new Integer("1000"); // Automatically .ParseInt()
		System.out.println(i2);
		
		Integer i3 = 10; // autoBoxing
		//this code means
		//Integer i3 = new Integer(10);
		System.out.println(i3);
		
		
		int i4 = i3+100;
		//this code means 
		//int i4 = i3.intValue() +100; 
		System.out.println(i4);
		
		//literal pool
		Integer i10 = 100;
		Integer i20 = 100;
		System.out.println(i10 == i20);
		
		
		System.out.println(Character.isDigit('c'));
		System.out.println(Character.isDigit('1'));
		
		int i5 = Character.getNumericValue('1');
		System.out.println(i5);
		
		System.out.println(Integer.parseInt("12345"));
		System.out.println(Integer.parseInt("ff", 16));
		System.out.println(Integer.toHexString(12345)); // 10 -> 16
		System.out.println(Double.parseDouble("2.145343"));
		
		
		// this is the end of java.lang package
	}
}
