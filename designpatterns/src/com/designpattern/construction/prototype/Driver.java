package com.designpattern.construction.prototype;

public class Driver {
	public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
		FetchData data = new FetchData();
		data.setApiUrl("http://localhost:8081/country/name?=bharat");
		data.loadData();
		System.out.println(data);
		FetchData data2 = (FetchData) data.clone();
		data2.setApiUrl("http://localhost:8081/country/name?=usa");
		data2.setJsonData("{'name':'america'}");
		System.out.println(data2);
	}
}
