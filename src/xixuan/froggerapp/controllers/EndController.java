package xixuan.froggerapp.controllers;

import xixuan.froggerapp.models.End;
import xixuan.froggerapp.views.EndView;


public class EndController {

	private End model;
	private EndView view;
	
	public EndController(End model, EndView view) {
		this.model = model;
		this.view = view;
	}
		
	public void setEndSize(int size) {
		model.setSize(size);
	}
	
	public int getEndSize() {
		return model.getSize();
	}
	
	public void setImageLink(String imageLink) {
		model.setImageLink(imageLink);
	}
	
	public String getImageLink() {
		return model.getImageLink();
	}
	
	public void setEndXpos(int xpos) {
		model.setXpos(xpos);
	}
	
	public int getEndXpos() {
		return model.getXpos();
	}

	public void setEndYpos(int ypos) {
		model.setYpos(ypos);
	}
	
	public int getEndYpos() {
		return model.getYpos();
	}
	
	public void updateView() {
		view.viewEnd(model);
	}
}
