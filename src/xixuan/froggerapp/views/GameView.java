package xixuan.froggerapp.views;

import javafx.animation.AnimationTimer;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import xixuan.froggerapp.settings.MyStage;
import xixuan.froggerapp.FroggerApp;
import xixuan.froggerapp.controllers.LogController;
import xixuan.froggerapp.initializers.LogInitializer;
import xixuan.froggerapp.models.BackgroundImage;
import xixuan.froggerapp.models.Digit;
import xixuan.froggerapp.models.Frog;
import xixuan.froggerapp.models.Log;

public class GameView {

	AnimationTimer timer;
	MyStage background;
	Frog mainFrog;
	int base_position;
	Scene mainScene;
	
	public void launchGameView() {
				
		base_position = 300;
		background = new MyStage();
		
		BackgroundImage gameBackground = new BackgroundImage("file:resources/images/background/arcade.png");
		background.add(gameBackground);	
	
		//Display logs in the game
		LogInitializer logInitializer = new LogInitializer(background);
		logInitializer.initialize();
		
		//Display obstacles in the game
		ObstacleView obstacleView = new ObstacleView(background);
		obstacleView.viewObstacles();
		
		//Display turtles in the game
		TurtleView turtleView = new TurtleView(background);
		turtleView.viewTurtles();
				
		//Display ends in the game
		EndView endView = new EndView(background);
		endView.viewEnds();
		
		//Display the frog in the game
		mainFrog = new Frog("file:resources/images/frogs/froggerUp.png");
		FrogView frogView = new FrogView(background, mainFrog);
		frogView.viewFrog();
	
		
		//Add the digit 0 to the background. 
		background.add(new Digit(0, 30, base_position, 25));
		background.start();	
			
		mainScene = new Scene(background, 600, 800);
		//Main scene has been created now
				              
		FroggerApp.getPrimaryStage().setTitle("Frogger");
		FroggerApp.getPrimaryStage().setScene(mainScene);
		FroggerApp.getPrimaryStage().show();
		start();
		
	}
	
	public void createTimer() {
		timer = new AnimationTimer() {
			
            @Override
            public void handle(long now) {
            	if (mainFrog.changeScore()) {
            		setNumber(mainFrog.getPoints());
            	}
            	if (mainFrog.getStop()) {
            		System.out.print("STOPP:");
            		background.stopMusic();
            		stop();
            		background.stop();
            		Alert alert = new Alert(AlertType.INFORMATION);
            		alert.setTitle("You Have Won The Game!");
            		alert.setHeaderText("Your High Score: "+ mainFrog.getPoints()+"!");
            		alert.setContentText("Highest Possible Score: 800");
            		alert.show();
            	}
            }
        };   
    }
	
	public void start() {
		background.playMusic();
		createTimer();
        timer.start();
    }
	
    public void stop() {
        timer.stop();
    }
    
    public void setNumber(int n) {
    	int shift = 0;
    	while (n > 0) {
    		int d = n / 10;
    		int k = n - d * 10;
    		n = d;
    		background.add(new Digit(k, 30, base_position - shift, 25));
    		shift+=30;
    	}
    }
}	
