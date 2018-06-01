package Tree;

public class BinarySearchTreeTest {

	public static void main(String[] args) {

		BinarySearchTree bst = new BinarySearchTree(50);

		// Insert elements into the binary search tree
		bst.add(20);
		bst.add(55);
		bst.add(15);
		bst.add(60);
		bst.add(26);
		bst.add(54);
		bst.add(30);
		bst.add(28);
		bst.add(10);
		bst.add(18);

		// Print all elements from binary search tree
		bst.display();

		// Find elements in binary search tree
		System.out.println("Value 26 found is " + bst.find(26));
		System.out.println("Value 236 found is " + bst.find(236));
		System.out.println("Value 60 found is " + bst.find(60));

		// Find Minimum
		System.out.println("Minimum Value is " + bst.findMinimum());
		
		// Find Maximum
		System.out.println("Maximum Value is " + bst.findMaximum());

		System.out.println("Deleting 26 from binary search tree:" + bst.delete(20));
		bst.display();
	}

}
