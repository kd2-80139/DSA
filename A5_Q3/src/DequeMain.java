/**
 * 
 */

/**
 * @author ujjwal
 *
 */
public class DequeMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque queue=new Deque();
		queue.insertEnd(10);
		queue.insertEnd(20);
		queue.insertEnd(30);
		queue.insertFirst(100);
		queue.insertEnd(40);
		queue.insertFirst(200);
		queue.insertEnd(50);
		queue.fdisplay();
		queue.rdisplay();
		System.out.println();
		queue.deleteEnd();
		queue.fdisplay();
		queue.rdisplay();
		System.out.println();
		queue.deleteFirst();
		queue.fdisplay();
		queue.rdisplay();
	}

}
