package xixuan.froggerapp.views;

import xixuan.froggerapp.models.End;
import xixuan.froggerapp.settings.MyStage;

public class EndView {
	String path = "file:resources/images/ends/";
	
	MyStage background; 

	public EndView(MyStage background) {
		this.background = background;
	}
	
	public void viewEnds() {
		background.add(new End(path + "End.png", 13, 96));
		background.add(new End(path + "End.png", 141, 96));
		background.add(new End(path + "End.png", 141+141-13, 96));
		background.add(new End(path + "End.png", 141+141-13+141-13+1, 96));
		background.add(new End(path + "End.png", 141+141-13+141-13+141-13+3, 96));
	}
}
