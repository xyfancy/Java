//: ChapterTwo/Ex5/Ex5.java
/****************** Ex5*****************
* Modify Ex4 so the values of the data in DataOnly are assigned to and printed in main().
************************************************/

/** This is a class created for ChapterTwo Ex5
* @author xyfancy
* @author https://github.com/JavaLearningbyCSE/thinkinginjava/wiki
* @version 1.0
*/
public class Ex5 {
	/** An int field*/
	int a;
	/** A double field*/
	double b;
	/** A booleans field*/
	boolean c;
	/** Entry point to class and applicantion.
	* @param args array of string arguments
	*/
	public static void main(String[] args) {
		Ex5 d= new Ex5();
		d.a = 0;
		d.b = 0.123;
		d.c = false;
		System.out.println("d.a = "+d.a);
		System.out.println("d.b = "+d.b);
		System.out.println("d.c = "+d.c);
	}
} /* Output:
d.a = 0
d.b = 0.123
d.c = false
*///:~
