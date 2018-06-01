//: ChapterTwo/Ex7/Ex7.java
/****************** Ex7*****************
* Trun the Incrementable code fragments into a working program
************************************************/

/** This is a class created for ChapterTwo Ex7
* @author xyfancy
* @author https://github.com/JavaLearningbyCSE/thinkinginjava/wiki
* @version 1.0
*/
class StaticTest{
	/** A static int field */
	static int i = 47;
}

/** This is a class created for ChapterTwo Ex7
* @author xyfancy
* @author https://github.com/JavaLearningbyCSE/thinkinginjava/wiki
* @version 1.0
*/
public class Ex7 {
	/** increment method
	*/
	static void increment(){
		StaticTest.i++;	
	}
	/** Entry point to class and applicantion.
	* @param args array of string arguments
	*/
	public static void main(String[] args) {
		Ex7 a = new Ex7();
		a.increment();
		System.out.println("i = " + StaticTest.i);
	}
} /* Output:
i = 48
*///:~
