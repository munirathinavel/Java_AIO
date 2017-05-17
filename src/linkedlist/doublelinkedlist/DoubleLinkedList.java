package linkedlist.doublelinkedlist;

public class DoubleLinkedList {

	DLLNode head;
	DLLNode tail;
	int length;

	/*
	 * public DoubleLinkedList() { head = new DLLNode(Integer.MIN_VALUE, null,
	 * null); tail = new DLLNode(Integer.MIN_VALUE, head, null); }
	 */
	public void addFirst(int data) {

		if (head == null) {
			head = tail = new DLLNode(data);
		} else {
			DLLNode newNode = new DLLNode(data);
			newNode.next = head;
			head.previous = newNode;
			head = newNode;
		}
		length++;
	}

	public void addLast(int data) {
		if (tail == null) {
			head = tail = new DLLNode(data);
		} else {
			DLLNode temp = tail;
			DLLNode newNode = new DLLNode(data);
			newNode.previous = temp;
			temp.next = newNode;
			tail = newNode;
		}
		length++;
	}

	public void addAt(int data, int position) {

		if (position < 0) {
			throw new RuntimeException("Below lower bound");
		}
		if (position > length) {
			throw new RuntimeException("Above lower bound");
		}

		if (head == null) {
			tail = head = new DLLNode(data);
		} else if (position == 0) {
			DLLNode newNode = new DLLNode(data);
			newNode.next = head;
			head.previous = newNode;
			head = newNode;
		} else {
			DLLNode temp = head;
			int i = 0;
			while (i < position - 1) {
				i++;
				temp = temp.next;
			}

			DLLNode newNode = new DLLNode(data);

			newNode.next = temp.next;
			newNode.previous = temp;
			temp.next.previous = newNode;
			temp.next = newNode;
		}
		length++;
	}

	public void traverse() {

		System.out.println("Printing Values in the List");
		if (head == null) {
			throw new RuntimeException("No elements in the list");
		}

		DLLNode temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}

	}

	public void removeFirst() {

		if (head == null) {
			throw new RuntimeException("No elements in the list");
		}
		DLLNode temp = head;
		temp = null;
		head = head.next;
		head.previous = null;
		length--;
	}

	public void removeLast() {

		if (tail == null) {
			throw new RuntimeException("No elements in the list");
		}

		DLLNode temp = tail.previous;
		temp.next = null;
		tail = temp;
		temp = null;
		length--;
	}

	public void removeAt(int position) {

		if (position < 0) {
			throw new RuntimeException("Below lower bound");
		}
		if (position > length) {
			throw new RuntimeException("Above lower bound");
		}

		if (head == null) {
			throw new RuntimeException("No elements in the list");
		}

		if (position == 0) {
			DLLNode temp = head;
			temp = null;
			head = head.next;
			head.previous = null;
		} else {
			DLLNode temp = head;
			int i = 0;
			while (i < position - 1) {
				i++;
				temp = temp.next;
			}
			temp.next = temp.next.next;
			temp.next.previous = temp;
		}
		length--;
	}

	@Override
	public String toString() {
		String s = "";
		DLLNode temp = head;
		while (temp != null) {
			s = s + "" + temp.getData();
			temp = temp.next;
		}

		return super.toString();
	}

}
