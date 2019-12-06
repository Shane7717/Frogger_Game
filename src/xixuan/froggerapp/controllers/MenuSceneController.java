package xixuan.froggerapp.controllers;
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import xixuan.froggerapp.FroggerApp;
import xixuan.froggerapp.highscores.HighscoreManager;


public class MenuSceneController {
	@FXML private Button startButton;
	@FXML private Button highscoreButton;
	
	@FXML
	public void toLevelPageScene() throws IOException {	
		Parent root = FXMLLoader.load(getClass().getResource("../views/LevelPageView.fxml"));
		FroggerApp.getPrimaryStage().setScene(new Scene(root, 600, 800));	
        FroggerApp.getPrimaryStage().show();
	}
	
	@FXML
	public void toHighscoreScene() throws IOException {
		HighscoreManager hs_manager = new HighscoreManager();
		
		MenuToHighscoresViewController mthsController = new MenuToHighscoresViewController(hs_manager.getHighscoreString());          	
		FXMLLoader loader = new FXMLLoader(getClass().getResource("../views/MenuToHighscoresView.fxml"));
		loader.setController(mthsController);
		
		Parent root = null;
		try {
			root = loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		FroggerApp.getPrimaryStage().setScene(new Scene(root, 600, 800));	
		FroggerApp.getPrimaryStage().show();
	}	
	
	@FXML
	public void toIntroScene() throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("../views/IntroView.fxml"));
		FroggerApp.getPrimaryStage().setScene(new Scene(root, 600, 800));	
        FroggerApp.getPrimaryStage().show();
	}
}