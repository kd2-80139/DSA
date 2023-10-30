/**
 * 
 */


import java.util.Scanner;

/**
 * @author ujjwal
 *
 */
public class InfixToPrefix {

	/**
	 * @param args
	 */
	public static int prio(char opr) {
		switch(opr) {
		case '$': return 11;
		case '/': return 10;
		case '*': return 10;
		case '%': return 10;
		case '+': return 9;
		case '-': return 9;
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack st=new Stack(15);
		String in=new String();
		System.out.println("enter");
		Scanner sc=new Scanner(System.in);
		in =sc.nextLine();
		StringBuilder pre=new StringBuilder();
		for(int i=in.length()-1;i>=0;i--) {
			char ch=in.charAt(i);
			if(Character.isDigit(ch)) {
				pre.append(ch);
			}
			else if(ch==')') {
				st.push(ch);
			}
			else if(ch=='(') {
				while(st.peek()!=')') {
					pre.append(st.pop());
				}
				st.pop();
			}
			else {
				while(!st.isEmpty() && prio(st.peek())>prio(ch)) {
					pre.append(st.pop());
				}
				st.push(ch);
			}
		}
		while(!st.isEmpty()) {
			pre.append(st.pop());
		}
		pre.reverse();
		
		System.out.println(pre);
	}

}
