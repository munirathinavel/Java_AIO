package TreeExamples;

public class BST {

	Node root;

	void insert(int data) {
		if (root == null) {
			root = new Node(data);
		} else {
			insertRecursively(data, root);
		}
	}

	private void insertRecursively(int data, Node root) {
		if (data > root.data) {
			if (root.right == null) {
				root.right = new Node(data);
				return;
			}
			insertRecursively(data, root.right);
		} else if (data <= root.data) {
			if (root.left == null) {
				root.left = new Node(data);
				return;
			}
			insertRecursively(data, root.left);
		}

	}

	public void inOrderTraversal() {
		System.out.println("BST values are:");
		inOrderTraversal(root);
	}

	private void inOrderTraversal(Node root) {
		if (root == null) {
			return;
		}

		inOrderTraversal(root.left);
		System.out.print(root.data + " ");
		inOrderTraversal(root.right);

	}
}
