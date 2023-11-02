

/**
 * @author ujjwal
 *
 */
public class Deque {

	/**
	 * @param args
	 */
	 class Node{
		int data;
		Node next;
		Node prev;
		Node(int d){
			data=d;
			next=null;
			prev=null;
		}
	}
	Node head;
	Node tail;
	
	public Deque() {
		// TODO Auto-generated constructor stub
		head=null;
	}
	public void insertFirst(int data) {
		Node newnode=new Node(data);
		if(head==null) {
			head=newnode;
			tail=newnode;
		}
		else {
			newnode.next=head;
			head.prev=newnode;
			head=newnode;
		}
	}
	public void insertEnd(int data) {
		Node newnode=new Node(data);
		if(head==null) {
			head=tail=newnode;
		}
		else {
			tail.next=newnode; 
			newnode.prev=tail;
			tail=tail.next;
		}
		
	}
	public void deleteFirst() {
		if(head==null) {
			return;
		}
		if(head==tail) {
			head=tail=null;
		}
		else {
			head=head.next;
			head.prev=null;
		}
	}
	public void deleteEnd() {
		if(head==null) {
			return;
		}
		if(head==tail) {
			head=tail=null;
		}
		else {
			tail=tail.prev;
			tail.next=null;
		}
	}
	public void fdisplay(){
		Node trav=head;
		while(trav!=null) {
			System.out.print(trav.data+" ");
			trav=trav.next;
		}
		System.out.println();
	}
	public void rdisplay(){
		Node trav=tail;
		while(trav!=null) {
			System.out.print(trav.data+" ");
			trav=trav.prev;
		}
		System.out.println();
	}
	
}
