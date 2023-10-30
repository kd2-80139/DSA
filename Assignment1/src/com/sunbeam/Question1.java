/**
 * 
 */
package com.sunbeam;

import java.util.Scanner;

/**
 * @author ujjwal
 *
 */
public class Question1 {

	/**
	 * @param args
	 */
	public static int linear(int arr[],int key,int size) {
		int count=0;
		for(int i=0;i<size;i++) {
			count++;
			if(arr[i]==key) {
				return count;
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
		System.out.println(linear(arr, key, arr.length));
	}

}
