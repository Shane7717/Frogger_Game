package xixuan.froggerapp.controllers;

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
	
}
