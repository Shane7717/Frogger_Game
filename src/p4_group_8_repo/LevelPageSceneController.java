package p4_group_8_repo;

import p4_group_8_repo.GameScene;

public class LevelPageSceneController {
	
	//public void openMainScene(ActionEvent actionEvent) throws IOException {
	public void toMainScene() {
		GameScene gameScene = new GameScene();
		gameScene.launchGameScene();
	}
}
