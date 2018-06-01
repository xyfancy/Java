//: ChapterThree/Ex11/Ex11.java
/****************** Ex11*****************
* Show that hex and octal notations work with long values.
* Use Long.toBinaryString() to display the results. 
************************************************/

import static com.github.util.Print.*;

/** This is a class created for ChapterThree Ex11
* @author xyfancy
* @author https://github.com/JavaLearningbyCSE/thinkinginjava/wiki
* @version 1.0
*/
public class Ex11 {
	/** Entry point to class and applicantion.
	* @param args array of string arguments
	*/
	public static void main(String[] args) {
		print("ox12L =" + Long.toBinaryString(0x12L));
		print("012L =" + Long.toBinaryString(012L));
	}
} /* Output:
ox12L =10010
012L =1010
*///:~
