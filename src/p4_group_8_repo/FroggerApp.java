package p4_group_8_repo;

import initialization.LogsInit;
import initialization.ObstaclesInit;
import initialization.TurtlesInit;
import initialization.EndsInit;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

//Problems to be solved:
//1. Should I add an SSH key to my project?
//2. Should I delete my branches after finishing the whole project?
//3. Should I include the "module"?

public class FroggerApp extends Application {
	AnimationTimer timer;
	MyStage background;
	Animal animal;
	int base_position;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		base_position = 300;
		background = new MyStage();
		
		BackgroundImage gameBackground = new BackgroundImage("file:resources/images/arcade.png");
		background.add(gameBackground);	
		
		//Initialize logs in the background
		LogsInit logs_initializer = new LogsInit(background);
		logs_initializer.initialize();
		
		//Initialize obstacles(trucks, cars) in the background
		ObstaclesInit obstacles_initializer = new ObstaclesInit(background);
		obstacles_initializer.initialize();
		
		//Initialize turtles in the background
		TurtlesInit turtles_initializer = new TurtlesInit(background);
		turtles_initializer.initialize();
				
		//Initialize ends in the background
		EndsInit ends_initializer = new EndsInit(background);
		ends_initializer.initialize();
		
		//Add the frog to the background
		animal = new Animal("file:resources/images/froggerUp.png");
		background.add(animal);
		
		//Add the digit 0 to the background. 
		background.add(new Digit(0, 30, base_position, 25));
		background.start();	
				
		Scene mainScene = new Scene(background, 600, 800);
		//Main scene has been created now
				 
		FXMLLoader menuPageLoader = new FXMLLoader(getClass().getResource("./ToMainScene.fxml"));
	    Parent secondPane = menuPageLoader.load();
	    Scene menuScene = new Scene(secondPane, 600, 800);
	 	//Menu scene has been created now	 	
	 	
	    MainSceneController mainSceneController = (MainSceneController) menuPageLoader.getController();
	    mainSceneController.setMainScene(mainScene);
	    mainSceneController.setStage(primaryStage);
	    mainSceneController.setTimer(timer);
	    mainSceneController.setBackground(background);
	    mainSceneController.setAnimal(animal);
	    mainSceneController.setBasePosition(base_position);
       
		primaryStage.setTitle("Frogger");
     	primaryStage.setScene(menuScene);
    	primaryStage.show();
	}
}
