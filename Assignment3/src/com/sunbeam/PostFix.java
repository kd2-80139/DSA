/**
 * 
 */
package com.sunbeam;

import java.util.Scanner;

/**
 * @author ujjwal
 *
 */
public class PostFix {

	/**
	 * @param args
	 */
	public static int calculate(int op1, char opr, int op2) {
		switch(opr) {
		case '+': return op1 + op2;
		case '-': return op1 - op2;
		case '*': return op1 * op2;
		case '/': return op1 / op2;
		case '%': return op1 % op2;
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String();
		System.out.println("enter");
		Stack st=new Stack(10);
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		int x=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(Character.isDigit(ch)) {
				x=x*10+(ch-'0');
			}
			else if(ch==',') {
				if(x==0) {
					continue;
				}
				st.push(x);
				x=0;
				System.out.println(st.peek());
			}
			else {
				int o2=st.pop();
				
				int o1=st.pop();
				System.out.println(o1+"   "+o2);
				int res=calculate(o1,s.charAt(i) , o2);
				st.push(res);
				System.out.println(res);
			}
			
			System.out.println("Answer "+st.peek());
		}
		
		
	}
	

}
