package com.designpattern.behavioral.observer;

public class HRTeam implements Observer {
	String msg;

	@Override
	public void notified(String msg) {
		this.msg = msg;
		display();
	}

	public void display() {
		System.out.println("meet for " + msg);
	}

}
