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