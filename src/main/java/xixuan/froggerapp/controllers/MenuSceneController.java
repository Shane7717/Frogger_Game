package main.java.xixuan.froggerapp.controllers;
import java.io.File;
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import main.java.xixuan.froggerapp.FroggerApp;
import main.java.xixuan.froggerapp.highscores.HighscoreManager;

/**
 * This class controls the menu screen in the game.
 * @author XIXUAN WANG
 */
public class MenuSceneController {
	
	/** The start button makes the game jump to level choosing screen. */
	@FXML private Button startButton;
	
	/** The highscore button enables players to see highscores board */
	@FXML private Button highscoreButton;
	
	/** The background music in the menu pange. */
	public static MediaPlayer beforeGameSound;
	
	/** The signal that the music only plays once and constantly */
	public static int signal = 1;
	
	/** The represents the state of the music - on or off*/
	public static boolean isMusicOn = true;	
	
	/**
	 * This is used for the "Start" button on the menu screen.<br>
	 * After player clicks this button, the page will be jumped to the level choosing page.
	 * @throws IOException possible IO Exception
	 */
	@FXML
	public void toLevelPageScene() throws IOException {	
		Parent root = FXMLLoader.load(getClass().getResource("../views/LevelPageView.fxml"));
		FroggerApp.getPrimaryStage().setScene(new Scene(root, 600, 800));	
        FroggerApp.getPrimaryStage().show();
	}
	
	/**
	 * This is used for the "Highscores" button on the menu screen.<br>
	 * After player clicks this button, the page will be jumped to the highscores board.
	 * @throws IOException possible IO Exception
	 */
	@FXML
	public void toHighscoreScene() throws IOException {
		HighscoreManager hs_manager = HighscoreManager.getInstance();
		
	   	MenuToHighscoresViewController mthsController = new MenuToHighscoresViewController(hs_manager.getHighscoreString());          	
		FXMLLoader loader = new FXMLLoader(getClass().getResource("../views/MenuToHighscoresView.fxml"));
		loader.setController(mthsController);
		
		Parent root = null;
		try {
			root = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		FroggerApp.getPrimaryStage().setScene(new Scene(root, 600, 800));	
		FroggerApp.getPrimaryStage().show();
	}	
	
	/**
	 * This is used for the "How to Play" button on the menu screen.<br>
	 * After player clicks this button, the page will be jumped to the introduction screen.
	 * @throws IOException possible IO Exception
	 */
	@FXML
	public void toIntroScene() throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("../views/IntroView.fxml"));
		FroggerApp.getPrimaryStage().setScene(new Scene(root, 600, 800));	
        FroggerApp.getPrimaryStage().show();
	}
	
	/**
	 * This initializes and loads the background music. 
	 */
	public void initialize() {
		if (signal == 1) {
			String musicFile2 = "resources/music/beforeGame.mp3";   
			Media sound = new Media(new File(musicFile2).toURI().toString());
			beforeGameSound = new MediaPlayer(sound);
			beforeGameSound.setCycleCount(MediaPlayer.INDEFINITE);	
			beforeGameSound.play();
			signal++;
		}
	}
	
	/**
	 * This is used for the "Music" button at the top of this page.<br>
	 * Player can click this button to turn on or turn off the background music.
	 */
	public void onOffSound() {
		if (isMusicOn) {
			beforeGameSound.stop();
			isMusicOn = false;
		}
		else {
			beforeGameSound.play();
			isMusicOn = true;
		}
	}
}