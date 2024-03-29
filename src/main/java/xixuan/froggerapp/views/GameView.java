package main.java.xixuan.froggerapp.views;

import java.io.IOException;

import javafx.animation.AnimationTimer;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import main.java.xixuan.froggerapp.FroggerApp;
import main.java.xixuan.froggerapp.controllers.EndHighscoresSceneController;
import main.java.xixuan.froggerapp.controllers.FrogController;
import main.java.xixuan.froggerapp.controllers.MenuSceneController;
import main.java.xixuan.froggerapp.initializers.BackgroundImageInitializer;
import main.java.xixuan.froggerapp.initializers.CrocodilesInitializer;
import main.java.xixuan.froggerapp.initializers.DigitInitializer;
import main.java.xixuan.froggerapp.initializers.EndsInitializer;
import main.java.xixuan.froggerapp.initializers.LizardsInitializer;
import main.java.xixuan.froggerapp.initializers.LogsInitializer;
import main.java.xixuan.froggerapp.initializers.ObstaclesInitializer;
import main.java.xixuan.froggerapp.initializers.TurtlesInitializer;
import main.java.xixuan.froggerapp.initializers.WetTurtlesInitializer;
import main.java.xixuan.froggerapp.models.Digit;
import main.java.xixuan.froggerapp.models.Frog;
import main.java.xixuan.froggerapp.models.FrogLifeSymbol;
import main.java.xixuan.froggerapp.settings.MyStage;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

/**
 * This class displays the main game scene in Frogger.
 * @author XIXUAN WANG
 */
public class GameView {
	private AnimationTimer timer;
	private MyStage background;
	private FrogController frogController;
	private int digit_position;
	
	/** The main game scene that is going to be set. */
	private Scene mainScene;
	
	/** The logs initializer. */
	private LogsInitializer logsInitializer;
	
	/** The turtles initializer. */
	private TurtlesInitializer turtlesInitializer;
	
	/** The wet turtles initializer. */
	private WetTurtlesInitializer wetTurtlesInitializer;
	
	/** The obstacles initializer. */
	private ObstaclesInitializer obstaclesInitializer;
	
	/** The crocodiles initializer. */
	private CrocodilesInitializer crocodilesInitializer;
	
	/** The lizards initializer. */
	private LizardsInitializer lizardsInitializer;
	
	/** The background image initializer. */
	private BackgroundImageInitializer bgImageInitializer;
	
	/** The ends initializer. */
	private EndsInitializer endsInitializer;
	
	/** The digit initializer. */
	private DigitInitializer digitInitializer;
	
	/** The music signal that decides whether or not pausing music. */
	private int musicSignal = 1;	
	
	/** The game signal what decides whether or not pausing game. */
	private int gameSignal = 1;		
	
	/** The life symbols showing the number of lives the frog owns. */
	public static FrogLifeSymbol[] symbols;	
	
	/** The continuously increasing frame time when game starts. */
	private Integer frameTime = 0;
	
	/** The time in seconds. */
	private Integer second = 1;		
	
	/** The countdown timerlabel shown in the bottom of the game. */
	private Label timerlabel;	
		
	/**
	 * This launches all the elements of the game scene and thus game begins
	 */
	public void launchGameView() {	
		setQuitButton();
		setPauseMusicButton();
		setPauseGameButton();
		setCountDown();
		background.start();		
        mainScene = new Scene(background, 600, 800);
               
		FroggerApp.getPrimaryStage().setTitle("Frogger");
		FroggerApp.getPrimaryStage().setScene(mainScene);
		FroggerApp.getPrimaryStage().show();
		(MenuSceneController.beforeGameSound).stop();
		background.playMusic();
		createTimer();
		timer.start();		
	}
		
	/**
	 * This creates the timer of the game
	 */
	public void createTimer() {
		timer = new AnimationTimer() {
			
            @Override
            public void handle(long now) {
            	frameTime++;       
            	if ((frameTime % 60) == 0) {
            		second = 80 - frameTime / 60;           
            		timerlabel.setText("Time Remaining: " + second.toString());
            	}          	     	
            	if (frogController.checkChangeScore()) 
            		setNumber(frogController.getPlayerPoints());
            	if (frogController.checkGetStop() || (second == 0)) {
            		System.out.print("GAME STOPPED!!!");
            		background.stopMusic();
            		timer.stop();
            		background.stop();
            		            		         		
            		//After the game ends, show the highscores
            		EndHighscoresSceneController hsController = new EndHighscoresSceneController(frogController.getPlayerPoints(), frogController.getLifeNum(), second);          	
            		FXMLLoader loader = new FXMLLoader(getClass().getResource("../views/EndHighscoresView.fxml"));
            		loader.setController(hsController);
            				
            		Parent root = null;
					try {
						root = loader.load();
					} catch (IOException e) {
						e.printStackTrace();
					}
            		FroggerApp.getPrimaryStage().setScene(new Scene(root, 600, 800));	
            		FroggerApp.getPrimaryStage().show();
            	}
            }
        };   
    }
	  
