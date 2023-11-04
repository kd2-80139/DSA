/**
 * 
 */
package com.sunbeam;

import java.util.Scanner;

/**
 * @author ujjwal
 *
 */
public class MinAndMax {

	/**
	 * @param args
	 */
	Node head;
	Node tail;
	static int max=0, min=1234567890;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	public static MinAndMax insertAtEnd(int data,MinAndMax list) {
		Node newnode=new Node(data);
		if(max<data)max=data;
		if(min>data)min=data;
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
	public static void print(MinAndMax list) {
		Node temp=list.head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	public static void MinMax(MinAndMax list) {
		System.out.println("max: "+list.max+"     min:"+list.min);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinAndMax list=new MinAndMax();
		System.out.println("enter data");
		for(int i=0;i<10;i++) {
			int data=new Scanner(System.in).nextInt();
			list.insertAtEnd(data, list);
		}
		list.MinMax(list);
		
	}

}
