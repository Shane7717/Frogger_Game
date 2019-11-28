package xixuan.froggerapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

//Problems to be solved:
//1. Should I add an SSH key to my project??
//2. Should I delete my branches after finishing the whole project?
//3. Should I include the "module"??
//4. Should I add "." files into .gitignore?？

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
	    primaryStage.setScene(new Scene(root, 600, 800));
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
