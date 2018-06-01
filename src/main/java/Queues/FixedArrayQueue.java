package Queues;

public class FixedArrayQueue {

	int size;
	int front;
	int rear;
	int capacity = 16;
	int[] queue;

	public FixedArrayQueue() {
		queue = new int[capacity];
		size = front = rear = 0;
	}

	public FixedArrayQueue(int capacity) {
		queue = new int[capacity];
		size = front = rear = 0;
	}

	public void enqueue(int data) {
		if (rear == capacity) {
			throw new RuntimeException("Queue is full");
		}
		queue[rear] = data;
		rear = rear + 1;
		size++;
	}

	public int dequeue() {
		if (size == 0) {
			throw new RuntimeException("Queue is Empty");
		}
		int temp = queue[front];
		front = front + 1;
		size--;
		return temp;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (int i = front; i < rear; i++) {
			sb.append(Integer.toString(queue[i]) + " ");
		}
		return sb.toString();
	}

}
