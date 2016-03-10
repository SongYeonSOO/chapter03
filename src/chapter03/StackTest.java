package chapter03;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>(); // 안에 String을 넣을 것임

		stack.push("둘리");
		stack.push("마이콜");
		stack.push("길동");

		String s = stack.pop(); // data가 빠져나오면서 버리는게 아니고 가져온다고 보면됨
		System.out.println(s);
		System.out.println(stack.size()); // pop한 후, stack size -> 2

		s = stack.peek();
		System.out.println(s);
		System.out.println(stack.size());
		stack.pop();
		stack.pop();

		System.out.println(stack.size());

		if (stack.isEmpty() == false) {
			stack.pop();
			/// 시험에 나온다 stack구현

			Queue<String> queue = new LinkedList<String>();

			queue.offer("A");
			queue.offer("B");
			queue.offer("C");

			s = queue.poll();
			System.out.println(s);
			System.out.println(queue.size());
			queue.poll();
			queue.poll();

		}
	}
}
