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
    it allows access to a level without revealing the complex details below that level, hence enhancing the maintenance.<br><br>

*  **Bug Fixed**
    *  Fix1: The frog can't enter the same end for the second time.
    *  Fix2: The original score system has another bug: if currently a player's score is 120, after his death, the score becomes 170, which 
    is absolutely a mistake. So I fixed this bug by applying a new algorithm.<br><br>

*  Fixed the parameter order in the constructor of ```Obstacle```, since it was different from that of other model classes.
*  Renamed ```Animal``` to ```Frog```. 
*  Extracted much of the code in the constructor of ```Frog``` and make them into different specific functions.
<br><br><br>


<h3> Current Class Diagram </h3>



<br><br>
<h3> Key Changes for Extension </h3>

*  **Crocodiles and Huge Lizards**<br>
    *  Added crocodiles and huge lizards into the game (```Crocodile``` and ```Lizard```), and they occur in different levels of this game. 
    *  These objects are totally new elements which never occur in the original version.
    *  A crocodile has three forms when moving. When it gets crazy(red), if the frog is currently standing on it, it will die immediately.
       The frog will be safe if the crocodile is not getting crazy.
    *  The frog will be eaten when it is close to a huge lizard. <br><br>
    
*  **Count Down Timer**<br>
    *  Set the count down timer at the bottom of the game screen. 
    *  This is only not validated in the ```Easy``` difficulty level.
    *  Set the time to be 80 seconds.<br><br>

*  **Life Symbol**<br>
    *  Set the visual life symbols at the top of the game screen to show the number of lives that the frog got.
    *  Different number of lives for different difficulty levels.<br><br>

*  **Different Difficutly Levels**<br>
    *  These levels include ```Easy```, ```Normal```, ```Hard```, and ```Extra```. 
    *  As for ```Easy``` level, this is the classic arcade mode. All objects in the game are moving quite slowly. Besides, there is
       no time limit and no life limit for this level.
    *  As for ```Normal``` level, objects are speeding up a little bit, and crocodiles occur. There are three lives for the frog,
       and the time limit is 80 seconds.
    *  As for ```Hard``` level, objects are moving very fast, and both crocodiles and huge lizards occur. 
       There are four lives for the frog, and the time limit is 80 seconds.
    *  As for ```Extra``` level, this is the entertaining mode of Frogger. There is only one type of objects in this level - 
       ```RacingCar```. There are five lives for the frog, and the time limit is 80 seconds.<br><br> 
    
*  **Fundamental Settings**<br>
    *  Set the game pause button in the game
    *  Set the music pause button in the game
    *  Set the game quit button in the game<br><br>

* **Highscores**<br>
    *  When game ends, the player can submit his name and score to the hard disk score file.
    *  The player is not allowed to submit his information twice.
    *  After the player's submission, the highscores ranking will be updated.
    *  The highscores ranking contain the player's name, score and the difficulty level that he chose.
    *  Use ```.dat``` to keep the record of all players' information. This significantly avoids cheating.

*  A menu screen
*  A game introduction screen
*  A highscores screen which can be viewed directly after clicking the button in the menu 
*  Background music after launching the game
*  A symbol button to turn on or turn off the background music manually
*  Updated images of some game elements(```Log```,```Obstacle```, ```BackgroundImage```)


<img src="READMEimages/test.png" alt="test" width="50" height="50">