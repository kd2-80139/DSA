/**
 * 
 */
package com.sunbeam;

import java.util.Scanner;

/**
 * @author ujjwal
 *
 */
public class BinaryDesc {

	/**
	 * @param args
	 */
	public static int binary(int[] arr, int key, int length) {
		// TODO Auo-generated method stub
	
		int low=0;
		int high=length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;

			if(arr[mid]==key) {
				return mid;
			}
			else if(arr[mid]<key) {
				high=mid-1;
				
			}
			else {
				low=mid+1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter key");
		int[] arr= {100,99,88,77,66,55,44,33,22,11,10,9,8,7,6,5,4,3,2,1};
		Scanner sc=new Scanner(System.in);
		int key =sc.nextInt();
		System.out.println(binary(arr, key, arr.length));
	}

}
