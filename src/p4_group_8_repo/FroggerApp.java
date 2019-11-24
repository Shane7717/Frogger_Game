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
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import initialization.Init;

//Problems to be solved:
//1. Should I add an SSH key to my project?
//2. Should I delete my branches after finishing the whole project?
//3. Should I include the "module"?
//Yes, add one module. Generally, a module stands for one version of your game
//but for coursework, one module is enough, with module-info.

public class FroggerApp extends Application {
	private static Stage primaryStage;
	private static AnimationTimer timer;
	private static MyStage background;
	private static Animal animal;
	private static int base_position;
	private static Scene mainScene;
	Scene menuScene;
	

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		setPrimaryStage(primaryStage);
		
		base_position = 300;
		background = new MyStage();
		
		BackgroundImage gameBackground = new BackgroundImage("file:resources/images/arcade.png");
		background.add(gameBackground);	
	
		//Initialize logs in the background
		Init logs_initializer = new LogsInit(background);
		logs_initializer.initialize();
		
		//Initialize obstacles(trucks, cars) in the background
		Init obstacles_initializer = new ObstaclesInit(background);
		obstacles_initializer.initialize();
		
		//Initialize turtles in the background
		Init turtles_initializer = new TurtlesInit(background);
		turtles_initializer.initialize();
				
		//Initialize ends in the background
		Init ends_initializer = new EndsInit(background);
		ends_initializer.initialize();
		
		//Add the frog to the background
		animal = new Animal("file:resources/images/froggerUp.png");
		background.add(animal);
		
		//Add the digit 0 to the background. 
		background.add(new Digit(0, 30, base_position, 25));
		background.start();	
			
		setMainScene(new Scene(background, 600, 800));
		//Main scene has been created now
				 
		FXMLLoader menuPageLoader = new FXMLLoader(getClass().getResource("./MenuScene.fxml"));
	    Parent secondPane = menuPageLoader.load();
	    menuScene = new Scene(secondPane, 600, 800);
	 	//Menu scene has been created now	 	
	             
		primaryStage.setTitle("Frogger");
     	primaryStage.setScene(menuScene);
    	primaryStage.show();
	}
	
	public static void createTimer() {
		timer = new AnimationTimer() {
			
            @Override
            public void handle(long now) {
            	if (animal.changeScore()) {
            		setNumber(animal.getPoints());
            	}
            	if (animal.getStop()) {
            		System.out.print("STOPP:");
            		background.stopMusic();
            		stop();
            		background.stop();
            		Alert alert = new Alert(AlertType.INFORMATION);
            		alert.setTitle("You Have Won The Game!");
            		alert.setHeaderText("Your High Score: "+animal.getPoints()+"!");
            		alert.setContentText("Highest Possible Score: 800");
            		alert.show();
            	}
            }
        };   
    }
	
	public static void start() {
		background.playMusic();
		createTimer();
        timer.start();
    }
	
    public void stop() {
        timer.stop();
    }
    
    public static void setNumber(int n) {
    	int shift = 0;
    	while (n > 0) {
    		int d = n / 10;
    		int k = n - d * 10;
    		n = d;
    		background.add(new Digit(k, 30, base_position - shift, 25));
    		shift+=30;
    	}
    }
	
	public static Stage getPrimaryStage() {
		return primaryStage;
	}

	public static void setPrimaryStage(Stage primaryStage) {
		FroggerApp.primaryStage = primaryStage;
	}

	public static Scene getMainScene() {
		return mainScene;
	}

	public static void setMainScene(Scene mainScene) {
		FroggerApp.mainScene = mainScene;
	}
}
