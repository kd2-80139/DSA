/**
 * 
 */
package com.sunbeam;

import java.util.Scanner;

/**
 * @author ujjwal
 *
 */
public class Stack {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList stack=new LinkedList();
		int choice=1;
		while(choice!=0) {
			System.out.println("0 Exit\n1 Push\n2 Pop\n3 Peek\n Enter Your Choice  ");
			choice=new Scanner(System.in).nextInt();
			switch(choice) {
			case 1:System.out.println("Enter data");
			      int data=new Scanner(System.in).nextInt();
			      stack.insertAtStart(data, stack);
			      break;
			case 2:stack.removeAtStart(stack);
				  break;
			case 3:System.out.println("Data: "+stack.peek(stack));
			break;
			}
			
		}

	}

}
