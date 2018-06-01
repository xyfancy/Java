//: ChapterThree/Ex16/Ex16.java
/****************** Ex16*****************
* Start with a number that is all binary ones. Left shift it,
* then use the unsigned right-shift operator to right shift 
* through all of its binary positions. Display each result 
* using Integer.toBinaryString().
************************************************/

import static com.github.util.Print.*;

/** This is a class created for ChapterThree Ex16
* @author xyfancy
* @author https://github.com/JavaLearningbyCSE/thinkinginjava/wiki
* @version 1.0
*/
public class Ex16 {
	/** Entry point to class and applicantion.
	* @param args array of string arguments
	*/
	public static void main(String[] args) {
		int i = 0xffff_ffff;
	      print(Integer.toBinaryString(i <<= 1));
		for(int j = 0; j < 31; j++) {
			print(Integer.toBinaryString(i >>>= 1));
		}
	}
} /* Output:
11111111111111111111111111111110
1111111111111111111111111111111
111111111111111111111111111111
11111111111111111111111111111
1111111111111111111111111111
111111111111111111111111111
11111111111111111111111111
1111111111111111111111111
111111111111111111111111
11111111111111111111111
1111111111111111111111
111111111111111111111
11111111111111111111
1111111111111111111
111111111111111111
11111111111111111
1111111111111111
111111111111111
11111111111111
1111111111111
111111111111
11111111111
1111111111
111111111
11111111
1111111
111111
11111
1111
111
11
1

*///:~
