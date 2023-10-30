/**
 * 
 */
package com.sunbeam;

import java.util.Scanner;

/**
 * @author ujjwal
 *
 */
public class NthOccarance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter key");
		
		int[] arr= {1,2,3,4,5,6,7,8,9,10,1,2,4,1,55,6,7,88,7,5};
		Scanner sc=new Scanner(System.in);
		int key =sc.nextInt();
		System.out.println("enter Occurance");
		int n =sc.nextInt();
		int low=0;
		while(low<arr.length) {
			if(arr[low]==key) {
				n--;
			}
			if(n==0) {
				System.out.println(low);
				return;
			}
			low++;
		}
		System.out.println("-1");
	}

}
