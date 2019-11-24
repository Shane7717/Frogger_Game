package p4_group_8_repo;

import javafx.scene.image.Image;

public class End extends Actor{
	boolean activated = false;
	
	//Constructor
	public End(String imageLink, int x, int y) {
		setX(x);
		setY(y);
		setImage(new Image(imageLink, 60, 60, true, true));
	}
	
	@Override
	public void act(long now) {
		// TODO Auto-generated method st
	}
	
	public void setEnd() {
		setImage(new Image("file:resources/images/FrogEnd.png", 70, 70, true, true));
		activated = true;
	}
	
	public boolean isActivated() {
		return activated;
	}
}
