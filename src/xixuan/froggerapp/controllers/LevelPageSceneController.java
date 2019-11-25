package xixuan.froggerapp.controllers;

import xixuan.froggerapp.scenes.GameScene;

public class LevelPageSceneController {
	
	//public void openMainScene(ActionEvent actionEvent) throws IOException {
	public void toMainScene() {
		GameScene gameScene = new GameScene();
		gameScene.launchGameScene();
	}
}
