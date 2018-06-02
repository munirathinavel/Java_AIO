package TreeExamples;

import Tree.BinaryTree;
import Tree.BinaryTreeNode;

public class CheckBST {

	public static void main(String[] args) {

		BinaryTree binaryTree = new BinaryTree(4);
		BinaryTreeNode node5 = new BinaryTreeNode(2);
		BinaryTreeNode node2 = new BinaryTreeNode(5);
		BinaryTreeNode node1 = new BinaryTreeNode(1);
		BinaryTreeNode node4 = new BinaryTreeNode(3);
		BinaryTreeNode node6 = new BinaryTreeNode(6);

		binaryTree.add(binaryTree.root, "left", node5);
		binaryTree.add(binaryTree.root, "right", node2);
		binaryTree.add(node5, "left", node1);
		binaryTree.add(node5, "right", node4);
		binaryTree.add(node2, "left", node6);

		binaryTree.inOrder(binaryTree.root);

		boolean isBST = checkBST(binaryTree.root, Integer.MIN_VALUE, Integer.MAX_VALUE);
		System.out.println("Given Binary Tree is BST = " + isBST);

		isBST = checkBSTWithInOrderTraversal(binaryTree.root);
		System.out.println("Given Binary Tree is BST = " + isBST);
	}

	static boolean checkBST(BinaryTreeNode root, int min, int max) {
		if (root == null) {
			return true;
		}

		if (root.data < min || root.data > max) {
			return false;
		}

		return checkBST(root.left, min, root.data - 1) && checkBST(root.right, root.data + 1, max);
	}

	static int last = Integer.MIN_VALUE;

	static boolean checkBSTWithInOrderTraversal(BinaryTreeNode root) {
		// use inorder to traversal, if current node <= last node then false
		if (root.left == null || checkBSTWithInOrderTraversal(root.left)) {
			if (root.data <= last) {
				return false;
			}
			last = root.data;
			if (root.right == null || checkBSTWithInOrderTraversal(root.right)) {
				return true;
			}
		}
		return false;
	}

}
