package com.designpattern.structural.adapter;

public class AnchorIphoneCharger implements IphoneCharger {

	@Override
	public void chargeIphone() {
		System.out.println("iphone is charging");
	}

}
