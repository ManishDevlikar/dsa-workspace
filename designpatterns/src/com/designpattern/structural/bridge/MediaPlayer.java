package com.designpattern.structural.bridge;

public abstract class MediaPlayer {
	OperatingSystem os;

	public MediaPlayer(OperatingSystem os) {
		this.os = os;
	}

	public abstract void play(String fileName);

}
