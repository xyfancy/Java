//: ChapterTwo/Ex1/Ex1.java
/****************** Ex1*****************
* Create a class containing an int and a char that are not initalizd. 
* Print their values to verify that java performs default initialization.
************************************************/

/** This is a class created for ChapterTwo Ex1
* @author xyfancy
* @author https://github.com/JavaLearningbyCSE/thinkinginjava/wiki
* @version 1.0
*/
public class Ex1 {
	/** An  int field*/
	int  a;
	/** A char field*/
	int  b;
	/** Print a and b
	*/
	public Ex1(){ 
		System.out.println(+a);
		System.out.println(+b);	
	}
	/** Entry point to class and applicantion.
	* @param args array of string arguments
	*/
	public static void main(String[] args) {
		new Ex1();
	}
} /* Output:
0
0
*///:~
