/**
 * 
 */
package com.sunbeam;

import java.util.Scanner;

/**
 * @author ujjwal
 *
 */
public class MiddleNode {

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
	public static MiddleNode insertAtEnd(int data,MiddleNode list) {
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
	public static void print(MiddleNode list) {
		Node temp=list.head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiddleNode mlist =new MiddleNode();
		System.out.println("enter element");
		for(int i=0;i<6;i++) {
			int data=new Scanner(System.in).nextInt();
			mlist.insertAtEnd(data, mlist);
		}
		Node fast=mlist.head;
		Node slow=mlist.head;
		while(fast.next!=null) {
			if(fast==null)break;
			if(fast.next.next==null) {
				slow=slow.next;
				break;
			}
			fast=fast.next.next;
			slow=slow.next;
		}
		System.out.println("middle element"+slow.data);
	}

}
