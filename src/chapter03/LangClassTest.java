package chapter03;

public class LangClassTest {
	public static void main(String[] args) {

		Point point = new Point();
		Point p = new Point(2, 3);
		Point p2 = new Point(2,3);
		Point p3 = p;
		
		System.out.println(point.getClass().getName());
		System.out.println(point.hashCode()); // 객체를 유일하게 구분할 수 있는 정수 id
		System.out.println(point.toString());
		System.out.println(point);
		System.out.println();
		System.out.println(p.getClass().getName());
		System.out.println(p.hashCode()); // 객체를 유일하게 구분할 수 있는 정수 id
		System.out.println(p.toString());
		System.out.println(p);
		
		System.out.println(p == p2);
		System.out.println(p.equals(p2));
		System.out.println(p == p3);
		System.out.println(p.equals(p3));
		System.out.println(p.hashCode() == p2.hashCode());


	}

}
