package Stacks;

public class DynamicArrayStack {

	int top = -1;
	static int capacity = 10;
	int stack[];
	int MINCAPACITY = 1 << 1;

	public DynamicArrayStack() {
		this(capacity);
	}

	public DynamicArrayStack(int capacity) {
		FixedArrayStack.capacity = capacity;
		this.stack = new int[capacity];
	}

	public void push(int data) {
		if (getSize() == capacity) {
			expand();
		}
		stack[++top] = data;
	}

	// Expand the size of the array.
	private void expand() {
		int newStack[] = new int[capacity * 2];
		System.arraycopy(stack, 0, newStack, 0, getSize());
		stack = newStack;
		this.capacity = this.capacity * 2;
	}

	public int pop() {
		if (isEmpty()) {
			throw new RuntimeException("Stack Underflow Exception..");
		}
		int data = stack[top];
		stack[top--] = Integer.MIN_VALUE;
		shrink();
		return data;
	}

	// dynamic array operation: shrinks to 1/2 if more than than 1/2 empty
	@SuppressWarnings("unused")
	private void shrink() {
		if (getSize() < (capacity / 2)) {
			capacity = capacity / 2;
			int newStack[] = new int[capacity];
			System.arraycopy(stack, 0, newStack, 0, getSize());
			stack = newStack;
		}
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
