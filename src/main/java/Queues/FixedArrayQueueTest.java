package Queues;

public class FixedArrayQueueTest {

	public static void main(String[] args) {

		FixedArrayQueue queue = new FixedArrayQueue();

		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);

		System.out.println(queue.toString());

		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();

		System.out.println(queue.toString());

		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);

		System.out.println(queue.toString());

		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();

		System.out.println(queue.toString());
	}

}
