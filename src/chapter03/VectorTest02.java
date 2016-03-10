package chapter03;

import java.util.List;
import java.util.Vector;

public class VectorTest02 {
public static void main(String[] args){
	List<String> list = new Vector<String>();
	list.add("고길동");
	list.add("마이콜");
	list.add("둘리");
	
	list.remove(2);
	int size = list.size();
	for(int i=0;i<size;i++){
		String s = list.get(i);
		System.out.println(s);
	}
}
}
