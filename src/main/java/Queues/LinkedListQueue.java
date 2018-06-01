package Queues;

class Node {

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

public class LinkedListQueue {

	Node front, rear;
	int size;

	public LinkedListQueue() {
		size = 0;
		front = rear = null;
	}

	public boolean isEmpty() {
		return (size <= 0);
	}

	public void enqueue(int data) {

		Node newNode = new Node(data);

		if (isEmpty()) {
			front = newNode;
		} else {
			rear.next = newNode;
		}
		rear = newNode;
		size++;
	}

	public int dequeue() {
		if (size == 0) {
			throw new RuntimeException("Queue is Empty");
		}
		int data = front.data;
		front = front.next;

		if (front == rear) {
			rear = front;
		}
		size--;
		return data;
	}

	@Override
	public String toString() {
		System.out.println("Printing Values..... ");
		StringBuffer sb = new StringBuffer();
		/*for (Node temp = front; temp != rear.next; temp = temp.next) {
			int data = temp.data;
			sb.append(Integer.toString(data) + " ");
		}*/
		Node temp = front;
		while (temp != null) {
			int data = temp.data;
			sb.append(Integer.toString(data) + " ");
			temp = temp.next;
		}
		return sb.toString();
	}

}
