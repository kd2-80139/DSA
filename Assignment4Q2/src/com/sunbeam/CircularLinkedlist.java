/**
 * 
 */
package com.sunbeam;

import java.util.Scanner;

/**
 * @author ujjwal
 *
 */
public class CircularLinkedlist {

	/**
	 * @param args
	 */
	Node tail;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data= d;
			next=null;
		}
	}
	public static void insertAtEnd(int data,CircularLinkedlist list) {
		Node newnode=new Node(data);
		if(list.tail==null) {
			list.tail=newnode;
			list.tail.next=list.tail;
		}
		else {
			newnode.next=list.tail.next;
			list.tail.next=newnode;
			list.tail=newnode;
		}
	}
	public static void print(CircularLinkedlist list) {
		if(list.tail==null)return;
		Node trav=list.tail.next;
		while(trav!=list.tail) {
			System.out.print(trav.data+" ");
			trav=trav.next;
		}
		System.out.println(trav.data+" ");
		
	}
	public static void insertAtStart(int data,CircularLinkedlist list) {
		Node newnode=new Node(data);
		if(list.tail==null) {
			list.tail=newnode;
			list.tail.next=list.tail;
		}
		else {
			newnode.next=list.tail.next;
			list.tail.next=newnode;
		}
	}
	public static void deleteAtStart(CircularLinkedlist list) {
		if(list.tail==null)return;
		if(list.tail.next==list.tail) {
			list.tail=null;
			return;
		}
		else {
			list.tail.next=list.tail.next.next;
		}
	}
	public static void deleteAtEnd(CircularLinkedlist list) {
		if(list.tail==null)return;
		if(list.tail.next==list.tail) {
			list.tail=null;
			return;
		}
		Node trav=list.tail;
		while(trav.next!=list.tail) {
			trav=trav.next;
		}
		trav.next=list.tail.next;
		list.tail=trav;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLinkedlist list=new CircularLinkedlist();
		System.out.println("Enter element");
		for(int i=0;i<1;i++) {
			int data=new Scanner(System.in).nextInt();
			list.insertAtEnd(data, list);
		}
		print(list);
		insertAtStart(600, list);
		print(list);
		deleteAtStart(list);
		print(list);
		deleteAtEnd(list);
		print(list);
	}

}
