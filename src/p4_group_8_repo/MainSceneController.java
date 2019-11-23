package p4_group_8_repo;
import javafx.animation.AnimationTimer;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;


public class MainSceneController {
	private Scene mainScene;
	private Stage primaryStage;
	private AnimationTimer timer;
	private MyStage background;
	private Animal animal;
	private int base_position;
		
	@FXML
	private Button btn1;
	
	//public void openMainScene(ActionEvent actionEvent) throws IOException {
	public void openMainScene() {
        primaryStage.setScene(mainScene);
        primaryStage.show();
        start();
	}
	
	//setters
	public void setMainScene(Scene scene) {
        this.mainScene = scene;
	}	
	
	public void setStage(Stage stage) {
		this.primaryStage = stage;
	}
	
	public void setTimer(AnimationTimer timer) {
		this.timer = timer;
	}
	
	public void setBackground(MyStage background) {
		this.background = background;
	}
	
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
	public void setBasePosition(int base_position) {
		this.base_position = base_position;
	}
	
	public void start() {
		background.playMusic();
		createTimer();
        timer.start();
    }
	
	public void createTimer() {
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
