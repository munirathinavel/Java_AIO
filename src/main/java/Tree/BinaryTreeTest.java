package Tree;

public class BinaryTreeTest {

	public static void main(String[] args) {
		BinaryTreeNode node1 = new BinaryTreeNode(10);
		BinaryTreeNode node2 = new BinaryTreeNode(20);
		BinaryTreeNode node3 = new BinaryTreeNode(27);
		BinaryTreeNode node4 = new BinaryTreeNode(15);
		BinaryTreeNode node5 = new BinaryTreeNode(75);

		BinaryTree binaryTree = new BinaryTree(5);
		binaryTree.add(binaryTree.root, "left", node1);
		binaryTree.add(binaryTree.root, "right", node2);
		binaryTree.add(node1, "right", node3);
		binaryTree.add(node2, "left", node4);
		binaryTree.add(node4, "right", node5);

		boolean found = binaryTree.find(binaryTree.root, 75);
		System.out.println("Value found = "+ found);

		binaryTree.traverse(binaryTree.root);
		
		System.out.println("Pre-Order Traversal...");
		binaryTree.preOrder(binaryTree.root);
		
		System.out.println("In-Order Traversal...");
		binaryTree.inOrder(binaryTree.root);
		
		System.out.println("Post-Order Traversal...");
		binaryTree.postOrder(binaryTree.root);
	}
}
