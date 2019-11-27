package xixuan.froggerapp.controllers;

import xixuan.froggerapp.views.GameScene;

public class LevelPageSceneController {
	
	//public void openMainScene(ActionEvent actionEvent) throws IOException {
	public void toMainScene() {
		GameScene gameScene = new GameScene();
		gameScene.launchGameScene();
	}
}
