package linkedlist.singlelinkedlist;

public class Node {

	int data;
	Node next;

	// Initializing new node.
	public Node(int data) {
		this.data = data;
		this.next = null;
	}

	@Override
	public String toString() {
		return data + "";
	}
}
