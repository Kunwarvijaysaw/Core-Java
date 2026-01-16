 package DSA_LinkedList;

import java.util.Scanner;
class Node{
	int val;
	Node next;
	Node(int val){
		this.val=val;
		this.next=null;
		
	}
}

public class DeleteMidPositionRandom {
	
	public static void display(Node head) {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.val+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	public static Node deleteAtPosition(Node head,int pos) {
		if(head==null) {
			System.out.println("List is empty");
			return null;
		}
		
		if(pos==1) {
			return head.next;
		}
		
		Node temp=head;
	for(int i=1;i<pos-1;i++) {
		if(temp.next==null) {
			System.out.println("Invalid Position");
			return head;
		}
		temp=temp.next;
	}
		
		if(temp.next==null) {
			System.out.println("Invalid position");
			return head;
			
		}
		temp.next=temp.next.next;
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
		System.out.print("Enter position to delete: ");
        int pos = sc.nextInt();

        head = deleteAtPosition(head, pos);

        System.out.println("Linked List after deletion:");
        display(head);

		

	}

}

