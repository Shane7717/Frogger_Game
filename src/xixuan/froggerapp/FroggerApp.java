package xixuan.froggerapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

//Problems to be solved:
//Bug 1: If you keep pressing keys, the position of your frog will be wrong!
//Bug 2: Frogs in the end will be more thant 1
//Bug 3: Keep pressing but score mounting is false
//1. Can I remove some useless setters and getters??? (SURE!!DO IT)
//2. Highscore -- two labels and no ranking number when shown same marks
//3. Unit test -- see email by PEER
//4. pause the game.
//5. improvement: make all the controllers in an array in order to reduce code
//6. check the red font in level page, to see if it exists in lab computers

public class FroggerApp extends Application {
	
	private static Stage primaryStage;
		
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//When program starts running, the menu page will be shown
		setPrimaryStage(primaryStage);			     	            
	    Parent root = FXMLLoader.load(getClass().getResource("./views/MenuView.fxml"));
	    Scene menuScene = new Scene(root, 600, 800); 
	    primaryStage.setScene(menuScene);
	    
	    //Mustn't change the size of the main window
	    primaryStage.setMaxWidth(600);
	    primaryStage.setMaxHeight(800);
	    primaryStage.setMinWidth(600);
	    primaryStage.setMinHeight(800);
	    primaryStage.setTitle("Frogger");
	    primaryStage.show();
	}
	
	public static Stage getPrimaryStage() {
		return FroggerApp.primaryStage;
	}
	
	public void setPrimaryStage(Stage primaryStage) {
		FroggerApp.primaryStage = primaryStage;
	}	
}
