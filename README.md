*This is the maintenance and extension of Frogger.*<br><br>
**Author**: Xixuan Wang (20030619 scyxw3)<br>
**Tested on**: Lab machine & Mac Java 10 JavaFX 10.0.2<br>
**Build script**: Maven - set this as goals: ```compile exec:java -Dexec.mainClass="main.java.xixuan.froggerapp.FroggerApp" ```

<br>
<h3>Brief Introduction</h3>
Frogger is a classic arcade game, originated in 1980s. Although the objective of Frogger is simplistic,
it is both very entertaining and challenging, and it has gained an enormous following.<br><br>

<h3>Key Changes for Maintenance</h3>

* MVC Design Pattern<br>  
    *  Almost each visual object in this game is applied MVC(model-view-controller) design pattern. For those objects, 
       each one has its own controller and viewer. The controller controls relevant parameters and settings of this object,
       and the viewer is accountable for displaying this object on the screen. 
       *  Where: each class in  ```main.
       
    *  All the scenes after launching the game have also implemented MVC design pattern. Each ```.fxml``` file has its own controller,
       controlling relevant layout of scenes as well as adding switch functionality for each button.
    *  
    







--maven--

compile exec:java -Dexec.mainClass="main.java.xixuan.froggerapp.FroggerApp"


<img src="READMEimages/test.png" alt="test" width="50" height="50">

Key refactoring for classes and interfaces (Where and Why)
 


Additions to the game


-Encapsulation-
Setting private data fileds and the corresponding methods to set them and return them is
the reflection of encapsulation. So I changed code in Log for now, for better maintenance.

-Fix-
The parameter order in the constructor of Obstacle is different from that of Log. 
So I make the parameter orders of them exactly the same for maintenance.

-Private-
I tried to make data fileds private for protection purpose

-Methods- 
In Animal(Frog) class, I extracted a lot of code and make them into different specific functions

--MVC--
This is extremely useful when setting different levels for the game. Since every object has its own 
controller, we can just use controllers to set different parameters of those objects, to change
the difficulty of the game.

--Setters and getters-
Not all data fields should have setters and getters, which may make the whole program redundant

--Static fields--
Very convenient to be used in multiple classes without instantiating.

--Highscores--
We will be using a .dat file to keep the high-scores in, this will avoid cheating.

--feature1--
You can't enter nothing before clicking the "submit" button, which means you have to enter
your name or just quit the game directly

frog can't enter the same end for the second time