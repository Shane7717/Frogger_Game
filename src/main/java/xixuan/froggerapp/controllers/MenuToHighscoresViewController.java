package main.java.xixuan.froggerapp.controllers;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import main.java.xixuan.froggerapp.FroggerApp;

/**
 * This class controls the initial highscores screen in the game.
 * @author XIXUAN WANG
 */
public class MenuToHighscoresViewController {
	@FXML private Label hsName;
	@FXML private Label hsScore;
	@FXML private Button backButton;
	private String[] scoreList;
	
	public MenuToHighscoresViewController(String[] scoreList) {
		this.scoreList = scoreList;
	}
		
	/**
	 * This displays the top 10 players' names and their corresponding scores on the screen.
	 */
	public void initialize() {
		hsName.setText(scoreList[0]);
		hsScore.setText(scoreList[1]);
		backButton.setOnAction(event -> {
			Parent root = null;
			try {
				root = FXMLLoader.load(getClass().getResource("../views/MenuView.fxml"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			FroggerApp.getPrimaryStage().setScene(new Scene(root, 600, 800));	
	        FroggerApp.getPrimaryStage().show();
		});
	}
	
	/**
	 * This is used for the "Music" button at the top of this page.<br>
	 * Player can click this button to turn on or turn off the background music.
	 */
	public void onOffSound() {
		if (MenuSceneController.isMusicOn) {
			MenuSceneController.beforeGameSound.stop();
			MenuSceneController.isMusicOn = false;
		}
		else {
			MenuSceneController.beforeGameSound.play();
			MenuSceneController.isMusicOn = true;
		}
	}
}
