package xixuan.froggerapp.controllers;

import xixuan.froggerapp.views.GameView;

public class LevelPageSceneController {
	
	//public void openMainScene(ActionEvent actionEvent) throws IOException {
	public void toMainScene() {
		GameView gameView = new GameView();
		gameView.launchGameView();
	}
}
