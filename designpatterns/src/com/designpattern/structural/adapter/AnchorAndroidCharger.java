package com.designpattern.structural.adapter;

public class AnchorAndroidCharger implements AndroidCharger {

	@Override
	public void chargeAndroid() {
		System.out.println("Android is charging");
	}

}
