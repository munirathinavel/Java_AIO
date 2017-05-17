package Queues;

public class DynamicArrayQueue {

	int size;
	int front;
	int rear;
	int capacity = 16;
	int[] queue;

	public DynamicArrayQueue() {
		queue = new int[capacity];
		size = front = rear = 0;
	}

	public DynamicArrayQueue(int capacity) {
		queue = new int[capacity];
		size = front = rear = 0;
		this.capacity = capacity;
	}

	public void enqueue(int data) {
		if (rear == capacity) {
			expand();
		}
		queue[rear % capacity] = data;
		rear = rear + 1;
		size++;
	}

	private void expand() {
		int[] newQueue = new int[size * 2];

		/*
		 * for (int i = front; i < rear; i++) { newQueue[i = front] = queue[i %
		 * capacity]; } queue = newQueue; front = 0; rear = size - 1; capacity =
		 * capacity * 2;
		 */
		System.out.println("Expanding Queue..");
		System.arraycopy(queue, front, newQueue, 0, size);
		queue = newQueue;
		capacity = capacity * 2;
	}

	public int dequeue() {
		if (size == 0) {
			throw new RuntimeException("Queue is Empty");
		}
		shrink();
		int temp = queue[front % capacity];
		queue[front % capacity] = Integer.MIN_VALUE;
		front = front + 1;
		size--;
		return temp;
	}

	private void shrink() {
		if (size < capacity / 2) {

			System.out.println("Shrinking Queue now...");
			int[] newQueue = new int[capacity / 2];
			System.arraycopy(queue, front, newQueue, 0, size);
			queue = newQueue;
			capacity = capacity / 2;
		}
	}

	@Override
	public String toString() {
		System.out.println("Printing Values..... ");
		StringBuffer sb = new StringBuffer();
		for (int i = front; i < rear; i++) {
			int temp = queue[i % capacity];

			if (temp != Integer.MIN_VALUE) {
				sb.append(Integer.toString(temp) + " ");
			}
		}
		return sb.toString();
	}

}
