//: ChapterThree/Ex3/Ex3.java
/****************** Ex3*****************
* Create a class containing a float and use it 
* to demonstrate aliasing during method calls.
************************************************/

import static com.github.util.Print.*;

/** This is a class created for ChapterThree Ex3
* @author xyfancy
* @author https://github.com/JavaLearningbyCSE/thinkinginjava/wiki
* @version 1.0
*/
public class Ex3 {
	/** A float field*/
	float i;
	/** Copy string
	* @param s a String reference
	*/
	static void f0(String s) {
		print("Input s = " + s);
		s = "1234";	
		print("Make s = " + s + " in method f0" );
	}
	/** Copy Float
	* @param f a Float reference
	*/
	static void f1(Float f) {
		print("Input f = " + f);
		f = 0.456f;	
		print("Make f = " + f + " in method f1" );
	}
	/** Copy float
	* @param a a Ex3 reference
	*/
	static void f2(Ex3 a) {
		print("Input a.i = " + a.i);
		a.i = 0.456f;	
		print("Make a.i = " + a.i + " in method f2" );
	}
	/** Entry point to class and applicantion.
	* @param args array of string arguments
	*/
	public static void main(String[] args) {
		//String test
		print("String Test:");
		String s0 = new String("abcd");
		print("Make s0 = " + s0);
		Ex3.f0(s0);
		print("s0 = " + s0);

		//Float test
		print("************");
		print("Float Test:");
		Ex3 a = new Ex3();
		a.i = 0.123f;
		print("Make a.i = 0.123f");
		a.f1(a.i);
		print("a.i = " + a.i);
		//Float test
		print("************");
		print("float Test:");
		a.f2(a);
		print("a.i = " + a.i);
	}
} /* Output:
String Test:
Make s0 = abcd
Input s = abcd
Make s = 1234 in method f0
s0 = abcd
************
Float Test:
Make a.i = 0.123f
Input f = 0.123
Make f = 0.456 in method f1
a.i = 0.123
************
float Test:
Input a.i = 0.123
Make a.i = 0.456 in method f2
a.i = 0.456
*///:~
