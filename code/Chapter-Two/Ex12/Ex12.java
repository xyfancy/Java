//: ChapterTwo/Ex12/Ex12.java
/****************** Ex12*****************
* Find the code for the second version of HelloDate.java,
* the simple comment-documentation example. Execute javadoc
* on the file and view the results with your Web brower.
************************************************/

import java.util.*;

/** This is a class created for ChapterTwo Ex12
* @author xyfancy
* @author https://github.com/JavaLearningbyCSE/thinkinginjava/wiki
* @version 1.0
*/
public class Ex12 {
	/** A field comment*/
	int i;
	/** Entry point to class and applicantion.
	* @param args array of string arguments
	*/
	public static void main(String[] args) {
		System.out.println("Hello, it it: ");
		System.out.println(new Date());
	}
} /* Output:
Hello, it it: 
Sun Dec 03 15:04:03 CST 2017
*///:~
