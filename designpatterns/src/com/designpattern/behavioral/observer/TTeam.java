package com.designpattern.behavioral.observer;

public class TTeam implements Observer {
	String msg;

	@Override
	public void notified(String msg) {
		this.msg = msg;
		dispaly();
	}

	public void dispaly() {
		System.out.println("meet for: " + msg);
	}

}
