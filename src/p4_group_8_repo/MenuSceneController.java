package p4_group_8_repo;
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import p4_group_8_repo.FroggerApp;


public class MenuSceneController {
		
	@FXML
	public void toLevelPageScene() throws IOException {	
		Parent root = FXMLLoader.load(getClass().getResource("./LevelPageScene.fxml"));
		FroggerApp.getPrimaryStage().setScene(new Scene(root, 600, 800));	
        FroggerApp.getPrimaryStage().show();
	}
}