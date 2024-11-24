package com.designpattern.construction.singleton;

public class Mobile {
	private static Mobile mobile = null;

	private Mobile() {

	}

	public static Mobile getMobile() {

		if (mobile == null) {
			synchronized (Mobile.class) {
				if (mobile == null)
					mobile = new Mobile();
			}
		}
		return mobile;
	}

	public static void main(String[] args) {
		Mobile mob1 = getMobile();
		Mobile mob2 = getMobile();
		System.out.println(mob1);
		System.out.println(mob2);
		System.out.println(mob1.equals(mob2));
	}
}
