//: ChapterThree/Ex9/Ex9.java
/****************** Ex9*****************
* Demonstrates short-circuiting behavior with logical operators.
************************************************/

import static com.github.util.Print.*;

/** This is a class created for ChapterThree Ex9
* @author xyfancy
* @author https://github.com/JavaLearningbyCSE/thinkinginjava/wiki
* @version 1.0
*/
public class Ex9 {
	/** Test that an int val is or isn't bigger than 2
	* @param args array of string arguments
	* @return the result of val > 2
	*/
	static boolean TestVal(int val) {
		print("Test val is : " + val);
		return val > 2;
	}		

	/** Entry point to class and applicantion.
	* @param args array of string arguments
	*/
	public static void main(String[] args) {
		print("Test the & operator with 3,1,0...");
 		print(Ex9.TestVal(3) & Ex9.TestVal(1) & Ex9.TestVal(0));
		print("\nTest the && operator with 3,1,0...");
 		print(Ex9.TestVal(3) && Ex9.TestVal(1) && Ex9.TestVal(0));

		print("\nTest the | operator with 1,3,2...");
 		print(Ex9.TestVal(1) | Ex9.TestVal(3) | Ex9.TestVal(2));
		print("\nTest the || operator with 1,3,2...");
 		print(Ex9.TestVal(1) || Ex9.TestVal(3) || Ex9.TestVal(2));
	}
} /* Output:
Test the & operator with 3,1,0...
Test val is : 3
Test val is : 1
Test val is : 0
false

Test the && operator with 3,1,0...
Test val is : 3
Test val is : 1
false

Test the | operator with 1,3,2...
Test val is : 1
Test val is : 3
Test val is : 2
true

Test the || operator with 1,3,2...
Test val is : 1
Test val is : 3
true
*///:~
