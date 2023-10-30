/**
 * 
 */
package com.sunbeam;

/**
 * @author ujjwal
 *
 */
public class InsertionSortDesc {

	/**
	 * @param args
	 */
	public static int insertionSort(int[] arr,int n) {
		int count=0;
		for(int i=1;i<n;i++) {
			
			int temp=arr[i];
			int j=i-1;
			while( j>=0 && arr[j]<temp) {
				count++;
				arr[j+1]=arr[j];
				j--;
				
			}
			arr[j+1]=temp;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr= {4,67,3,34,9};
		//int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println("Before sort");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println(insertionSort(arr, arr.length));
		System.out.println("After sort");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
