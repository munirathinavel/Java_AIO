package linkedlist.circularlinkedlist;

public class CircularLinkedListTest {

	public static void main(String[] args) {

		CircularLikedList circularLikedList = new CircularLikedList();

		// Add elements at First
		circularLikedList.addFirst(3);
		circularLikedList.addFirst(2);
		circularLikedList.addFirst(1);

		// print elements after adding at first
		System.out.println("Print elements after adding at first");

		circularLikedList.printList();

		// Add elements at Last
		circularLikedList.addLast(3);
		circularLikedList.addLast(2);
		circularLikedList.addLast(1);

		// print elements after adding at first
		System.out.println("Print elements after adding at last");

		circularLikedList.printList();

		// Add elements at Last
		circularLikedList.addAt(10, 0);
		circularLikedList.addAt(150, 0);
		circularLikedList.addAt(11, 3);
		// circularLikedList.addAt(12, 100);

		// print elements after adding at first
		System.out.println("Print elements after adding at last");

		circularLikedList.printList();

		// Remove elements at First
		circularLikedList.removeFirst();
		circularLikedList.removeFirst();

		// Print elements after removing at first
		System.out.println("Print elements after removing at first");

		circularLikedList.printList();

		// Remove elements at Last
		circularLikedList.removeLast();
		circularLikedList.removeLast();

		// Print elements after removing at Last
		System.out.println("Print elements after removing at Last");

		circularLikedList.printList();

		// Remove elements at Middle
		circularLikedList.removeAt(0);
		circularLikedList.removeAt(1);
		circularLikedList.removeAt(2);

		// Print elements after removing at Middle
		System.out.println("Print elements after removing at Middle");

		circularLikedList.printList();
	}

}
