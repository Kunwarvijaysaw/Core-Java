package DSA_TREE;

import DSA_TREE.BinaryTreesB.Node;

public class TreeHeight {
	static class Node{
		int data;
		Node left,right;
		
		public Node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
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
	}
	public static int height(Node root) {
		if(root==null) {
			return 0;
		}
		
		int lh=height(root.left);
		int rh=height(root.right);
		int h=Math.max(lh, rh)+1;
		return h;
	}
	
	public static int count(Node root) {
		if(root==null) {
			return 0;
		}
		int leftCount=count(root.left);
		int rightCount=count(root.right);
		int c=leftCount+rightCount+1;
		return c;
		
	}
	public static int sum(Node root) {
		if(root==null) {
			return 0;
		}
		int leftSum= sum(root.left);
		int rightSum=sum(root.right);
		int s=leftSum+rightSum+root.data;
		return s;
	}

	public static void main(String[] args) {
		
	/*	Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right.left=new Node(6);
		root.right.right=new Node(7);
		System.out.println("Height : "+height(root));
		
		System.out.println("Count Nodes : "+count(root));
		*/
		
		int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3,6,-1, -1, 7, -1, -1 };
	//	int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,7,12,-1,-1,-1,-1};
		
		
		BinaryTree b1=new BinaryTree();
		Node root=b1.buildTree(nodes);
		System.out.println("height of Tree : "+height(root));
		System.out.println("Count Nodes : "+count(root));
		System.out.println("Sum  Nodes : "+sum(root));
	}

}
