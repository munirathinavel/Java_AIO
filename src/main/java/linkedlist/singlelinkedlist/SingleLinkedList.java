package linkedlist.singlelinkedlist;

public class SingleLinkedList {

	Node head;
	int length = 0;

	void addFirst(int data) {

		// Creating New Node.
		Node newNode = new Node(data);

		// Check if the list is not null
		if (head != null) {
			newNode.next = head;
		}
		head = newNode;
		length++;

	}

	// This method is used to print all values in the list.
	void traverse(SingleLinkedList list) {

		Node temp = list.head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	// This method is used to add elements at the end of the List.
	public void addEnd(int i) {
		Node temp = head;

		while (temp.next != null) {
			temp = temp.next;
		}

		Node newNode = new Node(i);
		temp.next = newNode;
		length++;
	}

	public void addAt(int data, int position) {

		if (position < 0) {
			throw new RuntimeException("Invalid position: below lower limit");
		}

		if (position > length) {
			throw new RuntimeException("Invalid position: above upper limit");
		}
		if (head == null) {
			head = new Node(data);
		} else if (position == 0) {
			Node newNode = new Node(data);
			newNode.next = head;
			head = newNode;
		} else {
			Node temp = head;
			int k = 0;
			while (temp != null && k < position - 1) {
				k++;
				temp = temp.next;
			}
			/*
			 * for (int i = 0; i < position; i++) { temp = temp.next; }
			 */
			Node newNode = new Node(data);
			newNode.next = temp.next;
			temp.next = newNode;
		}

		length++;
	}

	public void removeFirst() {
		Node deleteNode = head;
		head = head.next;
		deleteNode = null;
		length--;
	}

	public void removeLast() {
		Node temp = head;
		Node previous = null;

		if (head.next == null) {
			head = null;
		}

		while (temp.next != null) {
			previous = temp;
			temp = temp.next;

		}
		previous.next = null;
		temp = null;
		length--;

	}

	public void removeAt(int position) {

		if (position < 0) {
			throw new RuntimeException("Below Lower Bound");
		}

		if (position > length) {
			throw new RuntimeException("Apove Lower Bound");
		}

		if (head.next == null) {
			head = null;
		}

		if (position == 0) {
			Node temp = head;
			head = head.next;
			temp = null;
			return;
		}

		Node temp = head;
		int i = 0;
		while (temp != null && i < position - 1) {
			temp = temp.next;
			i++;
		}

		Node deleteNode = temp.next;
		temp.next = temp.next.next;
		deleteNode = null;
	}

	int getSize() {
		return length;
	}

}
