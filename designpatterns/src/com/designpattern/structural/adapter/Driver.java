package com.designpattern.structural.adapter;

public class Driver {
	public static void main(String[] args) {
		Iphone iphone = new Iphone(new ChargerAdapter(new AnchorAndroidCharger()));
		iphone.chargeMe();
	}
}
