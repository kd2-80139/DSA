/**
 * 
 */
package com.sunbeam;

import java.util.Scanner;

/**
 * @author ujjwal
 *
 */
public class Rank {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Input={ 10, 20, 15, 3, 4, 4, 1 };
		int key;
		int rank=0;
		Scanner sc=new Scanner(System.in);
		key=sc.nextInt();
		for(int i=0;i<Input.length;i++) {
			if(Input[i]<=key) {
				rank++;
			}
		}
		System.out.println(rank);

	}

}
