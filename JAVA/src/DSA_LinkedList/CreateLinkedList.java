package DSA_LinkedList;

import java.util.Scanner;

class Node{
	int val;
	Node next;
	Node(int val){
		this.val=val;
	}
	
	
}
public class CreateLinkedList {
	public static void display(Node head) {
//		Node temp=head;
//		while(temp!=null) {
//			System.out.print(temp.val+" ");
//			temp=temp.next;
//		}
		
		//using for loop
		for(Node temp=head;temp!=null;temp=temp.next) {
			System.out.println(temp.val+" ");
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
//		Node a=new Node(10);
//		Node b=new Node(22);
//		Node c=new Node(40);
//		Node d=new Node(55);
//		Node e=new Node(77);
//		Node f=new Node(99);
//		a.next=b;
//		b.next=c;
//		c.next=d;
//		d.next=e;
//		e.next=f;
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
		
		
		

	}

}
