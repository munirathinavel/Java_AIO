package Stacks;

public class FixedArrayStack {

	int top = -1;
	static int capacity = 10;
	int stack[];

	public FixedArrayStack() {
		this(capacity);
	}

	public FixedArrayStack(int capacity) {
		FixedArrayStack.capacity = capacity;
		this.stack = new int[capacity];
	}

	public void push(int data) {
		if (getSize() == capacity) {
			throw new RuntimeException("Stack Overflow Exception..");
		}
		stack[++top] = data;
	}

	public int pop() {
		if (isEmpty()) {
			throw new RuntimeException("Stack Underflow Exception..");
		}
		int data = stack[top];
		stack[top--] = Integer.MIN_VALUE;
		return data;
	}

	public int getTop() {
		if (isEmpty()) {
			throw new RuntimeException("Stack is Empty");
		}
		return stack[top];
	}

	public int getSize() {
		return top + 1;
	}

	public boolean isEmpty() {
		return (top < 0);

	}

	@Override
	public String toString() {
		String s;
		s = "[";
		if (getSize() > 0)
			s += stack[0];
		if (getSize() > 1)
			for (int i = 1; i <= getSize() - 1; i++) {
				s += ", " + stack[i];
			}
		return s + "]";
	}
}
