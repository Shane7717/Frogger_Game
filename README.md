*This is the maintenance and extension of Frogger.*<br><br>
**Author**: Xixuan Wang (20030619 scyxw3)<br>
**Tested on**: Lab machine & Mac Java 10 JavaFX 10.0.2 using Eclipse<br>
**Build script**: Maven - set this as goals: ```compile exec:java -Dexec.mainClass="main.java.xixuan.froggerapp.FroggerApp" ```

<br>
<h3>Brief Introduction</h3>
Frogger is a classic arcade game, originated in 1980s. Although the objective of Frogger is simplistic,
it is both very entertaining and challenging, and it has gained an enormous following.<br><br>

<h3>Key Changes for Maintenance</h3>

* **MVC Design Pattern**<br>  
    *  Almost each visual object in this game is applied MVC(model-view-controller) design pattern. For those objects, 
       each one has its own controller and viewer. The controller controls relevant parameters and settings of this object,
       and the viewer is accountable for displaying this object on the screen. 
    *  All the scenes after launching the game have also implemented MVC design pattern. Each ```.fxml``` file has its own controller,
       controlling relevant layout of scenes as well as adding switch functionality for each button. <br>
       
        ***Where***: each model class in  ```main.java.xixuan.froggerapp.models``` is applied MVC.<br>
        ***Why***: This is very beneficial for maintenance because relevant attributes of an object can be modified or extended very easily,
        just by using its controller. When setting different difficutly levels of this game, we can just use controllers to achieve that,
        by setting different parameters of the corresponding objects. We don't have to create different views in this way, hence 
        significantly reducing the usage of memory and space.
    

* **Maven** <br>
   *  Maven is a powerful management tool used for projects build.<br><br>
        ***Where***: The whold project is set up using Maven.<br>
        ***Why***: This makes the Frogger application IDE-independent, without restricting to Eclipse only. 
                It also provides project information (log document, dependency list, unit test reports etc.).
                We can add jars and other dependencies of the project easily with the help of maven.<br><br>


* **Single Responsibility**<br>
    *  Each class and each method has its own single responsibility, and is responsible for doing only one thing. <br><br>
       ***Where***: For example, method ```setPauseGameButton()``` in ```GameView``` is responsible only for setting a game-pause button
       on the screen. Besides, class ```ScoreComparator``` is only responsible for comparing two players' scores. More importantly, all
       of my initializer classes in ```main.java.xixuan.froggerapp.initializers``` have only one job, which is initializing their corresponding
       objects in the game.        

       ***Why***: If one class does the job of two, it promotes tight coupling. Therefore, by implmenting single responsibility, the structure
       of code is more clear, and it is easier to debug when bugs occur due to less coupling.<br><br>


*  **Singleton Design Pattern**<br>  
    *  Singleton design pattern ensures that a class only has one instance, and provides a global point of access to it.<br><br> 
    ***Where***: This pattern is applied to classes ```HighscoreManager``` and ```ScoreComparator``` in my project. <br>
    ***Why***: Only one instance of a class reduces the namespace, and it significantly improves the efficiency of both memory and space,
    since creating multiple instances is rather inefficient.<br><br> 

*  **Encapsulation**<br>
    *  I made fields ```private``` and provide  ```public``` getters or setters to them when necessary.<br><br>
    ***Where***: Encapsulation is applied mainly to all the model classes in ```main.java.xixuan.froggerapp.models``` <br>
    ***Why***: This ensures the security of those fields, not allowing everyone to modify them. Also, 
    it allows access to a level without revealing the complex details below that level. 







*  **Bug**










<br><br><br>
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