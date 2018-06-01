//: ChapterThree/Ex14/Ex14.java
/****************** Ex14*****************
* Write a program that test shift operators. 
************************************************/

import static com.github.util.Print.*;

/** This is a class created for ChapterThree Ex14
* @author xyfancy
* @author https://github.com/JavaLearningbyCSE/thinkinginjava/wiki
* @version 1.0
*/
public class Ex14 {
	/** Entry point to class and applicantion.
	* @param args array of string arguments
	*/
	public static void main(String[] args) {
		int a = 4;
		print("int a = " + Integer.toBinaryString(a));
		a >>= 33;
		print("a >>= 33 : " + Integer.toBinaryString(a));
		a <<= 33;
		print("a <<= 33 : " + Integer.toBinaryString(a));
	
		long b = 4;
		print("\nlong b = " + Long.toBinaryString(b));
		b >>= 65;
		print("b >>= 65 :  " + Long.toBinaryString(b));
		b <<= 65;
		print("b <<= 65: " + Long.toBinaryString(b));

		byte c = -1;
		print("\nbyte c = " + Integer.toBinaryString(c));
		c >>>= 10;
		print("c >>>= 10 : " + Integer.toBinaryString(c));
		print("c>>>10 : " + Integer.toBinaryString(c>>>10));
	}
} /* Output:
int a = 100
a >>= 33 : 10
a <<= 33 : 100

long b = 100
b >>= 65 :  10
b <<= 65: 100

byte c = 11111111111111111111111111111111
c >>>= 10 : 11111111111111111111111111111111
c>>>10 : 1111111111111111111111
*///:~
