package chapter03;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableTest {
	public static void main(String[] args) {
		// Map<String, Book> map = new Hashtable<String, Book>(); //Book의 data를
		// 가진
		Map<String, Integer> map = new Hashtable<String, Integer>();
		// map.put("one", new Integer(1));
		map.put("one", 1); // auto boxing!
		map.put("two", 2); // auto boxing!
		map.put("three", 3); // auto boxing!
		// map.put(key,value) // key값에 대한 hashmap 값<String, Integer>에 대한 값

		int i = map.get("one"); // auto unboxing
		System.out.println(i);

		map.put("one", 4); // one이라는 같은 key에 대해서 4로 덮어버림
		i = map.get("one");
		System.out.println(i);

		map.remove("one");
		Integer j = map.get("one"); // j가 object여야 null확인 가능 ->> ㅁj == null ->
									// 출력시 nullptrException -> key가 table안에 없음
		if (j != null) {
			System.out.println(j);
		}
		
		
		//Key set 가져오기 - key값 출력
		Set<String> set = map.keySet();
		Iterator<String> it =set.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println("key: "+s+",data:"+map.get(s));
		}
	}
}
