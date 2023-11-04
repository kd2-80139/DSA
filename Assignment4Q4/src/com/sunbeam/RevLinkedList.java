/**
 * 
 */
package com.sunbeam;


/**
 * @author ujjwal
 *
 */
public class RevLinkedList {

	/**
	 * @param args
	 */
	Node head;
	Node tail;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	public static RevLinkedList insertAtEnd(int data,RevLinkedList list) {
		Node newnode=new Node(data);
		if(list.head==null) {
			list.head=newnode;
			list.tail=newnode;
		}
		else {

			list.tail.next=newnode;
			list.tail=list.tail.next;
		}
		return list;
	}
	public static void print(RevLinkedList list) {
		Node temp=list.head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	public static void rev(RevLinkedList list) {
		if(list.head==null)return ;
		if(list.head==list.tail)return;
		Node t1=list.head;
		Node t2=list.head.next;
		list.tail=t1;
		list.head.next=null;
		while(list.head!=null) {
			list.head=t2.next;
			t2.next=t1;
			t1=t2;
			t2=list.head;
		}
		list.head=t1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RevLinkedList revList=new RevLinkedList();
		for(int i=0;i<10;i++) {
			revList.insertAtEnd(i, revList);
		}
		print(revList);
		
		rev(revList);
		
		print(revList);
	}

}
