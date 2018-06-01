//: ChapterThree/Ex13/Ex13.java
/****************** Ex13*****************
* Write a program with two constant values, one with 
* alternating binary ones and zeroes, with a zero in 
* the least-significant digit, and the second, also
* alternating, with a one in the least-significant digit.
* (Hint: It's easiest to use hexadecimal constants for this.)
* Combine these two values every way possible using the bitwise
* operators. Display the results using Integer.toBinaryString().
************************************************/

import static com.github.util.Print.*;

/** This is a class created for ChapterThree Ex13
* @author xyfancy
* @author https://github.com/JavaLearningbyCSE/thinkinginjava/wiki
* @version 1.0
*/
public class Ex13 {
	/** Entry point to class and applicantion.
	* @param args array of string arguments
	*/
	public static void main(String[] args) {
		int a = 0xaaaaaaaa;
		int b = 0x55555555;
		print("a & a = " + Integer.toBinaryString(a&a));
		print("a & b = " + Integer.toBinaryString(a&b));
		print("a | a = " + Integer.toBinaryString(a|a));
		print("a | b = " + Integer.toBinaryString(a|b));
		print("~a = " + Integer.toBinaryString(~a));
	}
} /* Output:
a & a = 10101010101010101010101010101010
a & b = 0
a | a = 10101010101010101010101010101010
a | b = 11111111111111111111111111111111
~a = 1010101010101010101010101010101
*///:~
