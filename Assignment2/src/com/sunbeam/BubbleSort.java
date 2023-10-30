/**
 * 
 */
package com.sunbeam;

/**
 * @author ujjwal
 *
 */
public class BubbleSort {

	/**
	 * @param args
	 */
	public static int Bubble(int[] arr,int n) {
		int count=0;
		for(int i=0;i<n;i++) {
			int swap=0;
			for(int j=0;j<n-i-1;j++) {
				count++;
				if(arr[j]>arr[j+1]) {
					swap=1;
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			if(swap==0) {
				break;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr= {4,67,3,34,9};
		int[] arr= {1,2,3,4,5,6,7};
		System.out.println("Before sort");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println(Bubble(arr, arr.length));
		System.out.println("After sort");
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}

}
