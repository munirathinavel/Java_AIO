package linkedlist.doublelinkedlist;

public class DoubleLinkedListTest {

	public static void main(String[] args) {

		DoubleLinkedList doubleLinkedList = new DoubleLinkedList();

		doubleLinkedList.addFirst(230);
		doubleLinkedList.addFirst(26);

		// doubleLinkedList.traverse();

		// doubleLinkedList.addFirst(1);
		// doubleLinkedList.addFirst(2);

		// doubleLinkedList.traverse();

		doubleLinkedList.addLast(10);
		doubleLinkedList.addLast(11);
		// doubleLinkedList.addLast(12);

		doubleLinkedList.traverse();

		// doubleLinkedList.addAt(7, -456);
		// doubleLinkedList.addAt(7, 569);

		// doubleLinkedList.addAt(54, 2);
		doubleLinkedList.addAt(333, 1);

		doubleLinkedList.traverse();

		System.out.println("Removing elements from the list");

		doubleLinkedList.removeFirst();
		// doubleLinkedList.removeFirst();

		doubleLinkedList.traverse();

		doubleLinkedList.removeLast();
		// doubleLinkedList.removeLast();

		doubleLinkedList.traverse();

		doubleLinkedList.removeAt(1);

		doubleLinkedList.traverse();

		doubleLinkedList.removeAt(0);

		doubleLinkedList.traverse();

	}
}
