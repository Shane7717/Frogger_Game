package main.java.xixuan.froggerapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * This class launches the menu page of the game.
 * @author XIXUAN WANG
 */
public class FroggerApp extends Application {
		
	/** This is set static because all scenes occur in the same stage.<br><br>
	 *  Other classes are able to access this variable very easily since it belongs to this class.*/
	private static Stage primaryStage;
		
	public static void main(String[] args) {
		launch(args);
	}
	
	/**
	 * This makes execution move to the javaFX thread.
	 * @param  primaryStage		the primary stage of the whole game
	 * @throws Exception 		the exception that might occurs
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		setPrimaryStage(primaryStage);			     	            
	    Parent root = FXMLLoader.load(getClass().getResource("./views/MenuView.fxml"));
	    Scene menuScene = new Scene(root, 600, 800); 
	    setPrimaryStage();
	    primaryStage.setScene(menuScene);	 
	    primaryStage.show();
	}
	
	/**
	 * Primary stage getter
	 * @return the primary stage that every scene shares
	 */
	public static Stage getPrimaryStage() {
		return FroggerApp.primaryStage;
	}
	
	public void setPrimaryStage(Stage primaryStage) {
		FroggerApp.primaryStage = primaryStage;
	}	
	
	/** This sets the basic attributes (size, max size, and title) of primaryStage. */
	public void setPrimaryStage() {
		primaryStage.setMaxWidth(600);
		primaryStage.setMaxHeight(800);
		primaryStage.setMinWidth(600);
		primaryStage.setMinHeight(800);
		primaryStage.setTitle("Frogger");
	}
}
