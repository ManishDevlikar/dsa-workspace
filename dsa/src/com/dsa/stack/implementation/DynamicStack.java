package com.dsa.stack.implementation;

public class DynamicStack extends Stack {

	public DynamicStack() {
		super();
	}

	public DynamicStack(int size) {
		super(size);
	}

	@Override
	public boolean push(int data) {
		if (isFull()) {
			int[] temp = new int[storage.length * 2];

			for (int i = 0; i < storage.length; i++) {
				temp[i] = storage[i];
			}
			storage = temp;
		}
		return super.push(data);
	}

	public static void main(String[] args) {
		DynamicStack dS = new DynamicStack();

		dS.push(20);
		dS.push(20);
		dS.push(20);
		dS.push(20);
		dS.push(20);

		dS.push(20);
		dS.display(dS);
		System.out.println(dS.storage.length);
	}
}
