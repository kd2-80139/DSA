/**
 * 
 */
package com.sunbeam;

import java.util.Scanner;

/**
 * @author ujjwal
 *
 */

class Stack {
	private int arr[];
	private int top;
	private final int SIZE;

	public Stack(int size) {
		SIZE = size;
		arr = new int[SIZE];
		top = -1;
	}

	public void push(int data) {
		// a. reposition the top
		top++;
		// b. add data at top index
		arr[top] = data;
	}

	public int pop() {
		// a. read data from top index
		int data = arr[top];
		// b. reposition top
		top--;
		// c. return read data
		return data;
	}

	public int peek() {
		// a. read/return data of top index
		return arr[top];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == SIZE - 1;
	}

}

public class QueueStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack st1 = new Stack(10);
		Stack st2 = new Stack(10);
		int choice = 1;
		int data = 0;
		while (choice != 0) {
			System.out.println("0:Exit\n1:Add\n2:Delete\n3:Peek\n");
			System.out.println("Enter Choice");
			choice = new Scanner(System.in).nextInt();
			switch (choice) {
			case 0:
				System.out.println("Bye bye");
				break;
			case 1:
				System.out.println("Enter Data");
				data = new Scanner(System.in).nextInt();
				st1.push(data);
				break;
			case 2: {
				while (!st1.isEmpty())
				{
					st2.push(st1.pop());
				}
				System.out.println(st2.pop());
				while (!st2.isEmpty())
				{
					st1.push(st2.pop());
				}
					
			}
				break;
			case 3: {
				while (!st1.isEmpty())
					st2.push(st1.pop());
				System.out.println(st2.peek());
				while (!st2.isEmpty())
					st1.push(st2.pop());
			}
				break;
			default:
				System.out.println("Wrong Choice.....");
				break;
			}
		}
	}

}
