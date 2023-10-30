import java.util.Scanner;

/**
 * 
 */

/**
 * @author ujjwal
 *
 */
public class InfixToPostfix {

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
		String post=new String();
		for(int i=0;i<in.length();i++) {
			char ch=in.charAt(i);
			if(Character.isDigit(ch)) {
				post=post+ch;
			}
			else if(ch=='('){
				st.push(ch);
			}
			else if(ch==')') {
				while(st.peek()!='(') {
					post=post+st.pop();
				}
				st.pop();
			}
			else {
				while(!st.isEmpty() && prio(st.peek())>=prio(ch)) {
					post=post+st.pop();
				}
				st.push(ch);
			}
		}
		while(!st.isEmpty()) {
			post=post+st.pop();
		}
		System.out.println(post);
	}

}
