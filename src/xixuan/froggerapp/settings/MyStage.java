package xixuan.froggerapp.settings;

import java.io.File;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class MyStage extends World{
	MediaPlayer mediaPlayer;
		
	@Override
	public void act(long now) {}
		
	public void playMusic() {
		String musicFile = "resources/music/FroggerMainSound.mp3";   
		Media music = new Media(new File(musicFile).toURI().toString());
		mediaPlayer = new MediaPlayer(music);
		mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
	    mediaPlayer.play();
	}
	
	public void stopMusic() {
		mediaPlayer.stop();
	}
}

