package p4_group_8_repo;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class SampleController {
	private Scene mainScene;
	private Stage primaryStage;
	
	@FXML
	private Button btn1;
	
	//public void openMainScene(ActionEvent actionEvent) throws IOException {
	public void openMainScene() {
		//System.out.println("I'm Angry");
        primaryStage.setScene(mainScene);
        primaryStage.show();
	}
	
	public void setMainScene(Scene scene, Stage primaryStage) {
        this.mainScene = scene;
        this.primaryStage = primaryStage;
	}
}