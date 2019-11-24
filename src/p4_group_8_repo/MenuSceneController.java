package p4_group_8_repo;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class MenuSceneController {
	private Scene levelPageScene;
		
	//public void openMainScene(ActionEvent actionEvent) throws IOException {
	public void toLevelPageScene() throws IOException {
		
		FXMLLoader levelPageLoader = new FXMLLoader(getClass().getResource("./LevelPageScene.fxml"));
	    Parent secondPane = levelPageLoader.load();
	    levelPageScene = new Scene(secondPane, 600, 800);
		
        FroggerApp.getPrimaryStage().setScene(levelPageScene);
        FroggerApp.getPrimaryStage().show();
	}
}