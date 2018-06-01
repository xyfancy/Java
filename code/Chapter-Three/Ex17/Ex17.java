//: ChapterThree/Ex17/Ex17.java
/****************** Ex17*****************
* Write a method to display char values in
* binary form. Demonstrate it using several
* different characters.
************************************************/

import static com.github.util.Print.*;

/** This is a class created for ChapterThree Ex17
* @author xyfancy
* @author https://github.com/JavaLearningbyCSE/thinkinginjava/wiki
* @version 1.0
*/
public class Ex17 {
	/** A field comment*/
	static void ChartoBinaryString(char c) {
		print(c + " ： " + Integer.toBinaryString(c));
	}
	/** Entry point to class and applicantion.
	* @param args array of string arguments
	*/
	public static void main(String[] args) {
		Ex17.ChartoBinaryString('a');
		Ex17.ChartoBinaryString('b');
		Ex17.ChartoBinaryString('%');
	}
} /* Output:
a ： 1100001
b ： 1100010
% ： 100101
*///:~
