package TreeExamples;

import Tree.BinaryTree;
import Tree.BinaryTreeNode;

class Result {
	BinaryTreeNode node;
	boolean isAncestor;

	public Result(BinaryTreeNode node, boolean isAncestor) {
		this.node = node;
		this.isAncestor = isAncestor;
	}
}

public class LowestCommonAncestor {

	public static void main(String[] args) {
		/**
		 * 
		 * 4 2 5 1 3 6
		 * 
		 */

		BinaryTree binaryTree = new BinaryTree(4);
		BinaryTreeNode node2 = new BinaryTreeNode(2);
		BinaryTreeNode node5 = new BinaryTreeNode(5);
		BinaryTreeNode node1 = new BinaryTreeNode(1);
		BinaryTreeNode node3 = new BinaryTreeNode(3);
		BinaryTreeNode node6 = new BinaryTreeNode(6);

		binaryTree.add(binaryTree.root, "left", node2);
		binaryTree.add(binaryTree.root, "right", node5);
		binaryTree.add(node2, "left", node1);
		binaryTree.add(node2, "right", node3);
		binaryTree.add(node5, "left", node6);

		binaryTree.inOrder(binaryTree.root);

		long startTime = System.nanoTime();
		Result result = lca(binaryTree.root, node2, node5);
		if (result.isAncestor) {
			System.out.println(
					"Lowest common Ancestor between 2 & 5 is:" + (result.node == null ? "null" : result.node.data));
		}

		result = lca(binaryTree.root, node2, node6);
		if (result.isAncestor) {
			System.out.println(
					"Lowest common Ancestor between 2 & 6 is:" + (result.node == null ? "null" : result.node.data));
		}

		result = lca(binaryTree.root, node3, node6);
		if (result.isAncestor) {
			System.out.println(
					"Lowest common Ancestor between 3 & 6 is:" + (result.node == null ? "null" : result.node.data));
		}

		result = lca(binaryTree.root, node1, node2);
		if (result.isAncestor) {
			System.out.println(
					"Lowest common Ancestor between 1 & 2 is:" + (result.node == null ? "null" : result.node.data));
		}
		System.out.println("\n Time Taken for LCA ==" + (System.nanoTime() - startTime) + " \n");

		BinaryTreeNode node = lca2(binaryTree.root, node2, node5);

		startTime = System.nanoTime();
		System.out.println("Lowest common Ancestor between 2 & 5 is:" + node.data);

		node = lca2(binaryTree.root, node2, node6);
		System.out.println("Lowest common Ancestor between 2 & 6 is:" + node.data);

		node = lca2(binaryTree.root, node3, node6);
		System.out.println("Lowest common Ancestor between 3 & 6 is:" + node.data);

		node = lca2(binaryTree.root, node1, node2);
		System.out.println("Lowest common Ancestor between 1 & 2 is:" + node.data);
		System.out.println("\n Time Taken for LCA2 ==" + (System.nanoTime() - startTime) + " \n");
	}

	static BinaryTreeNode lca2(BinaryTreeNode root, BinaryTreeNode p, BinaryTreeNode q) {

		if (root == null) {
			return null;
		}

		if (root.data == p.data || root.data == q.data) {
			return root;
		}

		BinaryTreeNode left = lca2(root.left, p, q);
		BinaryTreeNode right = lca2(root.right, p, q);

		if (left != null && right != null) {
			return root;
		}

		return left != null ? left : right;
	}
	

	static Result lca(BinaryTreeNode root, BinaryTreeNode p, BinaryTreeNode q) {
		// Leafnode
		if (root == null) {
			return new Result(null, false);
		}

		// if p & q are same
		if (root == p && root == q) {
			return new Result(root, true);
		}

		// Traverse left tree
		Result rx = lca(root.left, p, q);
		if (rx.isAncestor) {
			return rx;
		}
		// Traverse right tree
		Result ry = lca(root.right, p, q);
		if (ry.isAncestor) {
			return ry;
		}

		// If both node found return true
		if (rx.node != null && ry.node != null) {
			return new Result(root, true);

			// If any node found, same as p or q then return the node
		} else if (root == p || root == q) {
			boolean isAncestor = rx.node != null || ry.node != null;
			return new Result(root, isAncestor);
		} else {
			// If not valid node return non-null node & false
			return new Result(rx.node != null ? rx.node : ry.node, false);
		}

	}
}
