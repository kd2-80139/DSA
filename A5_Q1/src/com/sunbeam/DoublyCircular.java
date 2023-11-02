/**
 * 
 */
package com.sunbeam;

import java.util.Scanner;

/**
 * @author ujjwal
 *
 */
public class DoublyCircular {

	/**
	 * @param args
	 */
	static class Node{
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
	public DoublyCircular() {
		// TODO Auto-generated constructor stub
		head=null;
	}
	public static void insertEnd(int data,DoublyCircular clist) {
		Node newnode=new Node(data);
		if(clist.head==null) {
			clist.head=newnode;
			clist.head.next=clist.head;
			clist.head.prev=clist.head;
		}
		else {
			newnode.next=clist.head;
			newnode.prev=clist.head.prev;
			clist.head.prev.next=newnode;
			clist.head.prev=newnode;
			
		}
	}
	public static void display(DoublyCircular clist) {
		if(clist.head==null) {
			return;
		}
		Node trav=clist.head;
		do {
			System.out.print(trav.data+" ");
			trav=trav.next;
		}while(trav!=clist.head);
		System.out.println();
	}
	public static void insertFirst(int data,DoublyCircular clist) {
		
	}
	public static void insertPos(int data,int pos,DoublyCircular clist) {
		Node newnode =new Node(data);
		if(clist.head==null) {
			if(pos==1){
				clist.head=newnode;
				clist.head.next=newnode;
				clist.head.prev=newnode;
			}
			return;
		}
		if(pos==1) {
			insertFirst(data,clist);
		}
		Node trav=clist.head;
		
		
		do {
			
			trav=trav.next;
			pos--;
			if(trav==clist.head && pos==1) {
				newnode.next=trav;
				newnode.prev=trav.prev;
				trav.prev.next=newnode;
				trav.prev=newnode;
				return;
			}
		}while(pos>1);
		
		
		newnode.next=trav;
		newnode.prev=trav.prev;
		trav.prev.next=newnode;
		trav.prev=newnode;
	}
	public static void deletePos(int pos,DoublyCircular clist) {
		if(clist.head==null) {
			return;
		}
		if(clist.head.next==clist.head) {
			if(pos==1) {
				clist.head=null;
			}
		}
		else {
			Node trav=clist.head;
			while(pos>1) {
				trav=trav.next;
				pos--;
				if(trav==clist.head) {
					return;
				}
				
			}
			if(trav==clist.head) {
				clist.head.next.prev=clist.head.prev;
				clist.head.prev.next=clist.head.next;
				clist.head=clist.head.next;
				return;
			}
			trav.prev.next=trav.next;
			trav.next.prev=trav.prev;
			trav.next=null;
			trav.prev=null;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyCircular list=new DoublyCircular();
		System.out.println("Enter element");
		for(int i=0;i<5;i++) {
			int data=new Scanner(System.in).nextInt();
			list.insertEnd(data, list);
		}
		display(list);
		list.insertPos(600, 6, list);
		display(list);
		deletePos(4, list);
		display(list);
	}

}
