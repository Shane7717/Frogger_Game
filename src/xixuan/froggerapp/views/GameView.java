package xixuan.froggerapp.views;

import javafx.animation.AnimationTimer;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import xixuan.froggerapp.settings.MyStage;
import xixuan.froggerapp.FroggerApp;
import xixuan.froggerapp.controllers.FrogController;
import xixuan.froggerapp.initializers.BackgroundImageInitializer;
import xixuan.froggerapp.initializers.DigitInitializer;
import xixuan.froggerapp.initializers.EndsInitializer;
import xixuan.froggerapp.initializers.LogsInitializer;
import xixuan.froggerapp.initializers.ObstaclesInitializer;
import xixuan.froggerapp.initializers.TurtlesInitializer;
import xixuan.froggerapp.initializers.WetTurtlesInitializer;
import xixuan.froggerapp.models.Digit;
import xixuan.froggerapp.models.Frog;

public class GameView {

	private AnimationTimer timer;
	private MyStage background;
	private FrogController frogController;
	private int base_position;
	private Scene mainScene;
	private LogsInitializer logsInitializer;
	private TurtlesInitializer turtlesInitializer;
	private WetTurtlesInitializer wetTurtlesInitializer;
	private ObstaclesInitializer obstaclesInitializer;
	
	public void launchGameView() {			
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
            	if (frogController.checkChangeScore()) 
            		setNumber(frogController.getPlayerPoints());
            	if (frogController.checkGetStop()) {
            		System.out.print("STOPP:");
            		background.stopMusic();
            		stop();
            		background.stop();
            		Alert alert = new Alert(AlertType.INFORMATION);
            		alert.setTitle("You Have Won The Game!");
            		alert.setHeaderText("Your High Score: "+ frogController.getPlayerPoints()+"!");
            		alert.setContentText("Highest Possible Score: 800");
            		alert.show();
            	}
            }
        };   
    }
	    
    public void basicInitializeAll() {
    	base_position = 300; 
		background = new MyStage();
		
		//Display background image in the game
		BackgroundImageInitializer bgImageInitializer = new BackgroundImageInitializer(background);
		bgImageInitializer.initialize();
		
		//Display logs in the game
		logsInitializer = new LogsInitializer(background);
		logsInitializer.initialize();
		
		//Display obstacles in the game
		obstaclesInitializer = new ObstaclesInitializer(background);
		obstaclesInitializer.initialize();
			
		//Display turtles in the game
		turtlesInitializer = new TurtlesInitializer(background);
		turtlesInitializer.initialize();
			
		//Display wet turtles in the game
		wetTurtlesInitializer = new WetTurtlesInitializer(background);
		wetTurtlesInitializer.initialize();
					
		//Display ends in the game
		EndsInitializer endsInitializer = new EndsInitializer(background);
		endsInitializer.initialize();
		
		//Display the digit in the game
		DigitInitializer digitInitializer = new DigitInitializer(background);
		digitInitializer.initialize();
		
		//Display the frog in the game
		Frog mainFrog = new Frog("file:resources/images/frogs/froggerUp.png");
		FrogView frogview = new FrogView(background);
		frogController = new FrogController(mainFrog, frogview);
		frogController.updateView();
		frogController.keyboardMonitor();
    }
    
    public void normal_initialize() {
    	logsInitializer.normal_settings();
    	turtlesInitializer.normal_settings();
    	wetTurtlesInitializer.normal_settings();
    	obstaclesInitializer.normal_settings();
    }
    
	public void start() {
		//background.playMusic();
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
