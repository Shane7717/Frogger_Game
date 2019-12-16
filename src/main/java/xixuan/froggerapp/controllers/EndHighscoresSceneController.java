package main.java.xixuan.froggerapp.controllers;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import main.java.xixuan.froggerapp.FroggerApp;
import main.java.xixuan.froggerapp.highscores.HighscoreManager;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * This class controls the final highscores screen in the game.
 * @author XIXUAN WANG
 */
public class EndHighscoresSceneController {
	
	/** This displays how many scores a player got in the game. */ 
	@FXML private Label scoreLabel;
	
	/** The represents the actual scores a player got in the game*/
	private int score;
	
	/** This enables a player to submit his own scores */
	@FXML private Button submitButton;
	
	/** This enabls a player to input his own name. */
	@FXML private TextField nameField;
	
	/** This shows all the top 10 players' names in the highscores */
	@FXML private Label hsName;
	
	/** This shows all the top 10 players' scores in the highscores */
	@FXML private Label hsScore;
	
	/** This shows all the top 10 players' levels in the highscores */
	@FXML private Label hsLevel;
	
	/** This shows whether or not the player has won the game */
	@FXML private Label state;
	
	/** This represents the number of lives left when the game is finished */
	private int lifeNum;
		
	/** This represents the text that a player has input in the text field */
	private String name;
	
	/** This represents the highscores manager object. */
	private HighscoreManager hs_manager;
	
	/** This represents the time in seconds left when the game if finished. */
	private int timeSecond;
	
	/** This checks whether or not a player has submitted his name twice */
	private int check;
		
	//Constructor
	public EndHighscoresSceneController(int score, int lifeNum, int second) {
		this.score = score;
		this.lifeNum = lifeNum;
		this.timeSecond = second;
		hs_manager = HighscoreManager.getInstance();
		this.check = 0;
	}
	
	/**
	 * This initializes all the content of the highscors page.<br><br>
	 * The content includes: <br>
	 * &nbsp;&nbsp;&nbsp;&nbsp;<code> the scores a player got in the game. </code><br>
	 * &nbsp;&nbsp;&nbsp;&nbsp;<code> the "win or lose" state of the player</code><br>
	 * &nbsp;&nbsp;&nbsp;&nbsp;<code> a text field for a player to input his own name</code><br>
	 * &nbsp;&nbsp;&nbsp;&nbsp;<code> a submit button for the player to submit his scores</code><br>
	 * &nbsp;&nbsp;&nbsp;&nbsp;<code> the updated highscores board with players' names, difficulty levels and corresponding scores </code>
	 */
	public void initialize() {	
		(MenuSceneController.beforeGameSound).play();
		if (lifeNum != 0 && timeSecond > 0) 
			state.setText("YOU WIN!!!");
		else 
			state.setText("YOU LOSE!!!");
		
		scoreLabel.setText("YOUR FINAL SCORE: " + String.valueOf(score));
		hsName.setText((hs_manager.getHighscoreString())[0]);
		hsScore.setText((hs_manager.getHighscoreString())[1]);
		hsLevel.setText((hs_manager.getHighscoreString())[2]);
		
		submitButton.setOnAction(event -> {
			this.name = nameField.getText();						
			if (name.isEmpty()) {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("EMPTY NAME WARNING");
				alert.setHeaderText("You must enter your name before submitting." );
				alert.setContentText("If you don't want any record, just quit the game directly please.");
				alert.show();
			} else if (name.length() <= 16){
				if (check == 0) { 
					//Update Highscores
					hs_manager.addScore(name, score);
					hsName.setText((hs_manager.getHighscoreString())[0]);
					hsScore.setText((hs_manager.getHighscoreString())[1]);
					hsLevel.setText((hs_manager.getHighscoreString())[2]);
					check = 1;
				} else {
					Alert alert = new Alert(AlertType.INFORMATION);
					alert.setTitle("REPETITIVE SUBMISSION");
					alert.setHeaderText("You can't submit your score twice.");
					alert.setContentText("You have already submitted your score.");
					alert.show();
				}
			} else if (name.length() > 16) {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Long NAME WARNING");
				alert.setHeaderText("You name entered must be of length <= 16 characters." );
				alert.setContentText("If your name is too long, just use your nickname please.");
				alert.show();
			}
		});
	}	
	
	/**
	 * This is used for the "Back to Main" button in this page. <br>
	 * After player clicks this button, the page will be jumped to the menu page.
	 */
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
	
	/**
	 * This is used for the "Music" button at the top of this page.<br>
	 * Player can click this button to turn on or turn off the background music.
	 */
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