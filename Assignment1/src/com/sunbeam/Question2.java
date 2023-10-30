/**
 * 
 */
package com.sunbeam;

import java.util.Scanner;

/**
 * @author ujjwal
 *
 */
public class Question2 {

	/**
	 * @param args
	 */
	public static int binary(int[] arr, int key, int length) {
		// TODO Auo-generated method stub
		int count=0;
		int low=0;
		int high=length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			count++;
			if(arr[mid]==key) {
				return count++;
			}
			else if(arr[mid]>key) {
				high=mid-1;
				
			}
			else {
				low=mid+1;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter key");
		int[] arr= {1,2,3,4,5,6,7,8,9,10,11,22,33,44,55,66,77,88,99,100};
		Scanner sc=new Scanner(System.in);
		int key =sc.nextInt();
		System.out.println(binary(arr, key, arr.length));
	}

	
}
