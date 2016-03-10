package chapter03;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {
	public static void main(String[] args){
		
		Set<String> set = new HashSet<String>();
		
		set.add("둘리");
		set.add("마이콜");
		set.add("길동");
		set.remove("마이콜");
		set.add("희동");
		
		System.out.println(set.contains("둘리"));
		Iterator<String> it = set.iterator();
		while(it.hasNext()){		//set안에 더 있으면
			String s = it.next();
			System.out.println(s);
		}
		
		
		for(String s:set){
			System.out.println(s);
		}
		

	}
}
