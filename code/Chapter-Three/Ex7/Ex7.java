//: ChapterThree/Ex7/Ex7.java
/****************** Ex7*****************
* Following Exercise 6 assign, a new Dog reference to 
* spot's object. Test for comparison using == and equals()
* for all references.
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

/** This is a class created for ChapterThree Ex7
* @author xyfancy
* @author https://github.com/JavaLearningbyCSE/thinkinginjava/wiki
* @version 1.0
*/
public class Ex7 {
	/** A field comment*/
	static void compare(Dog a, Dog b) {
		print("== on top references : " + (a==b));
		print("equals() on top refernces : " + (a.equals(b)));
		print("== on names : " + (a.name==b.name));
		print("equals() on names : " + (a.name.equals(b.name)));
		print("== on says : " + (a.says==b.says));
		print("equals() on says : " + (a.says.equals(b.says)));
	}
	/** Entry point to class and applicantion.
	* @param args array of string arguments
	*/
	public static void main(String[] args) {
		Dog a = new Dog();
		a.name = "spot";
		a.says = "Ruff!";

		Dog b = a;
		print("Compare dog a and dog b...");
		Ex7.compare(a, b);

		Dog c = new Dog();
		c.name = "spot";
		c.says = "Ruff!";
		print("\nCompare dog a and dog c...");
		Ex7.compare(a, c);

		Dog d = new Dog();
		d.name = new String("spot");
		d.says = new String("Ruff!");
		print("\nCompare dog a and dog d...");
		Ex7.compare(a, d);
	}
} /* Output:
Compare dog a and dog b...
== on top references : true
equals() on top refernces : true
== on names : true
equals() on names : true
== on says : true
equals() on says : true

Compare dog a and dog c...
== on top references : false
equals() on top refernces : false
== on names : true
equals() on names : true
== on says : true
equals() on says : true

Compare dog a and dog d...
== on top references : false
equals() on top refernces : false
== on names : false
equals() on names : true
== on says : false
equals() on says : true
*///:~
