//: ChapterThree/Ex12/Ex12.java
/****************** Ex12*****************
* Display the largest and smallest numbers for 
* both float and double exponential notation.
************************************************/

import static com.github.util.Print.*;

/** This is a class created for ChapterThree Ex12
* @author xyfancy
* @author https://github.com/JavaLearningbyCSE/thinkinginjava/wiki
* @version 1.0
*/
public class Ex12 {
	/** Entry point to class and applicantion.
	* @param args array of string arguments
	*/
	public static void main(String[] args) {
		print("The largest numbers for float exponential notation :" + Float.MAX_VALUE);
		print("The smallest numbers for float exponential notation :" + Float.MIN_VALUE);

		print("The largest numbers for double exponential notation :" + Double.MAX_VALUE);
		print("The smallest numbers for double exponential notation :" + Double.MIN_VALUE);
	}
} /* Output:
The largest numbers for float exponential notation :3.4028235E38
The smallest numbers for float exponential notation :1.4E-45
The largest numbers for double exponential notation :1.7976931348623157E308
The smallest numbers for double exponential notation :4.9E-324
*///:~
