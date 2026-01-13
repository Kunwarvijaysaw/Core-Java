package DSA_LinkedList;

import java.util.Scanner;

class Node{
	int val;
	Node next;
	Node(int val){
		this.val=val;
	}
}
public class DeleteLastNode {
	public static void display(Node head) {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.val+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	public static Node deleteLastNode(Node head) {
		if(head==null) {
			System.out.println("List is empty.Nothing to delete");
			return null;
		}
		
		if(head.next==null) {
			return null;
		}
		
		Node temp=head;
		while(temp.next.next !=null) {
			temp=temp.next;
		}
		temp.next=null;
		return head;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Number of Node");
		int n=sc.nextInt();
		
		if(n==0) {
			System.out.println("Linked List is empty...!");
			return;
		}
		System.out.println("Enter value for Node-1 : ");
		Node head=new Node(sc.nextInt());
		Node current=head;
		
		for(int i=2;i<=n;i++) {
			System.out.println("Enter value for Node-"+i+" : ");
			current.next=new Node(sc.nextInt());
			current=current.next;
		}
		System.out.println("Linked List elements:");
		display(head);
		
		System.out.println("===========================================");
		head=deleteLastNode(head);
		System.out.println("Linked List after deleting Last node:");
        display(head);
		

	}

}

