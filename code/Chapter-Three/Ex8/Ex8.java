//: ChapterThree/Ex8/Ex8.java
/****************** Ex8*****************
* Write a program that simulates coin-flipping
************************************************/

import static com.github.util.Print.*;
import java.util.Random;

/** This is a class created for ChapterThree Ex8
* @author xyfancy
* @author https://github.com/JavaLearningbyCSE/thinkinginjava/wiki
* @version 1.0
*/
public class Ex8 {
	/** A coin*/
	boolean coin;
	/** Entry point to class and applicantion.
	* @param args array of string arguments
	*/
	public static void main(String[] args) {
		Ex8 a = new Ex8();
		Random r = new Random(47);
		//Filp the coin 10 times
		for(int i=0; i < 10; i++){
			print("Filp the coin...");
			a.coin = r.nextBoolean();
			print("The outcome is " + ( a.	coin ? "Head" : "Tail") + ".\n");
		}

	}
} /* Output:
Filp the coin...
The outcome is Head.

Filp the coin...
The outcome is Tail.

Filp the coin...
The outcome is Head.

Filp the coin...
The outcome is Tail.

Filp the coin...
The outcome is Tail.

Filp the coin...
The outcome is Head.

Filp the coin...
The outcome is Tail.

Filp the coin...
The outcome is Tail.

Filp the coin...
The outcome is Head.

Filp the coin...
The outcome is Head.

*///:~
