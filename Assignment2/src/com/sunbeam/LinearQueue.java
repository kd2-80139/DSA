package com.sunbeam;

import java.util.Arrays;
import java.util.Objects;

public class LinearQueue {
	private int[] arr;
	private int size;
	private int front=0,rear=0;
	public LinearQueue() {
		// TODO Auto-generated constructor stub
	}
	
	public void add(int x){
		arr[rear]=x;
		rear++;
		
	}
	public void pop() {
		front++;
	}
	public int peek() {
		return arr[front];
	}
	public boolean isempty() {
		return rear==0 ||rear==front;
	}
	public boolean isfull() {
		return rear==size;
	}
	@Override
	public String toString() {
		return "LinearQueue [arr=" + Arrays.toString(arr) + ", size=" + size + ", front=" + front + ", rear=" + rear
				+ "]";
	}
	
}
