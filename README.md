-Encapsulation-
Setting private data fileds and the corresponding methods to set them and return them is
the reflection of encapsulation. So I changed code in Log for now, for better maintenance.

Parameters: 
		
		String path = "file:resources/images/logs/";
		Log log1 = new Log(path + "log3.png", 152, 0, 175, 0.75);
		background.add(log1);
		//log1.setYpos(600);
		
		background.add(new Log(path + "log3.png", 152, 220, 175, 0.75));
		background.add(new Log(path + "log3.png", 152, 440, 175, 0.75));
		background.add(new Log(path + "logs.png", 310, 0, 280, -2));
		background.add(new Log(path + "logs.png", 310, 400, 280, -2));	
		background.add(new Log(path + "log3.png", 152, 50, 329, 0.75));
		background.add(new Log(path + "log3.png", 152, 270, 329, 0.75));
		background.add(new Log(path + "log3.png", 152, 490, 329, 0.75));
