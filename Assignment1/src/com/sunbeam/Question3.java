/**
 * 
 */
package com.sunbeam;

import java.util.ArrayList;

/**
 * @author ujjwal
 *
 */
public class Question3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(-1);
		list.add(2);
		list.add(1);
		list.add(0);
		list.add(4);
		list.add(-1);
		list.add(7);
		list.add(8);
		int s=0;
		int count=0;
		for(int i=0;i<list.size();i++) {
			count=0;
			for(int j=0;j<list.size();j++) {
				if(list.get(i)==list.get(j)) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(list.get(i));
				break;
			}
		}
		
	}

}
