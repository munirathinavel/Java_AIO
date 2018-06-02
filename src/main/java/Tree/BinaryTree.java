package Tree;

public class BinaryTree {

	public BinaryTreeNode root;

	public BinaryTree(int data) {
		root = new BinaryTreeNode(data);
	}

	public void add(BinaryTreeNode parent, String orientation, BinaryTreeNode child) {

		if (("left").equals(orientation)) {
			parent.left = child;
		} else if (("right").equals(orientation)) {
			parent.right = child;
		}
	}

	public void traverse(BinaryTreeNode tree) {
		if (tree == null) {
			throw new RuntimeException("Empty Binary Tree");
		} else if (tree.left == null & tree.right == null) {
			System.out.println(tree.data);
		} else {
			System.out.println(tree.data);
			if (tree.left != null) {
				traverse(tree.left);
			}
			if (tree.right != null) {
				traverse(tree.right);
			}
		}
	}

	public boolean find(BinaryTreeNode tree, int data) {
		if (tree == null) {
			return false;
		} else if (tree.data == data) {
			return true;
		} else {
			return find(tree.left, data) || find(tree.right, data);
		}
	}

	public void preOrder(BinaryTreeNode tree) {
		if (tree != null) {
			System.out.println(tree.data);
			preOrder(tree.left);
			preOrder(tree.right);
		}
	}

	public void inOrder(BinaryTreeNode tree) {
		if (tree != null) {
			inOrder(tree.left);
			System.out.println(tree.data);
			inOrder(tree.right);
		}
	}

	public void postOrder(BinaryTreeNode tree) {
		if (tree != null) {
			postOrder(tree.left);
			postOrder(tree.right);
			System.out.println(tree.data);
		}
	}

}
