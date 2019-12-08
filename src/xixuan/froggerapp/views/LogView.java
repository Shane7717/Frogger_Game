package xixuan.froggerapp.views;

import xixuan.froggerapp.models.Log;
import xixuan.froggerapp.settings.MyStage;

/**
 * This class displays or removes a log in the game.
 * @author XIXUAN WANG
 */
public class LogView {
	MyStage background; 
	
	public LogView(MyStage background) {
		this.background = background;
	}
	
	/**
	 * This adds the log into the game. 
	 * @param model an instance of Log
	 */
	public void viewLog(Log model) {
		background.add(model);
	}
	
	/**
	 * This removes the log currently in the game.
	 * @param model an instance of Log
	 */
	public void removeLog(Log model) {
		background.remove(model);
	}
}