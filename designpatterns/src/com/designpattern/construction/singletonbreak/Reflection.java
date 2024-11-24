package com.designpattern.construction.singletonbreak;

//public class UsingReflectionApi {
//	private static UsingReflectionApi reflectionApi = null;
//
//	private UsingReflectionApi() {
//		if (reflectionApi != null) {
//			throw new RuntimeException("you are trynig to break singleton pattern");
//		}
//	}
//
//	public static UsingReflectionApi getInstance() {
//		if (reflectionApi == null) {
//			synchronized (UsingReflectionApi.class) {
//				if (reflectionApi == null) {
//					reflectionApi = new UsingReflectionApi();
//				}
//			}
//		}
//		return reflectionApi;
//	}

//}

public enum Reflection

{
	Instance
}
