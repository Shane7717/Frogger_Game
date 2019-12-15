package main.java.xixuan.froggerapp.settings;

import java.io.File;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;


/**
 * This class is used to instantiate the stage of Frogger game.
 * @author XIXUAN WANG
 */
public class MyStage extends World{
	
	/** The media player that plays the background music when game starts. */
	MediaPlayer mediaPlayer;
		
	@Override
	public void act(long now) {}
		
	/**
	 * This plays the background music.
	 */
	public void playMusic() {
		String musicFile = "src/main/resources/music/FroggerMainSound.mp3";   
		Media music = new Media(new File(musicFile).toURI().toString());
		mediaPlayer = new MediaPlayer(music);
		mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
	    mediaPlayer.play();
	}
	
	/**
	 * This stops the background music.
	 */
	public void stopMusic() {
		mediaPlayer.stop();
	}
}
