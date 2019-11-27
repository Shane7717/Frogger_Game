package xixuan.froggerapp.views;

import javafx.animation.AnimationTimer;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import xixuan.froggerapp.settings.MyStage;
import xixuan.froggerapp.FroggerApp;
import xixuan.froggerapp.initialization.EndsInit;
import xixuan.froggerapp.initialization.Init;
import xixuan.froggerapp.initialization.LogsInit;
import xixuan.froggerapp.initialization.ObstaclesInit;
import xixuan.froggerapp.initialization.TurtlesInit;
import xixuan.froggerapp.models.BackgroundImage;
import xixuan.froggerapp.models.Digit;
import xixuan.froggerapp.models.Frog;

public class GameScene {

	AnimationTimer timer;
	MyStage background;
	Frog mainfrog;
	int base_position;
	Scene mainScene;
	
	public void launchGameScene() {
				
		base_position = 300;
		background = new MyStage();
		
		BackgroundImage gameBackground = new BackgroundImage("file:resources/images/background/arcade.png");
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
		mainfrog = new Frog("file:resources/images/frogs/froggerUp.png");
		background.add(mainfrog);
		
		//Add the digit 0 to the background. 
		background.add(new Digit(0, 30, base_position, 25));
		background.start();	
			
		mainScene = new Scene(background, 600, 800);
		//Main scene has been created now
				              
		FroggerApp.getPrimaryStage().setTitle("Frogger");
		FroggerApp.getPrimaryStage().setScene(mainScene);
		start();
		FroggerApp.getPrimaryStage().show();
		
	}
	
	public void createTimer() {
		timer = new AnimationTimer() {
			
            @Override
            public void handle(long now) {
            	if (mainfrog.changeScore()) {
            		setNumber(mainfrog.getPoints());
            	}
            	if (mainfrog.getStop()) {
            		System.out.print("STOPP:");
            		background.stopMusic();
            		stop();
            		background.stop();
            		Alert alert = new Alert(AlertType.INFORMATION);
            		alert.setTitle("You Have Won The Game!");
            		alert.setHeaderText("Your High Score: "+mainfrog.getPoints()+"!");
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
