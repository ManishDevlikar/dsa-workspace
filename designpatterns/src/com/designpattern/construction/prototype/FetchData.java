package com.designpattern.construction.prototype;

public class FetchData implements Cloneable {
	private String apiUrl;
	private String jsonData;

	public String getApiUrl() {
		return apiUrl;
	}

	public void setApiUrl(String apiUrl) {
		this.apiUrl = apiUrl;
	}

	public String getJsonData() {
		return jsonData;
	}

	public void setJsonData(String jsonData) {
		this.jsonData = jsonData;
	}

	public void loadData() throws InterruptedException {
		Thread.sleep(5000);
		this.jsonData = "{'name':'bharat'}";
	}

	@Override
	public String toString() {
		return this.jsonData + this.apiUrl;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
