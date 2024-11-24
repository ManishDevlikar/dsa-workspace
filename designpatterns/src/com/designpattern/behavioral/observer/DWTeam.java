package com.designpattern.behavioral.observer;

public class DWTeam implements Observer {
	String msg;

	@Override
	public void notified(String msg) {
		this.msg = msg;
		this.display();
	}

	private void display() {
		System.out.println("Meet for: " + msg);
	}

}
