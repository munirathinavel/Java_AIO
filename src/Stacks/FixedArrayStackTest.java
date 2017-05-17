package Stacks;

public class FixedArrayStackTest {

	public static void main(String[] args) {

		FixedArrayStack stack = new FixedArrayStack();

		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);

		System.out.println(stack.toString());

		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();

		System.out.println(stack.toString());
	}
}
