package chapter03;

public class StringTest3 {
public static void main(String[] args){
	
	String s = "aBcAbCabcABC"; //1)
	System.out.println(s.charAt(2));//2)
	
	System.out.println(s.indexOf("abc")); //3)
	System.out.println(s.indexOf('A')); // to show overloading of indexOf method (String / char)
	System.out.println(s.indexOf("abc", 8)); // 8: start at index 8
	
	System.out.println(s.length()); // array use field to find length of itself
	System.out.println(s.replaceAll("a","R")); //By using replaceAll(), just return String (not modify the value of s)
	System.out.println(s.substring(5)); // start at 5 to end
	System.out.println(s.substring(0, 3)); //start :0 end:2(end index-1)
	
	String s1 = " abc";
	String s2 = ",efg ";
	
	s1 = s1.concat(s2); // make a new String reference!
	System.out.println("---"+s1+"---"); // to check the space before & after result, we use "---" 
	
	s1 = s1.trim(); // remove the space of result(start/end part only)
	System.out.println("---"+s1+"---");
	
	String[] a = s1.split(","); //we need divider; 분리자?  -> return a array of two Strings
	
	//Now, array contains the String ; abc efg
	for(String tok : a){
		System.out.println(tok);
	}
	
	char[] ca = s1.toCharArray(); //split String and put it in a character array
	System.out.println(ca);			
	
	System.out.println(s1.toLowerCase());
	
	
	
	
}
}
