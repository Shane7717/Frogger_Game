package xixuan.froggerapp.controllers;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import xixuan.froggerapp.FroggerApp;
import xixuan.froggerapp.views.GameView;

public class LevelPageSceneController {
	GameView gameView = new GameView();
	
	//Jump to easy level
	public void toEasyMainScene() {
		gameView.easy_initialize();
		gameView.launchGameView();
	}
	
	//Jump to normal level
	public void toNormalMainScene() {
		gameView.easy_initialize();
		gameView.normal_initialize();
		gameView.launchGameView();
	}
	
	//Jump to hard level
	public void toHardMainScene() {
		gameView.easy_initialize();
		gameView.hard_initialize();
		gameView.launchGameView();
	}
	
	//Jump to extra level
	public void toExtraMainScene() {
		gameView.easy_initialize();
		gameView.extra_initialize();
		gameView.launchGameView();
	}
	
	//Back to the main menu
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
	
	//Turn the background music on or off
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
