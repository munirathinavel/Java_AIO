package linkedlist.singlelinkedlist;

public class NThPosition {
	public static void main(String[] args) {

		SingleLinkedList singleLinkedList = new SingleLinkedList();

		// insert in the beginning
		singleLinkedList.addFirst(15);
		singleLinkedList.addFirst(10);

		// insert in the ending
		singleLinkedList.addEnd(40);
		singleLinkedList.addEnd(7);

		// insert in the beginning
		singleLinkedList.addFirst(15);
		singleLinkedList.addFirst(10);

		// insert in the ending
		singleLinkedList.addEnd(40);
		singleLinkedList.addEnd(7);
		// insert in the beginning
		singleLinkedList.addFirst(15);
		singleLinkedList.addFirst(10);

		// insert in the ending
		singleLinkedList.addEnd(40);
		singleLinkedList.addEnd(7);

		nthNoFromEnd(singleLinkedList, 4);

		singleLinkedList.traverse(singleLinkedList);

		printNthFromLast(4, singleLinkedList);

		System.out.println(nthNodeFromEndIterative(singleLinkedList.head, 4));
	}

	private static void nthNoFromEnd(SingleLinkedList list, int nThPosition) {
		int count = 0;
		Node nThElement = list.head;
		Node temp = list.head;
		while (count < nThPosition) {
			temp = temp.next;
			count++;
		}

		while (temp != null) {
			temp = temp.next;
			nThElement = nThElement.next;
		}

		System.out.println("Element value is" + nThElement.data + " at position=" + nThPosition);
	}

	/* Function to get the nth node from end of list */
	static void printNthFromLast(int n, SingleLinkedList list) {
		Node main_ptr = list.head;
		Node ref_ptr = list.head;

		int count = 0;
		if (list.head != null) {
			while (count < n) {
				if (ref_ptr == null) {
					System.out.println(n + " is greater than the no " + " of nodes in the list");
					return;
				}
				ref_ptr = ref_ptr.next;
				count++;
			}
			while (ref_ptr != null) {
				main_ptr = main_ptr.next;
				ref_ptr = ref_ptr.next;
			}
			System.out.println("Node no. " + n + " from last is " + main_ptr.data);
		}
	}

	public static Node nthNodeFromEndIterative(Node head, int Nth) {
		if (head == null) {
			return null;
		}
		Node nth = head;
		// Get nth from the start
		for (int i = 0; i < Nth; i++) {
			if (nth.next == null) {
				return null;
			}
			nth = nth.next;
		}
		// Move both the head and nth node so the difference between them is n
		// Thus we get the nth node from the end
		while (nth != null) {
			head = head.next;
			nth = nth.next;
		}
		return head;
	}
}
