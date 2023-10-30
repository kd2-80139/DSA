/**
 * 
 */
package com.sunbeam;

/**
 * @author ujjwal
 *
 */
class stack {
	private int[] arr;
	private int size;
	private int max;
	private int top;
	public stack(int s) {
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
public class Max {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stack st=new stack(5);
		st.push(10);
		st.push(5);
		st.push(13);
		st.push(16);
		st.push(2);
		System.out.println(st.maxEle());
	}

}
