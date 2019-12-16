package main.java.xixuan.froggerapp.controllers;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import main.java.xixuan.froggerapp.FroggerApp;
import main.java.xixuan.froggerapp.views.GameView;

/**
 * This class controls the game level choosing screen in the game
 * @author XIXUAN WANG
 */
public class LevelPageSceneController {
	GameView gameView = new GameView();
	
	/** This shows the difficulty level that the player chose just now */
	public static String level;
	
	/**
	 * This is used for the "Easy" button in this page.<br>
	 * After player clicks this button, the page will be jumped to the easy level mode of the game.
	 */
	public void toEasyMainScene() {
		gameView.easy_initialize();
		gameView.launchGameView();
		LevelPageSceneController.level = "Easy";
	}
	
	/**
	 * This is used for the "Normal" button in this page.<br>
	 * After player clicks this button, the page will be jumped to the normal level mode of the game.
	 */
	public void toNormalMainScene() {
		gameView.easy_initialize();
		gameView.normal_initialize();
		gameView.launchGameView();
		LevelPageSceneController.level = "Normal";
	}
	
	/**
	 * This is used for the "Hard" button in this page.<br>
	 * After player clicks this button, the page will be jumped to the hard level mode of the game.
	 */
	public void toHardMainScene() {
		gameView.easy_initialize();
		gameView.hard_initialize();
		gameView.launchGameView();
		LevelPageSceneController.level = "Hard";
	}
	
	/**
	 * This is used for the "Extra" button in this page.<br>
	 * After player clicks this button, the page will be jumped to the extra level mode of the game.
	 */
	public void toExtraMainScene() {
		gameView.easy_initialize();
		gameView.extra_initialize();
		gameView.launchGameView();
		LevelPageSceneController.level = "Extra";
	}
	
	/**
	 * This is used for the "Back to Main" button in this page. <br>
	 * After player clicks this button, the page will be jumped to the menu page.
	 */
	public void back() {
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
