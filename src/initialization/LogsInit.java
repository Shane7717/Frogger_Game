package initialization;

import p4_group_8_repo.Log;
import p4_group_8_repo.MyStage;

public class LogsInit extends Init {
	MyStage background; 

	public LogsInit(MyStage background) {
		this.background = background;
	}
	
	public void initialize() {
		background.add(new Log("file:resources/images/log3.png", 152, 0, 175, 0.75));
		background.add(new Log("file:resources/images/log3.png", 152, 220, 175, 0.75));
		background.add(new Log("file:resources/images/log3.png", 152, 440, 175, 0.75));
		background.add(new Log("file:resources/images/logs.png", 310, 0, 276, -2));
		background.add(new Log("file:resources/images/logs.png", 310, 400, 276, -2));	
		background.add(new Log("file:resources/images/log3.png", 152, 50, 329, 0.75));
		background.add(new Log("file:resources/images/log3.png", 152, 270, 329, 0.75));
		background.add(new Log("file:resources/images/log3.png", 152, 490, 329, 0.75));
	}
}
