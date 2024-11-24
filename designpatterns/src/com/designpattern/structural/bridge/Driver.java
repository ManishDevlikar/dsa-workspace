package com.designpattern.structural.bridge;

public class Driver {
	public static void main(String[] args) {
		MediaPlayer windowsPlayer = new AudioPlayer(new Windows());
		MediaPlayer linuxPlayer = new AudioPlayer(new Linux());
		windowsPlayer.play("windows.mp3");
		linuxPlayer.play("linux.mp3");
	}
}
