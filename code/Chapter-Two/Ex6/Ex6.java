//: ChapterTwo/Ex6/Ex6.java
// {args : test}
/****************** Ex6*****************
* Write a program that includes and calls the storage() method defined as a code fragment in this chapter
************************************************/

/** This is a class created for ChapterTwo Ex6
* @author xyfancy
* @author https://github.com/JavaLearningbyCSE/thinkinginjava/wiki
* @version 1.0
*/
public class Ex6 {
	/** An int field */
	int i;
	/** storage method 
	* @param s  a string
	* @return 2 times the length of the string input 
	*/
	public static int storage(String s){

		return s.length()*2;
	}
	/** Entry point to class and applicantion.
	* @param args array of string arguments
	*/
	public static void main(String[] args) {
		if(args.length == 0){
			System.out.println("You should input the string like\"java Ex_6 test\"");
		} else {
			System.out.println(storage(args[0]));
		}
	}
} /* Output:
8(when input test)
*///:~
