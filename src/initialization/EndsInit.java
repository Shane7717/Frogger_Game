package initialization;

import p4_group_8_repo.End;
import p4_group_8_repo.MyStage;

public class EndsInit extends Init {
	MyStage background; 

	public EndsInit(MyStage background) {
		this.background = background;
	}
	
	public void initialize() {
		background.add(new End(13, 96));
		background.add(new End(141, 96));
		background.add(new End(141+141-13, 96));
		background.add(new End(141+141-13+141-13+1, 96));
		background.add(new End(141+141-13+141-13+141-13+3, 96));
	}
}
