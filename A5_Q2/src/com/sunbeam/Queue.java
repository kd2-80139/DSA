/**
 * 
 */
package com.sunbeam;

import java.util.Scanner;

/**
 * @author ujjwal
 *
 */
public class Queue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList Queue=new LinkedList();
		int choice=1;
		while(choice!=0) {
			System.out.println("0 Exit\n1 Add\n2 Remove\n3 Peek\n Enter Your Choice  ");
			choice=new Scanner(System.in).nextInt();
			switch(choice) {
			case 1:System.out.println("Enter data");
			      int data=new Scanner(System.in).nextInt();
			      Queue.insertAtStart(data, Queue);
			      break;
			case 2:Queue.removeAtEnd(Queue);
				  break;
			case 3:System.out.println("Data: "+Queue.peekQueue(Queue));
			break;
			}
			
		}
	}

}
