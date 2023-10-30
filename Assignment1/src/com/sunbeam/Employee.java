
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
		list.add(new Emp(1, "Ujjwal", 9078653412.0));
		list.add(new Emp(2, "Princy", 90786534.0));
		list.add(new Emp(3, "Ritu", 90786536.0));
		list.add(new Emp(4, "Vijay", 907865.0));
		list.add(new Emp(5, "Rudra", 90786.0));
		list.add(new Emp(6, "Viraj", 9078653.0));
		list.add(new Emp(7, "Sumit", 901233.0));
		list.add(new Emp(8, "Anuj", 53412.0));
		list.add(new Emp(9, "Sarthak", 85212.0));
		System.out.println("Seaching on basis of empid");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		for (Emp emp : list) {
			if(emp.getEmpid()==x) {
				System.out.println(emp.toString()); 
				break;
			}
		}
		System.out.println("Seaching on basis of name");
		String str=sc.next();
		for (Emp emp : list) {
			if(emp.getName().equals(str)) {
				System.out.println(emp.toString()); 
				break;
			}
		}
		
		System.out.println("Seaching on basis of salary");
		double sal=sc.nextDouble();
		for (Emp emp : list) {
			if(emp.getSalary()-sal==0) {
				System.out.println(emp.toString()); 
				break;
			}
		}
		
		
	}

}
