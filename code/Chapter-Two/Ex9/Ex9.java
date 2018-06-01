//: ChapterTwo/Ex9/Ex9.java
/****************** Ex9*****************
* Write a program to demonstrate that autoboxing works for 
* all the primitive types and their wrappers.
************************************************/

/** This is a class created for ChapterTwo Ex9
* @author xyfancy
* @author https://github.com/JavaLearningbyCSE/thinkinginjava/wiki
* @version 1.0
*/
public class Ex9 {
	/** Entry point to class and applicantion.
	* @param args array of string arguments
	*/
	public static void main(String[] args) {
		//boolean test
		Boolean t0 = true;
		boolean t0_ = t0;
		System.out.println("boolearn test : " + t0_);
		//char test
		Character t1 = 'a';
		char t1_ = t1;
		System.out.println("char test : " + t1_);
		//byte test
		Byte t2 = 'b';
		byte t2_ = t2;
		System.out.println("byte test : " + t2_);
		//short test
		Short t3 = 2;
		short t3_ = 2;
		System.out.println("short test : " + t3_);
		//int test
		Integer t4 = 3;
		int t4_ = t4;
		System.out.println("int test : " + t4_);
		//long test
		Long t5 = 4L;
		long t5_ = t5;
		System.out.println("long test : " + t5_);
		//float test
		Float t6 = 5.23f;
		float t6_ = t6;
		System.out.println("float test : " + t6_);
		//double test
		Double t7 = 6.23d;
		double t7_ = t7;
		System.out.println("double test : " + t7_);
		//void 无法实例化 而 Void属于类 可以实例化
		Void t8 = null;
		System.out.println("Void test : " + t8);	
	}
} /* Output:
boolearn test : true
char test : a
byte test : 98
short test : 2
int test : 3
long test : 4
float test : 5.23
double test : 6.23
Void test : null
*///:~
