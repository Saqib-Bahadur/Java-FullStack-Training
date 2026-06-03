package com.dayTwo;

public class Employee {
private int empID;
private String name;
private double salary;

public int getID()
{
	return empID;
}
public String getName()
{
	return name;
}
public double getSalary()
{
	return salary;
}

public void setID(int id)
{
	this.empID = id;
}
public void setName(String n)
{
	this.name=n;
}
public void setSalary(double d)
{
	this.salary = d;
}
public static void main(String args[])
{
	Employee emp = new Employee();
	emp.setID(1);
	emp.setName("XYZ");
	emp.setSalary(50000.100);
	
	System.out.println("Employee ID :: "+emp.getID());
	System.out.println("Employee Name :: "+emp.getName());
	System.out.println("Employee Salary :: "+emp.getSalary());
}
}
