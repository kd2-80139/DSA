import java.util.Scanner;

/**
 * @author ujjwal
 *
 */
public class Bst {

	/**
	 * @param args
	 */
	public class Node{
		int data;
		Node left;
		Node right;
		Node(int d){
			data=d;
			left=null;
			right=null;	
		}
			
	}
	Node root;
	public Bst() {
		root=null;
	}
	public Node add(int data,Node root){
		Node newnode=new Node(data);
		if(root==null) {
			root=newnode;
			
		}
		else {
			Node trav=root;
			if(data<trav.data) {
				if(trav.left==null) {
					trav.left=newnode;
					
				}else
				add(data,trav.left);
			}
			else {
					if(trav.right==null) {
						trav.right=newnode;
					}else
					add(data,trav.right);
			}
		}
		return root;
	}
	public void preorder(Node root) {
		if(root==null)return;
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
		return;
	}
	public void postorder(Node root) {
		if(root==null)return;
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
		return;
	}
	public void inorder(Node root) {
		if(root==null)return;
		
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
		return;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bst tree=new Bst();
		Node root=null;
		System.out.println("enter data");
		for(int i=0;i<7;i++) {
			int data=new Scanner(System.in).nextInt();
			root=tree.add(data,root);
		}
		System.out.println("postorder ");
		tree.postorder(root);
		System.out.println();
		System.out.println("preorder ");
		tree.preorder(root);
		System.out.println();
		
		System.out.println("inorder ");
		tree.inorder(root);
	}

}
