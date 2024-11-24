package com.recursion.basic;

public class NormalFunction {
	public static void main(String[] args) {
		print1();
	}

	public static void print1() {
		print2();
		System.out.println("inside print 1");
	}

	public static void print2() {
		print3();
		System.out.println("inside print 2");
	}

	public static void print3() {
		print4();
		System.out.println("inside print 3");
	}

	public static void print4() {
		print5();
		System.out.println("inside print 4");
	}

	public static void print5() {
		System.out.println("inside print 5");
	}
}
