package xixuan.froggerapp.views;

import java.io.IOException;

import javafx.animation.AnimationTimer;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import xixuan.froggerapp.settings.MyStage;
import xixuan.froggerapp.FroggerApp;
import xixuan.froggerapp.controllers.FrogController;
import xixuan.froggerapp.controllers.EndHighscoresSceneController;
import xixuan.froggerapp.initializers.BackgroundImageInitializer;
import xixuan.froggerapp.initializers.CrocodilesInitializer;
import xixuan.froggerapp.initializers.DigitInitializer;
import xixuan.froggerapp.initializers.EndsInitializer;
import xixuan.froggerapp.initializers.LizardsInitializer;
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
	private int digit_position;
	private Scene mainScene;
	private LogsInitializer logsInitializer;
	private TurtlesInitializer turtlesInitializer;
	private WetTurtlesInitializer wetTurtlesInitializer;
	private ObstaclesInitializer obstaclesInitializer;
	private CrocodilesInitializer crocodilesInitializer;
	private LizardsInitializer lizardsInitializer;
	private BackgroundImageInitializer bgImageInitializer;
	private int musicSignal = 1;
	private int gameSignal = 1;
	
	public void launchGameView() {	
		setQuitButton();
		setPauseMusicButton();
		setPauseGameButton();
		background.start();		
		mainScene = new Scene(background, 600, 800);
		//Main scene has been created now
				              
		FroggerApp.getPrimaryStage().setTitle("Frogger");
//		String css = this.getClass().getResource("/resources/css/gameButton.css").toExternalForm(); 
//		mainScene.getStylesheets().add(css);
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
            		System.out.print("GAME STOPPED!!!");
            		background.stopMusic();
            		timer.stop();
            		background.stop();
            		            		         		
            		//After the game ends, show the highscores
            		EndHighscoresSceneController hsController = new EndHighscoresSceneController(frogController.getPlayerPoints());          	
            		FXMLLoader loader = new FXMLLoader(getClass().getResource("../views/EndHighscoresView.fxml"));
            		loader.setController(hsController);
            				
            		Parent root = null;
					try {
						root = loader.load();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
            		FroggerApp.getPrimaryStage().setScene(new Scene(root, 600, 800));	
            		FroggerApp.getPrimaryStage().show();
            	}
            }
        };   
    }
	    
    public void easy_initialize() {
    	digit_position = 120; 
		background = new MyStage();
		
		//Display background image in the game
		bgImageInitializer = new BackgroundImageInitializer(background);
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
		
		//Display the crocodile in the game except the easy level
		crocodilesInitializer = new CrocodilesInitializer(background);
		crocodilesInitializer.initialize();
		
		//Display the lizards in the game except easy and normal levels
		lizardsInitializer = new LizardsInitializer(background);
		lizardsInitializer.initialize();
		
		
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
    	crocodilesInitializer.normal_settings();
    	
    }
    
    public void hard_initialize() {
    	logsInitializer.hard_settings();
    	turtlesInitializer.hard_settings();
    	wetTurtlesInitializer.hard_settings();
    	obstaclesInitializer.hard_settings();
    	crocodilesInitializer.hard_settings();
    	lizardsInitializer.hard_settings();
    }
    
    public void extra_initialize() {
    	frogController.setSignalValue(0);
    	logsInitializer.extra_settings();
    	turtlesInitializer.extra_settings();
    	wetTurtlesInitializer.extra_settings();
    	obstaclesInitializer.extra_settings();
    	bgImageInitializer.extra_settings();	
    }
    
	public void start() {
		background.playMusic();    
		createTimer();
        timer.start();
    }
	 
    public void setNumber(int n) {
    	int shift = 0;
    	while (n > 0) {
    		int d = n / 10;
    		int k = n - d * 10;
    		n = d;
    		background.add(new Digit(k, 30, digit_position - shift, 25));
    		shift+=30;
    	}
    }
    
    public void setQuitButton() {
    	Button quitButton = new Button();
    	quitButton.setText("QUIT");
    	quitButton.setUnderline(true);
    	quitButton.setStyle("-fx-background-color:green;");
    	quitButton.setLayoutX(520);
    	quitButton.setLayoutY(28);
    	quitButton.setPrefSize(50, 30);
    	background.getChildren().add(quitButton);
    	quitButton.setOnAction(event -> {
			Parent root = null;
			try {
				root = FXMLLoader.load(getClass().getResource("../views/MenuView.fxml"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Alert alert = new Alert(AlertType.CONFIRMATION, "Are you sure you want to quit the game?", ButtonType.YES, ButtonType.NO);
			alert.showAndWait();

			if (alert.getResult() == ButtonType.YES) {
				FroggerApp.getPrimaryStage().setScene(new Scene(root, 600, 800));	
		        FroggerApp.getPrimaryStage().show();
		        background.stopMusic();
	    		timer.stop();
	    		background.stop();
			}			
		});
    }
    
    public void setPauseMusicButton() {
    	Button pauseMusicButton = new Button();
    	pauseMusicButton.setText("PAUSE MUSIC");
    	pauseMusicButton.setUnderline(true);
    	pauseMusicButton.setStyle("-fx-background-color:green;");
    	pauseMusicButton.setLayoutX(410);
    	pauseMusicButton.setLayoutY(28);
    	pauseMusicButton.setPrefSize(100, 30);
    	background.getChildren().add(pauseMusicButton);
    	pauseMusicButton.setOnAction(event -> {
			if (musicSignal == 1) {
				background.stopMusic();
				musicSignal = 0;
				pauseMusicButton.setText("PLAY MUSIC");
			} else {
				background.playMusic();
				musicSignal = 1;
				pauseMusicButton.setText("PAUSE MUSIC");
			}		
		}); 
    }
    
    public void setPauseGameButton() {
    	Button pauseGameButton = new Button();
    	pauseGameButton.setText("PAUSE GAME");
    	pauseGameButton.setUnderline(true);
    	pauseGameButton.setStyle("-fx-background-color:green;");
    	pauseGameButton.setLayoutX(290);
    	pauseGameButton.setLayoutY(28);
    	pauseGameButton.setPrefSize(110, 30);
    	background.getChildren().add(pauseGameButton);
    	pauseGameButton.setOnAction(event -> {
			if (gameSignal == 1) {
				background.stop();
				background.stopMusic();
				frogController.setDisableKey(true);
				gameSignal = 0;
				pauseGameButton.setText("RESUME GAME");			
			} else {
				background.start();
				background.playMusic();
				frogController.setDisableKey(false);
				gameSignal = 1;
				pauseGameButton.setText("PAUSE GAME");		
			}		
		}); 
    }
}	
