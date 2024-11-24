package com.designpattern.behavioral.observer;

import java.util.LinkedList;
import java.util.List;

public class Zoom implements Subject {
	List<Observer> observers = new LinkedList<Observer>();
	String update;

	@Override
	public void subscribe(Observer ob) {
		this.observers.add(ob);
	}

	@Override
	public void unSubscribe(Observer ob) {
		this.observers.remove(ob);
	}

	@Override
	public void notifyObserver() {
		observers.stream().forEach(item -> item.notified(update));
	}

	public void setUpdate(String update) {
		this.update = update;
		notifyObserver();
	}

}
