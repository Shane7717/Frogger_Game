package xixuan.froggerapp.initializers;

import xixuan.froggerapp.controllers.EndController;
import xixuan.froggerapp.models.End;
import xixuan.froggerapp.settings.MyStage;
import xixuan.froggerapp.views.EndView;

public class EndsInitializer implements Initializable {
	private MyStage background;
	
	public EndsInitializer(MyStage background) {
		this.background = background;
	}

	public void initialize() { 
		
		End end1model = new End("file:resources/images/ends/"+"End.png", 13, 96);
		EndView end1view = new EndView(background);
		EndController end1controller = new EndController(end1model, end1view);
		end1controller.updateView();

		End end2model = new End("file:resources/images/ends/"+"End.png", 141, 96);
		EndView end2view = new EndView(background);
		EndController end2controller = new EndController(end2model, end2view);
		end2controller.updateView();
		
		End end3model = new End("file:resources/images/ends/"+"End.png", 141+141-13, 96);
		EndView end3view = new EndView(background);
		EndController end3controller = new EndController(end3model, end3view);
		end3controller.updateView();
		
		End end4model = new End("file:resources/images/ends/"+"End.png", 141+141-13+141-13+1, 96);
		EndView end4view = new EndView(background);
		EndController end4controller = new EndController(end4model, end4view);
		end4controller.updateView();
		
		End end5model = new End("file:resources/images/ends/"+"End.png", 141+141-13+141-13+141-13+3, 96);
		EndView end5view = new EndView(background);
		EndController end5controller = new EndController(end5model, end5view);
		end5controller.updateView();
		
	}
}
