package Tree;

public class BinarySearchTree {

	BSTNode root;

	public BinarySearchTree(int data) {
		root = new BSTNode(data);
	}

	public void add(int data) {
		BSTNode newNode = new BSTNode(data);
		BSTNode current = root;
		if (current == null) {
			current = newNode;
		}
		BSTNode parent;
		while (true) {
			parent = current;

			if (current.data > data) {
				current = current.left;
				if (current == null) {
					parent.left = newNode;
					return;
				}
			} else {
				current = current.right;
				if (current == null) {
					parent.right = newNode;
					return;
				}
			}
		}
	}

	public int findMinimum() {
		if (root == null) {
			throw new RuntimeException("Tree is empty..");
		}
		BSTNode current = root;
		int minimumValue = 0;

		while (current != null) {
			minimumValue = current.data;
			current = current.left;
		}
		return minimumValue;
	}
	
	public int findMaximum() {
		if (root == null) {
			throw new RuntimeException("Tree is empty..");
		}
		BSTNode current = root;
		int minimumValue = 0;

		while (current != null) {
			minimumValue = current.data;
			current = current.right;
		}
		return minimumValue;
	}

	public void display() {
		traverse(root);
	}

	private void traverse(BSTNode root) {
		if (root != null) {
			traverse(root.left);
			System.out.println(root.data);
			traverse(root.right);
		}
	}

	public boolean find(int data) {

		BSTNode current = root;
		while (current != null) {
			if (current.data == data) {
				return true;
			}
			if (current.data > data) {
				current = current.left;
			} else {
				current = current.right;
			}
		}
		return false;
	}

	public boolean delete(int data) {

		BSTNode current = root;
		BSTNode parent = root;
		boolean isLeftChild = false;

		while (current.data != data) {
			parent = current;
			if (current.data > data) {
				current = current.left;
				isLeftChild = true;
			} else {
				current = current.right;
				isLeftChild = false;
			}

			if (current == null) {
				return false;
			}
		}

		if (current.left == null && current.right == null) {
			if (current == root) {
				root = null;
			}

			if (isLeftChild) {
				parent.left = null;
			} else {
				parent.right = null;
			}
		} else if (current.left == null) {

			if (current == root) {
				root = current.right;
			}
			if (isLeftChild) {
				parent.left = current.right;
			} else {
				parent.right = current.right;
			}
		} else if (current.right == null) {

			if (current == root) {
				root = current.left;
			}

			if (isLeftChild) {
				parent.left = current.left;
			} else {
				parent.right = current.left;
			}
		} else if (current.left != null && current.right != null) {

			BSTNode successor = findSuccessor(current);

			if (current == root) {
				successor = root;
			} else if (isLeftChild) {
				parent.left = successor;
			} else {
				parent.right = successor;
			}
			successor.left = current.left;
		}
		return true;
	}

	private BSTNode findSuccessor(BSTNode deleteNode) {
		BSTNode successor = null;
		BSTNode successorParent = null;
		BSTNode current = deleteNode.right;

		while (current != null) {
			successorParent = successor;
			successor = current;
			current = current.left;
		}

		if (successor != deleteNode.right) {
			successorParent.left = successor.right;
			successor.right = deleteNode.right;
		}

		return successor;

	}
}
