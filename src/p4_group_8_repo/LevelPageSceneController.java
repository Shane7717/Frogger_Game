package p4_group_8_repo;

public class LevelPageSceneController {
	
	//public void openMainScene(ActionEvent actionEvent) throws IOException {
	public void toMainScene() {
        FroggerApp.getPrimaryStage().setScene(FroggerApp.getMainScene());
        FroggerApp.getPrimaryStage().show();
        FroggerApp.start();
	}
}
