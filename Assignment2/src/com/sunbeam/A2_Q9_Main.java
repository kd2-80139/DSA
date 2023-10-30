/**
 * 
 */
package com.sunbeam;

import java.util.Scanner;

/**
 * @author ujjwal
 *
 */
public class A2_Q9_Main {

	/**
	 * @param args
	 */
	public static int prio(char opr) {
		switch (opr) {
		case '$':
			return 3;
		case '/':
			return 2;
		case '*':
			return 2;
		case '%':
			return 2;
		case '+':
			return 1;
		case '-':
			return 1;
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter operator = ");
		char choice = sc.next().charAt(0);
		System.out.println("Priority of " + choice + " Operator = " + prio(choice));
		sc.close();
	}

}
