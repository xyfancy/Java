//: ChapterTwo/Ex10/Ex10.java
// {args : A B C}
/****************** Ex10*****************
* Write a program that prints three arguments taken from
* the command line. You'll need to index into the command-line
* array of Strings.
************************************************/

/** This is a class created for ChapterTwo Ex10
* @author xyfancy
* @author https://github.com/JavaLearningbyCSE/thinkinginjava/wiki
* @version 1.0
*/
public class Ex10 {
	/** Entry point to class and applicantion.
	* @param args array of string arguments
	*/
	public static void main(String[] args) {
		if (args.length != 3) {
			System.out.println("The number of  parameters must be 3!");
			return;
		} else {
			for(int i = 0; i < args.length; i++){
				System.out.println("args "+i+" is "+args[i]);
			}
		}
	}
} /* Output:
args 0 is A
args 1 is B
args 2 is C
*///:~
