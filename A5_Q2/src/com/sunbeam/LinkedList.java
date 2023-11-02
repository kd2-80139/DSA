package com.sunbeam;
import java.util.Scanner;

/**
 * @author ujjwal
 *
 */
public class LinkedList {

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
	public static int peek(LinkedList list) {
		if(list.head==null) {
			System.out.println("Empty Stack");
			return 0;
		}
		return list.tail.data;
	}
	
	public static LinkedList removeAtStart(LinkedList list) {
		if(list.head==null) {
			System.out.println("Empty Stack");
			return null;
		}
		if(list.head==list.tail) {
			list.head=list.tail=null;
		}
		Node temp=list.head;
		while(temp.next!=list.tail) {
			temp=temp.next;
		}
		temp.next=null;
		list.tail=temp;
		return list;
	}
	public static LinkedList insertAtStart(int data,LinkedList list) {
		Node newnode=new Node(data);
		if(list.head==null) {
			list.head=list.tail=newnode;
		}
		list.tail.next=newnode;
		list.tail=list.tail.next;
		return list;
	}
	public static LinkedList removeAtEnd(LinkedList list) {
		if(list.head==null) {
			System.out.println("Empty Queue");
			return null;
		}
		list.head=list.head.next;
		return list;
	}
	public static int peekQueue(LinkedList list) {
		if(list.head==null) {
			System.out.println("Empty Queue");
			return 0;
		}
		return list.head.data;
	}

}
