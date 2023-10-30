/**
 * 
 */
package com.sunbeam;

/**
 * @author ujjwal
 *
 */
public class SelectionSort {

	/**
	 * @param args
	 */
	public static int Selection(int[] arr,int size) {
		int count=0;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				count++;
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,67,3,34,9}; 
		System.out.println("Before sort");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println(Selection(arr, arr.length));
		System.out.println("After sort");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		

	}

}
