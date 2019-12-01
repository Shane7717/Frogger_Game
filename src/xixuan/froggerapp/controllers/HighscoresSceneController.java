package xixuan.froggerapp.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import xixuan.froggerapp.highscores.HighscoreManager;

public class HighscoresSceneController {
	@FXML private Label scoreLabel;
	@FXML private Button submitButton;
	@FXML private TextField nameField;
	@FXML private Label hsString;
	private int score;
	private String name;
	private HighscoreManager hs_manager;
	
	//Used to check if the user has input his name twice
	private int check;
	
	//Constructor
	public HighscoresSceneController(int score) {
		this.score = score;
		hs_manager = new HighscoreManager();
		this.check = 0;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	//Could be automatically invoked when loaded
	public void initialize() {
		scoreLabel.setText("YOUR FINAL SCORE: " + String.valueOf(score) + " !");
		hsString.setText(hs_manager.getHighscoreString());
		submitButton.setOnAction(event -> {
			this.name = nameField.getText();
			if (name.isEmpty()) {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("EMPTY NAME WARNING");
				alert.setHeaderText("You must enter your name before submitting." );
				alert.setContentText("If you don't want any record, just quit the game directly.");
				alert.show();
			} else {
				if (check == 0) { 
					//Update Highscores
					hs_manager.addScore(name, score);
					hsString.setText(hs_manager.getHighscoreString());
					check = 1;
				} else {
					Alert alert = new Alert(AlertType.INFORMATION);
					alert.setTitle("Repetitive submission");
					alert.setHeaderText("You can't submit your score twice.");
					alert.setContentText("You have already submitted your score.");
					alert.show();
				}
			}
		});
	}	
}