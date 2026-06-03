package com.dayTwo;

public class Student {
private int age;
private String name;

public int getAge()
{
	return age;
}
public String getName()
{
	return name;
}
public void setAge(int a)
{
	this.age = a;
}
public void setName(String n)
{
	this.name=n;
}
public static void main(String args[])
{
	Student student1 = new Student();
	student1.setAge(20);
	student1.setName("ABC");
	System.out.println("Name :: "+student1.getName());
	System.out.println("Age :: "+student1.getAge());
}
}
