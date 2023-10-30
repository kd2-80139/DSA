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
	private int[] arr;
	private int size;
	private int max;
	private int top;
	public Stack(int s) {
		// TODO Auto-generated constructor stub
		size=s;
		arr=new int[size];
		max=0;
		top=-1;
	}
	public void push(int data) {
		if(data>max) max=data;
		arr[++top]=data;
	}
	public boolean isFull() {
		return(top==size-1);
	}
	public int pop() {
		return arr[top--];
	}
	public int peek() {
		return arr[top];
	}
	public boolean isEmpty() {
		return top==-1;
	}
	public int maxEle() {
		return max;
	}
	
}
public class RevArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Size of Array");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] a=new int[size]; 
		
		Stack st=new Stack(size);
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			System.out.println(a[i]);
		}
		System.out.println();
		System.out.println();
		for(int i=0;i<size;i++) {
			st.push(a[i]);
		}
		for(int i=0;i<size;i++) {
			a[i]=st.pop();
		}
		for(int i=0;i<size;i++) {
			System.out.println(a[i]);
		}
	}

}
