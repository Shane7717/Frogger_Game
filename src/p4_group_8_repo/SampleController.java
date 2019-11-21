package p4_group_8_repo;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SampleController {
	
	@FXML
	private Button btn1;
	//貌似在这里不能用lambda expressions
	
	public void eventButton() {
		System.out.println("Bye!");
		System.exit(0);
	}
	
}
