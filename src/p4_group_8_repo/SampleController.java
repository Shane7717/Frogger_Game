package p4_group_8_repo;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SampleController {
	
	@FXML
	private Button btn1;
	
	
	public void eventButton() {
		System.out.println("Game begins");
		System.exit(0);
	}
	
}



