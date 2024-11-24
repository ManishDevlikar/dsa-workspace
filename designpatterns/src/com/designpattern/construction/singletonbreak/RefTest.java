package com.designpattern.construction.singletonbreak;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class RefTest {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
//		UsingReflectionApi ref1 = UsingReflectionApi.getInstance();
//		System.out.println(ref1.hashCode());
//		Constructor<UsingReflectionApi> constructor = UsingReflectionApi.class.getDeclaredConstructor();
//		constructor.setAccessible(true);
//		UsingReflectionApi ref2 = constructor.newInstance();
//		System.out.println(ref2);

		// to avoid this break using Reflection we can follow two ways
		// 1-> if object is there then throw exception from contruction

		// 2-> using enum
		Reflection e1 = Reflection.Instance;
		System.out.println(e1.hashCode());
		Constructor<Reflection> constructor = Reflection.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		Reflection e2 = constructor.newInstance();
		System.out.println(e2.hashCode());
	}
}
