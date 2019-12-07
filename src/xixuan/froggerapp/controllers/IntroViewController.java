package xixuan.froggerapp.controllers;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import xixuan.froggerapp.FroggerApp;


public class IntroViewController {
			
	public void toMainScene() {
		Parent root = null;
		try {
			root = FXMLLoader.load(getClass().getResource("../views/MenuView.fxml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		FroggerApp.getPrimaryStage().setScene(new Scene(root, 600, 800));	
        FroggerApp.getPrimaryStage().show();
	}
	
	//Turn the background music on or off
	public void onOffSound() {
		if (MenuSceneController.isMusicOn) {
			MenuSceneController.beforeGameSound.stop();
			MenuSceneController.isMusicOn = false;
		}
		else {
			MenuSceneController.beforeGameSound.play();
			MenuSceneController.isMusicOn = true;
		}
	}
}