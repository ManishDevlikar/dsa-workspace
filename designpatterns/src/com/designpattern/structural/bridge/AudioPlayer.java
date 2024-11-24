package com.designpattern.structural.bridge;

public class AudioPlayer extends MediaPlayer {

	public AudioPlayer(OperatingSystem os) {
		super(os);
	}

	@Override
	public void play(String fileName) {
		System.out.println("playing audio file " + fileName);
		os.loadFile(fileName);
		os.playFile();

	}

}
