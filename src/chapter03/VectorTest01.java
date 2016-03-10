package chapter03;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest01 {

	
	//before 1.2 collection framework
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vector = new Vector<String>();
		
		vector.addElement("둘리");
		vector.addElement("고길동");
		vector.addElement("마이콜");
		
		vector.removeElementAt(2); // remove 2nd element
		int size = vector.size();
		
		//case 1
		for(int i=0;i<size;i++){
			String s = vector.elementAt(i);
			System.out.println(s);
		}
		
		//case 2
		Enumeration<String> e = vector.elements(); // Vector만 사용가능  옛날에 순회했던 방식
		while(e.hasMoreElements()){
			String s = e.nextElement();
			System.out.println(s);
		}
		
		
		
	}

}
