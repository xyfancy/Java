//: ChapterThree/Ex5/Ex5.java
/****************** Ex5*****************
* Write a program that tests the operator "==" and method equals(). 
************************************************/

import static com.github.util.Print.*;

/** This is a class created for ChapterThree Ex5
* @author xyfancy
* @author https://github.com/JavaLearningbyCSE/thinkinginjava/wiki
* @version 1.0
*/
public class Ex5 {
	/** A field comment*/
	int i;
	/** Entry point to class and applicantion.
	* @param args array of string arguments
	*/
	public static void main(String[] args) {
		Ex5 a = new Ex5();
		Ex5 b = new Ex5();
		a.i = 127;
		b.i = 127;
		print("a==b is " + (a==b));
		print("a.equals(b) is " + (a.equals(b)));

		Integer i0 = new Integer(2);
		Integer j0 = new Integer(2);
		print("\ni0==j0 is " + (i0==j0));	
		print("i0.equals(j0) is " + (i0.equals(j0)));	

		Integer i1 = 127;
		Integer j1 = 127;
		print("\ni1==j1 is " + (i1==j1));	
		print("i1.equals(j1) is " + (i1.equals(j1)));	

		Integer i2 = 128;
		Integer j2 = 128;
		print("\ni2==j2 is " + (i2==j2));	
		print("i2.equals(j2) is " + (i2.equals(j2)));		

		String s0 = new String("abc");
		String s1 = new String("abc");
		print("\ns0==s1 is " + (s0==s1));	
		print("s0.equals(s1) is " + (s0.equals(s1)));	

		String s2 = "abc";
		String s3 = "abc";
		print("\ns2==s3 is " + (s2==s3));	
		print("s2.equals(s3) is " + (s2.equals(s3)));	
	}
} /* Output:
a==b is false
a.equals(b) is false

i0==j0 is false
i0.equals(j0) is true

i1==j1 is true
i1.equals(j1) is true

i2==j2 is false
i2.equals(j2) is true

s0==s1 is false
s0.equals(s1) is true

s2==s3 is true
s2.equals(s3) is true

*///:~
