package Stacks;

public class DynaminArrayStackTest {

	public static void main(String[] args) {

		DynamicArrayStack stack = new DynamicArrayStack();

		for (int i = 1; i <= 100; i++) {
			stack.push(i);
		}

		System.out.println(stack.toString());

		for (int i = 1; i <= 50; i++) {
			stack.pop();
		}

		System.out.println(stack.toString());
	}
}
