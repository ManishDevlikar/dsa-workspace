package com.designpattern.behavioral.observer;

public class Driver {
	public static void main(String[] args) {
		Zoom zoom = new Zoom();

		DWTeam dwTeam = new DWTeam();
		HRTeam hrTeam = new HRTeam();
		TTeam tTeam = new TTeam();

		zoom.subscribe(dwTeam);
		zoom.subscribe(hrTeam);
		zoom.subscribe(tTeam);
		zoom.setUpdate("production update");
		zoom.setUpdate("Daily scrum");

	}
}
