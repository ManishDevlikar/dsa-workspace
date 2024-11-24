package com.designpattern.structural.adapter;

public class ChargerAdapter implements IphoneCharger {

	AndroidCharger androidCharger;

	public ChargerAdapter(AndroidCharger androidCharger) {
		this.androidCharger = androidCharger;
	}

	@Override
	public void chargeIphone() {
		androidCharger.chargeAndroid();
	}

}
