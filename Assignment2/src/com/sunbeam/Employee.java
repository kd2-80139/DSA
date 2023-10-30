/**
 * 
 */
package com.sunbeam;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ujjwal
 *
 */
class Emp{
	private int empid;
	private String name;
	private double salary;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Emp(int empid, String name, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	public Emp() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Emp [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
public class Employee {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Emp> list=new ArrayList<Emp>();
		list.add(new Emp(1, "Ujjwal", 900));
		list.add(new Emp(2, "Princy", 800));
		list.add(new Emp(3, "Ritu", 801));
		list.add(new Emp(4, "Vijay", 802));
		list.add(new Emp(5, "Rudra", 500));
		list.add(new Emp(6, "Viraj", 400));
		list.add(new Emp(7, "Sumit", 300));
		list.add(new Emp(8, "Anuj", 200));
		list.add(new Emp(9, "Sarthak", 100));
		
		int n=list.size();
		for (Emp emp : list) {
			Emp e1=new Emp();
			Emp e2=new Emp();
			int i1=0;
			int i2=0;
			for (Emp emp2 : list) {
				if(emp.getSalary()>emp2.getSalary()) {
					
					
					i1=list.indexOf(emp);
					i2=list.indexOf(emp2);
					e1=list.get(list.indexOf(emp));
					e2=list.get(list.indexOf(emp2));
					break;
					
			}
				list.set(i2, e1);
				list.set(i1,e2);
		}
			break;
			
		}
		for (Emp emp : list) {
			System.out.println(emp);
		}
		
		
	}

}