	/**
	 * This initializes all the relevant elements of the easy-level-mode game.
	 */
    public void easy_initialize() {
    	digit_position = 100; 
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
		endsInitializer = new EndsInitializer(background);
		endsInitializer.initialize();
		
		//Display the digit in the game
		digitInitializer = new DigitInitializer(background);
		digitInitializer.initialize();
		
		//Display crocodiles in the game
		crocodilesInitializer = new CrocodilesInitializer(background);
		crocodilesInitializer.initialize();
		
		//Display lizards in the game
		lizardsInitializer = new LizardsInitializer(background);
		lizardsInitializer.initialize();
			
		//Display the frog in the game
		Frog mainFrog = new Frog("file:src/main/resources/images/frogs/froggerUp.png");
		FrogView frogview = new FrogView(background);
		frogController = new FrogController(mainFrog, frogview);
		frogController.updateView();
		frogController.keyboardMonitor();
    }
    
    /**
     * This initializes all the relevant elements of the normal-level-mode game.
     */
    public void normal_initialize() {
    	frogController.setLifeNum(3);
    	setLifeSymbols();
    	logsInitializer.normal_settings();
    	turtlesInitializer.normal_settings();
    	wetTurtlesInitializer.normal_settings();
    	obstaclesInitializer.normal_settings();
    	crocodilesInitializer.normal_settings();
    	
    }
    
    /**
     * This initializes all the relevant elements of the hard-level-mode game.
     */  
    public void hard_initialize() {
    	frogController.setLifeNum(4);
    	setLifeSymbols();
    	logsInitializer.hard_settings();
    	turtlesInitializer.hard_settings();
    	wetTurtlesInitializer.hard_settings();
    	obstaclesInitializer.hard_settings();
    	crocodilesInitializer.hard_settings();
    	lizardsInitializer.hard_settings();
    }
    
    /**
     * This initializes all the relevant elements of the extra-level-mode game.
     */
    public void extra_initialize() {
    	frogController.setLifeNum(5);
    	setLifeSymbols();
    	frogController.setSignalValue(0);
    	logsInitializer.extra_settings();
    	turtlesInitializer.extra_settings();
    	wetTurtlesInitializer.extra_settings();
    	obstaclesInitializer.extra_settings();
    	bgImageInitializer.extra_settings();	
    	crocodilesInitializer.extra_settings();
    }
     
    /**
     * This sets the number that will be displayed on the screen.
     * @param n the integer number that will be displayed.
     */
    //Set scores on screen in the game
    public void setNumber(int n) {   
    	int hundred = n / 100;
    	int decade = (n - hundred * 100) / 10;
    	int unit = n - hundred * 100 - decade * 10;   		
    	background.add(new Digit(unit, 30, digit_position, 28));
    	background.add(new Digit(decade, 30, digit_position - 30, 28));
    	background.add(new Digit(hundred, 30, digit_position - 60, 28));    	
    }
    
    /**
     * This sets the "QUIT" button in the game for players to quit the game directly
     */
    public void setQuitButton() {
    	Button quitButton = new Button();
    	quitButton.setText("QUIT");
    	quitButton.setUnderline(true);
    	quitButton.setStyle("-fx-background-color: pink;-fx-font-weight:bold");
    	quitButton.setLayoutX(540);
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
	    		(MenuSceneController.beforeGameSound).play();
			}			
		});
    }
    
    /**
     * This sets the "PAUSE MUSIC" button for players to pause music during the game process.
     */
    public void setPauseMusicButton() {
    	Button pauseMusicButton = new Button();
    	pauseMusicButton.setText("PAUSE MUSIC");
    	pauseMusicButton.setUnderline(true);
    	pauseMusicButton.setStyle("-fx-background-color: #1fc966;-fx-font-weight:bold");
    	pauseMusicButton.setLayoutX(430);
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
    
    /**
     * This sets the "PAUSE GAME" button for players to pause the game.
     */
    public void setPauseGameButton() {
    	Button pauseGameButton = new Button();
    	pauseGameButton.setText("PAUSE GAME");
    	pauseGameButton.setUnderline(true);
    	pauseGameButton.setStyle("-fx-background-color:#1fc966;-fx-font-weight:bold");
    	pauseGameButton.setLayoutX(310);
    	pauseGameButton.setLayoutY(28);
    	pauseGameButton.setPrefSize(110, 30);
    	background.getChildren().add(pauseGameButton);
    	pauseGameButton.setOnAction(event -> {
			if (gameSignal == 1) {
				background.stop();
				background.stopMusic();
				timer.stop();				
				frogController.setDisableKey(true);
				gameSignal = 0;
				pauseGameButton.setText("RESUME GAME");			
			} else {
				background.start();
				background.playMusic();
				timer.start();
				frogController.setDisableKey(false);
				gameSignal = 1;
				pauseGameButton.setText("PAUSE GAME");		
			}		
		}); 
    }
    
    /**
     * This sets the life symbols on the screen showing the number of lives the frog owns.
     */
    public void setLifeSymbols() {
    	int xpos = 275;
    	symbols = new FrogLifeSymbol[frogController.getLifeNum()];
    	for (int i = 0; i < frogController.getLifeNum(); ++i ) {
    		symbols[i] = new FrogLifeSymbol("file:src/main/resources/images/scenes/lifeSymbol.png", 25, xpos, 30);
    		background.add(symbols[i]);
    		xpos -= 30;
    	} 	
    }
    
    /**
     * This sets the visual count-down timer on the screen during the whole game. 
     */
    public void setCountDown() {
    	timerlabel = new Label();
        timerlabel.setLayoutX(200);
     	timerlabel.setLayoutY(745);
     	timerlabel.setStyle("-fx-font-size:26");
     	timerlabel.setTextFill(Color.PINK);
     	background.getChildren().add(timerlabel);
    }
}	
