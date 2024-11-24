package com.designpattern.structural.adapter;

public class Iphone {
	IphoneCharger iphoneCharger;

	public Iphone(IphoneCharger iphoneCharger) {
		this.iphoneCharger = iphoneCharger;
	}

	public void chargeMe() {
		iphoneCharger.chargeIphone();
	}
}
