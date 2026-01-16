package DSA_TREE;

import java.util.Queue;
import java.util.LinkedList;

public class BinaryTreesB {
	static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	static class BinaryTree {
		static int idx = -1;

		public static Node buildTree(int nodes[]) {
			idx++;
			if (nodes[idx] == -1) {
				return null;
			}
			Node newNode = new Node(nodes[idx]);
			newNode.left = buildTree(nodes);
			newNode.right = buildTree(nodes);

			return newNode;
		}

		// preorder
		public static void preorder(Node root) {
			if (root == null) {
				// System.out.print("-1 ");
				return;
			}
			System.out.print(root.data + " ");
			preorder(root.left);
			preorder(root.right);
		}

		public static void inorder(Node root) {
			if (root == null) {
				// System.out.print("-1 ");
				return;
			}
			inorder(root.left);
			System.out.print(root.data + " ");
			preorder(root.right);
		}

		public static void postorder(Node root) {
			if (root == null) {
				// System.out.print("-1 ");
				return;
			}
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data + " ");

		}

		// level order
		public static void levelOrder(Node root) {
			if (root == null) {
				return;
			}
			Queue<Node> q = new LinkedList<>();
			q.add(root);
			q.add(null);

			while (!q.isEmpty()) {
				Node curreNode = q.remove();
				if (curreNode == null) {
					System.out.println();
					if (q.isEmpty()) {
						break;
					} else {
						q.add(null);
					}
				} else {
					System.out.print(curreNode.data + " ");
					if (curreNode.left != null) {
						q.add(curreNode.left);
					}
					if (curreNode.right != null) {
						q.add(curreNode.right);
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
		BinaryTree tree = new BinaryTree();
		Node root = tree.buildTree(nodes);
		System.out.println("\n====preorder====");
		tree.preorder(root);

		System.out.println("\n====Inorder====");
		tree.inorder(root);
		System.out.println("\n====postorder====");
		tree.postorder(root);
		System.out.println("\n====Levelorder====");
		tree.levelOrder(root);

	}

}
