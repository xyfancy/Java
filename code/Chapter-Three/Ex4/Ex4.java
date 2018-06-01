//: ChapterThree/Ex4/Ex4.java
// {Args : 10.1 2.1}
/****************** Ex4*****************
* Write a program that calculates velocity
* using a constant distance and a constant time.
************************************************/

import static com.github.util.Print.*;

/** This is a class created for ChapterThree Ex4
* @author xyfancy
* @author https://github.com/JavaLearningbyCSE/thinkinginjava/wiki
* @version 1.0
*/
public class Ex4 {
	/** distance */
	static float  d;
	/** time */
	static float  t;
	/** Calculates velocity
	* @param d distance
	* @param t time
	* @return velocity
	*/
	public static float CalculateVelocity(float d, float t) {
		return d/t;
	}
	/** Entry point to class and applicantion.
	* @param args array of string arguments
	*/
	public static void main(String[] args) {
		if(args.length != 2) {
			System.err.println(
		    	"Usage: java Ex4 distance time");
			System.exit(1);		
		}
		Ex4.d = Float.parseFloat(args[0]);
		Ex4.t = Float.parseFloat(args[1]);
		print("The distance is " + Ex4.d);
		print("The time is " + Ex4.t);
		print("The velocity is " + Ex4.CalculateVelocity(Ex4.d, Ex4.t));
	}
} /* Output:
The distance is 10.1
The time is 2.1
The velocity is 4.809524
*///:~
