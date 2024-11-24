package com.dsa.stack.implementation;

public class Stack {
	public static int[] storage;
	private static final int Def_size = 10;
	private static int ptr = -1;

	public Stack() {
		this(Def_size);
	}

	public Stack(int size) {
		this.storage = new int[size];
	}

	public boolean push(int data) {
		if (isFull()) {
			System.out.println("storage is full");
			return false;
		}

		storage[++ptr] = data;
		return true;
	}

	public static boolean isFull() {
		return ptr == storage.length - 1;

	}

	public static boolean isEmpty() throws Exception {
		return ptr == -1;
	}

	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("stack is empty");
		}
		return storage[ptr--];
	}

	public int peak() {
		return storage[ptr];
	}

	public void display(Stack s) {
		int flag = ptr;
		while (flag != -1) {
			System.out.println(s.storage[flag]);
			flag--;
		}
	}

	public int search(int data) {

		int temp = ptr;
		while (temp != -1) {
			if (data == storage[temp]) {
				return temp;
			}
			temp--;
		}
		return -1;
	}

	public static void main(String[] args) throws Exception {
		Stack stack = new Stack();
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(60);
		stack.push(70);
		stack.push(80);
		stack.push(90);

//		System.out.println(storage.length + " length");
		stack.display(stack);
		System.out.println("----------------------");
//		stack.pop();
//		stack.pop();
//		stack.pop();
//		stack.pop();
//		stack.pop();
//		stack.pop();
//		stack.pop();
//		stack.pop();
//		System.out.println(d);
//		stack.display(stack);
//		System.out.println(ptr);
//		System.out.println(stack.peak());
//		System.out.println(stack.isEmpty() + " " + isFull());
//		System.out.println(stack.search(40));
	}
}

/*
 * Java Collection framework provides a Stack class that models and implements a
 * Stack data structure. The class is based on the basic principle of
 * last-in-first-out. In addition to the basic push and pop operations, the
 * class provides three more functions of empty, search, and peek. The class can
 * also be said to extend Vector and treats the class as a stack with the five
 * mentioned functions. The class can also be referred to as the subclass of
 * Vector.
 * 
 * empty()
 * 
 * It returns true if nothing is on the top of the stack. Else, returns false.
 * 
 * peek()
 * 
 * Returns the element on the top of the stack, but does not remove it.
 * 
 * pop()
 * 
 * Removes and returns the top element of the stack. An ‘EmptyStackException’
 * 
 * An exception is thrown if we call pop() when the invoking stack is empty.
 * 
 * push(Object element)
 * 
 * Pushes an element on the top of the stack.
 * 
 * search(Object element)
 * 
 * It determines whether an object exists in the stack. If the element is found,
 * 
 * It returns the position of the element from the top of the stack. Else, it
 * returns -1.
 * 
 */