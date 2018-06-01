//: ChapterThree/Ex6/Ex6.java
/****************** Ex6*****************
* Create a class called Dog with two Strings: name and says.
* In main(), create two dogs, "spot" who says, "Ruff!", and 
* "scruffy" who says, "Wurf!". Then display their names and 
* what they say.
************************************************/

import static com.github.util.Print.*;

/** Class Dog
* @author xyfancy
* @author https://github.com/JavaLearningbyCSE/thinkinginjava/wiki
* @version 1.0
*/
class Dog {
	/** Name */
	String name;
	/** Says */
	String says;
}

/** This is a class created for ChapterThree Ex6
* @author xyfancy
* @author https://github.com/JavaLearningbyCSE/thinkinginjava/wiki
* @version 1.0
*/
public class Ex6 {
	/** Entry point to class and applicantion.
	* @param args array of string arguments
	*/
	public static void main(String[] args) {
		Dog a = new Dog();
		a.name = "spot";
		a.says = "Ruff!";
		Dog b = new Dog();
		b.name = "scruffy";
		b.says = "Wurf!";
		print("The name of dog a is " + a.name + ", and it says " + a.says);
		print("The name of dog b is " + b.name + ", and it says " + b.says);
	}
} /* Output:
The name of dog a is spot, and it says Ruff!
The name of dog b is scruffy, and it says Wurf!
*///:~
