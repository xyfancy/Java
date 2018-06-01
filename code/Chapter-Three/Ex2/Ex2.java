//: ChapterThree/Ex2/Ex2.java
/****************** Ex2*****************
* Create a class containing a float and use it to demostrate aliasing
************************************************/

import static com.github.util.Print.*;

/** This is a class created for ChapterThree Ex2
* @author xyfancy
* @author https://github.com/JavaLearningbyCSE/thinkinginjava/wiki
* @version 1.0
*/
public class Ex2 {
	/** A float field */
	float i;
	/** Entry point to class and applicantion.
	* @param args array of string arguments
	*/
	public static void main(String[] args) {
		//String test
		print("String Test:");
		String s0 = new String("abcd");
		String s1 = new String("bcde");
		print("Make s0 = " + s0 + ", s1 = " + s1);
		print("Make s0 = s1");
		s0 = s1;
		print("s0 = " + s0);
		s0 = "1234";		
		print("Make s0 = " + s0);
		print("s0 = " + s0);
		print("s1 = " + s1);
		//Float test0
		print("************");
		print("Float Test:");
		Float f0 = new Float(0.123f);
		Float f1 = new Float(0.456f);
		print("Make f0 = " + f0 + ", f1 = " + f1);
		f0 = f1;
		print("Make f0 = f1");
		print("f0 = " + f0);
		f0 = 0.678f;		
		print("Make f0 = " + f0);
		print("f0 = " + f0);
		print("f1 = " + f1);
		//float test
		print("************");
		print("float Test:");
		Ex2 a = new Ex2();
		Ex2 b = new Ex2();
		Ex2 c = new Ex2();
		a.i = 0.123f;
		b.i = 0.456f;
		c.i = 1.0f;
		print("Make a.i = 0.123f, b.i = 0.456f");
		print("Make a = b");
		a = b;
		print("a.i = " +a.i);
		print("Make a.i = 0.789f");
		a.i = 0.789f;
		print("a.i = " +a.i);
		print("b.i = " +b.i);
		print("Make c.i =  a.i");
		c.i = a.i;
		print("c.i = " +c.i);
		print("Make c.i = 1.0f");
		c.i = 1.0f;
		print("a.i = " +a.i);
		print("c.i = " +c.i);		
	}
} /* Output:
String Test:
Make s0 = abcd, s1 = bcde
Make s0 = s1
s0 = bcde
Make s0 = 1234
s0 = 1234
s1 = bcde
************
Float Test:
Make f0 = 0.123, f1 = 0.456
Make f0 = f1
s0 = 1234
Make f0 = 0.678
f0 = 0.678
f1 = 0.456
************
float Test:
Make a.i = 0.123f, b.i = 0.456f
Make a = b
a.i = 0.456
Make a.i = 0.789f
a.i = 0.789
b.i = 0.789
Make c.i =  a.i
c.i = 0.789
Make c.i = 1.0f
a.i = 0.789
c.i = 1.0
*///:~
