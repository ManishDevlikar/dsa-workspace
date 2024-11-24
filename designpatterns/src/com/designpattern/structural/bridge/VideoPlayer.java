package com.designpattern.structural.bridge;

public class VideoPlayer extends MediaPlayer {

	public VideoPlayer(OperatingSystem os) {
		super(os);
	}

	@Override
	public void play(String fileName) {
		System.out.println("playing audio file " + fileName);
		os.loadFile(fileName);
		os.playFile();
	}

}
