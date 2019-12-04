package xixuan.froggerapp.controllers;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import xixuan.froggerapp.FroggerApp;
import xixuan.froggerapp.views.GameView;

public class LevelPageSceneController {
	
	GameView gameView = new GameView();
	
	public void toEasyMainScene() {
		gameView.easy_initialize();
		gameView.launchGameView();
	}
	
	public void toNormalMainScene() {
		gameView.easy_initialize();
		gameView.normal_initialize();
		gameView.launchGameView();
	}
	
	public void toHardMainScene() {
		gameView.easy_initialize();
		gameView.hard_initialize();
		gameView.launchGameView();
	}
	
	public void toNightMareMainScene() {
		gameView.easy_initialize();
		gameView.nightMare_initialize();
		gameView.launchGameView();
	}
	
	public void back() {
		Parent root = null;
		try {
			root = FXMLLoader.load(getClass().getResource("../views/MenuView.fxml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FroggerApp.getPrimaryStage().setScene(new Scene(root, 600, 800));	
        FroggerApp.getPrimaryStage().show();
	}
	
}
