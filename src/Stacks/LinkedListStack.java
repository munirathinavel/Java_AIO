package Stacks;

public class LinkedListStack {

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	Node top = null;
	int length = 0;

	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = top;
		top = newNode;
		length++;
	}

	public int pop() {

		if (top == null) {
			throw new RuntimeException("Stack is empty..");
		} else {
			top = top.next;
			length--;
			return top.data; // return this value
		}
	}

	public boolean isEmpty() {
		return length == 0;
	}

	public int getPeek() {
		if (isEmpty()) {
			throw new RuntimeException("Stack is Empty");
		}
		return top.data;
	}

	public int size() {
		return length;
	}
;
	@Override
	public String toString() {
		Node temp = top;
		StringBuffer sb = new StringBuffer("[");
		while (temp != null) {
			sb = sb.append("," + temp.data);
			temp = temp.next;
		}
		sb.append("]");

		return sb.toString();
	}

}
