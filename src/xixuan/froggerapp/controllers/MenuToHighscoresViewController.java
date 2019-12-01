package xixuan.froggerapp.controllers;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import xixuan.froggerapp.FroggerApp;

public class MenuToHighscoresViewController {
	@FXML private Label scoreLabel;
	@FXML private Button backButton;
	private String scoreList;
	
	public MenuToHighscoresViewController(String scoreList) {
		this.scoreList = scoreList;
	}
		
	public void initialize() {
		scoreLabel.setText(this.scoreList);
		backButton.setOnAction(event -> {
			Parent root = null;
			try {
				root = FXMLLoader.load(getClass().getResource("../views/MenuView.fxml"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			FroggerApp.getPrimaryStage().setScene(new Scene(root, 600, 800));	
	        FroggerApp.getPrimaryStage().show();
		});
	}
}
