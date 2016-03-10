package chapter03;

public class StringTest01 {
 public static void main(String[] args){
	 
	 String str = "Hello Java";
	 System.out.println(str);
	 
	 String str1 = "Hello \"Java\""; // use \" to print "
	 System.out.println(str1);
	 
	 String dir = "C:\\data";
	 System.out.println(dir);
	 
	 
	 String str3 = new String("Hello");
	 String str4 = new String("Hello");
	 System.out.println(str3.hashCode() == str4.hashCode());
 }
}
