package main.java.xixuan.froggerapp.controllers;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import main.java.xixuan.froggerapp.FroggerApp;

/**
 * This class controls the introduction screen in the game.
 * @author XIXUAN WANG
 */
public class IntroViewController {
	
	/**
	 * This is used for the "Back to Main" button in this page. <br>
	 * After player clicks this button, the page will be jumped to the menu page.
	 */
	public void toMainScene() {
		Parent root = null;
		try {
			root = FXMLLoader.load(getClass().getResource("../views/MenuView.fxml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		FroggerApp.getPrimaryStage().setScene(new Scene(root, 600, 800));	
        FroggerApp.getPrimaryStage().show();
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