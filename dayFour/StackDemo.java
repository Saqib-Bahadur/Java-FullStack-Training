package com.dayFour;

import java.util.Stack;

public class StackDemo {
	public static void main(String args[]) {
		Stack<Integer> stack = new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		System.out.println("Stack Elements :" +stack);
		System.out.println("After POP :"+stack.pop());
		System.out.println("Stack Elements :" +stack);
		System.out.println("Stack Peek :"+stack.peek());

	}

}
