//: ChapterTwo/Ex8/Ex8.java
/****************** Ex8*****************
* Write a program to demonstrate that no matter how many 
* objects you create of a particular class, there is only
* one instance of a particular static field in that class.
************************************************/

/** This is a class created for ChapterTwo Ex8
* @author xyfancy
* @author https://github.com/JavaLearningbyCSE/thinkinginjava/wiki
* @version 1.0
*/
public class Ex8 {
	/** A static int field */
	static int i;
	/** Entry point to class and applicantion.
	* @param args array of string arguments
	*/
	public static void main(String[] args) {
		Ex8 a = new Ex8();
		a.i = 1;
		Ex8 b = new Ex8();
		b.i = 2;
		Ex8 c = new Ex8();
		c.i = 3;
		System.out.println("a.i = "+a.i);				
		System.out.println("b.i = "+b.i);	
		System.out.println("c.i = "+c.i);	
	}
} /* Output:
a.i = 3
b.i = 3
c.i = 3
*///:~
