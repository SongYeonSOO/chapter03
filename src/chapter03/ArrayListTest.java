package chapter03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("고길동");
		list.add("마이콜");
		list.add("둘리");
		
		list.remove(2);
		
		
		//case1
		int size = list.size();
		for(int i=0;i<size;i++){
			String s = list.get(i);
			System.out.println(s);
		}


		//case2 Use Iterator object.
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}
		
		//case 3 Use enhanced for loop.
		for(String s : list){
			System.out.println(s);
		}
	}

}
