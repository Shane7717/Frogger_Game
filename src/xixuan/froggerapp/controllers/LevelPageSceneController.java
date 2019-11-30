package xixuan.froggerapp.controllers;

import xixuan.froggerapp.views.GameView;

public class LevelPageSceneController {
	
	GameView gameView = new GameView();
	
	public void toEasyMainScene() {
		gameView.basicInitializeAll();
		gameView.launchGameView();
	}
	
	public void toNormalMainScene() {
		gameView.basicInitializeAll();
		gameView.normal_initialize();
		gameView.launchGameView();
	}
	
	public void toHardMainScene() {
		gameView.basicInitializeAll();
		//gameView.normal_initialize();
		gameView.launchGameView();
	}
	
	public void toNightmareMainScene() {
		gameView.basicInitializeAll();
		//gameView.normal_initialize();
		gameView.launchGameView();
	}
	
}
