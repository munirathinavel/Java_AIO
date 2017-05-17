package linkedlist.singlelinkedlist;

public class SingleLinkedListTest {

	public static void main(String[] args) {

		SingleLinkedList singleLinkedList = new SingleLinkedList();

		// insert in the beginning
		singleLinkedList.addFirst(15);
		singleLinkedList.addFirst(10);

		// insert in the ending
		singleLinkedList.addEnd(40);
		singleLinkedList.addEnd(7);

		singleLinkedList.traverse(singleLinkedList);

		System.out.println("After adding at position");

		// insert in the ending
		singleLinkedList.addAt(26, 0);
		singleLinkedList.addAt(26, 0);
		singleLinkedList.addAt(26, 0);

		// Insert in the middle
		singleLinkedList.addAt(4, 1);
		singleLinkedList.addAt(4, 1);
		singleLinkedList.addAt(4, 1);

		singleLinkedList.traverse(singleLinkedList);

		System.out.println("List After Delete First");
		// Deleting an element at first
		singleLinkedList.removeFirst();
		singleLinkedList.removeFirst();
		singleLinkedList.traverse(singleLinkedList);

		System.out.println("List After Delete Last");
		singleLinkedList.removeLast();
		singleLinkedList.removeLast();
		singleLinkedList.removeLast();

		singleLinkedList.traverse(singleLinkedList);

		System.out.println("List After Delete Last");
		// singleLinkedList.removeAt(-12);
		// singleLinkedList.removeAt(34);
		singleLinkedList.removeAt(0);
		singleLinkedList.removeAt(2);

		singleLinkedList.traverse(singleLinkedList);

	}
}
