package xixuan.froggerapp.initialization;

import xixuan.froggerapp.models.End;
import xixuan.froggerapp.settings.MyStage;

public class EndsInit extends Init {
	MyStage background; 

	public EndsInit(MyStage background) {
		this.background = background;
	}
	
	public void initialize() {
		background.add(new End("file:resources/images/ends/End.png", 13, 96));
		background.add(new End("file:resources/images/ends/End.png", 141, 96));
		background.add(new End("file:resources/images/ends/End.png", 141+141-13, 96));
		background.add(new End("file:resources/images/ends/End.png", 141+141-13+141-13+1, 96));
		background.add(new End("file:resources/images/ends/End.png", 141+141-13+141-13+141-13+3, 96));
	}
}
