/**
 * 
 */
package com.sunbeam;

import java.util.Scanner;


/**
 * @author ujjwal
 *
 */
public class SinglyLinkedList {

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
	public static SinglyLinkedList insertAtEnd(int data,SinglyLinkedList list) {
		Node newnode=new Node(data);
		if(list.head==null) {
			list.head=newnode;
			list.tail=newnode;
		}
		else {
//			Node temp=list.head;
//			while(temp.next!=null) {
//				temp=temp.next;
//			}
//			temp.next=newnode;
			list.tail.next=newnode;
			list.tail=list.tail.next;
		}
		return list;
	}
	public static void print(SinglyLinkedList list) {
		Node temp=list.head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	public static SinglyLinkedList removeAtEnd(SinglyLinkedList list) {
		if(list.head==null)return null;
		if(list.head.next==null) {
			list.head.next=null;
			return null;
		}
		Node trv=list.head;
		while(trv.next!=list.tail) {
			trv=trv.next;
		}
		list.tail=trv;
		list.tail.next=null;
		return list;
	}
	public static SinglyLinkedList removeAtStart(SinglyLinkedList list) {
		Node temp=list.head;
		list.head=list.head.next;
		temp.next=null;
		return list;
	}
	public static SinglyLinkedList insertAtStart(int data,SinglyLinkedList list) {
		Node newnode=new Node(data);
		newnode.next=list.head;
		list.head=newnode;
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList list=new SinglyLinkedList();
		System.out.println("Enter element");
		for(int i=0;i<5;i++) {
			int data=new Scanner(System.in).nextInt();
			list.insertAtEnd(data, list);
		}
		print(list);
		removeAtEnd(list);
		print(list);
		removeAtStart(list);
		print(list);
		insertAtStart(new Scanner(System.in).nextInt(), list);
		print(list);
	}

}
