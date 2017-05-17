package linkedlist.circularlinkedlist;

public class CircularLikedList {

	CLLNode head;
	int length;

	public void addFirst(int data) {
		CLLNode newNode = new CLLNode(data);

		if (head == null) {
			newNode.next = newNode;
			head = newNode;
		} else {
			CLLNode temp = head;
			do {
				temp = temp.next;
			} while (temp.next != head);

			temp.next = newNode;
			newNode.next = head;
			head = newNode;
		}
		length++;
	}

	public void printList() {
		if (head == null) {
			throw new RuntimeException("No elements in the list..");
		}
		CLLNode temp = head;
		do {
			System.out.println(temp.data);
			temp = temp.next;
		} while (temp != head);

	}

	public void addLast(int data) {
		CLLNode newNode = new CLLNode(data);

		if (head == null) {
			newNode.next = newNode;
			head = newNode;
		} else {
			CLLNode temp = head;
			do {
				temp = temp.next;
			} while (temp.next != head);

			newNode.next = head;
			temp.next = newNode;
		}
		length++;
	}

	public void addAt(int data, int position) {

		if (position > length || length < 0) {
			throw new RuntimeException("Index out of bound exception");
		}

		CLLNode newNode = new CLLNode(data);

		if (head == null) {
			newNode.next = newNode;
			head = newNode;
		} else if (position == 0) {

			CLLNode temp = head;
			do {
				temp = temp.next;
			} while (temp.next != head);

			newNode.next = head;
			temp.next = newNode;
			head = newNode;

		} else {
			CLLNode temp = head;
			int i = 0;
			while (i < position - 1) {
				temp = temp.next;
				i++;
			}

			newNode.next = temp.next;
			temp.next = newNode;
		}
		length++;
	}

	public void removeFirst() {
		CLLNode temp = head;

		do {
			temp = temp.next;
		} while (temp.next != head);

		head = head.next;
		temp.next = head;

		length--;
	}

	public void removeLast() {
		CLLNode temp = head;

		if (head == null) {
			throw new RuntimeException("No elements found");
		}
		if (temp.next == head || length == 1) {
			head = null;
		} else if (temp.next.next == head || length == 2) {
			temp.next = head;
		}
		while (temp.next.next != head) {
			temp = temp.next;
		}
		temp.next = head;
		length--;
	}

	public void removeAt(int position) {

		if (position > length || length < 0) {
			throw new RuntimeException("Index out of bound exception");
		}

		if (head == null) {
			throw new RuntimeException("No elements found");
		} else if (position == 0) {
			CLLNode temp = head;
			do {
				temp = temp.next;
			} while (temp.next != head);
			head = head.next;
			temp.next = head;
		} else {
			CLLNode temp = head;
			int i = 0;
			while (i < position - 1) {
				temp = temp.next;
				i++;
			}
			temp.next = temp.next.next;
		}
		length--;
	}

}
