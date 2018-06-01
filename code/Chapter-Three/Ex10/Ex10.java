//: ChapterThree/Ex10/Ex10.java
/****************** Ex10*****************
* Literals test. 
************************************************/

import static com.github.util.Print.*;

/** This is a class created for ChapterThree Ex10
* @author xyfancy
* @author https://github.com/JavaLearningbyCSE/thinkinginjava/wiki
* @version 1.0
*/
public class Ex10 {
	/** Entry point to class and applicantion.
	* @param args array of string arguments
	*/
	public static void main(String[] args) {
		//Integer Literals
		print("Integer Literals Test...");
		//DecimalIntegerLiteral
		int  i =  0;
		long j = 7l;
		print("1.DecimalIntegerLiteral:");
		print("i = " + i);
		print("j = " + j);
		//HexIntegerLiteral
		i = 0x0a;
		j = 0X17L;
		print("2.HexIntegerLiteral:");
		print("i = " + i);
		print("j = " + j);
		//OctalIntegerLiteral
		i = 016;
		j = 017L;
		print("3.OctalIntegerLiteral:");
		print("i = " + i);
		print("j = " + j);
		//BinaryIntegerLiteral
		i = 0b0111;
		j = 0B111L;
		print("4.BinaryIntegerLiteral:");
		print("i = " + i);
		print("j = " + j);	

		//Floating-Point Literals
		print("\nFloating-Point Literals Test...");
		//DecimalFloatingPointLiteral
		print("1.DecimalFloatingPointLiteral:");
		float  f0 = 1.2e-3f;
		double d0 = .23e3d;
		f0 = 2f;
		d0 = 3e-3; //3*(10^-3)
		print("f0 = " + f0);
		print("d0 = " + d0);
		//HexadecimalFloatingPointLiteral	
		print("2.HexadecimalFloatingPointLiteral:");
		f0 = 0x01.0p-3f; //(1/(2^3))
		d0 = 0x.1P0d; //(1/16)
		print("f0 = " + f0);
		print("d0 = " + d0);		

		//Boolean Literals
		print("\nBoolean Literals Test...");
		boolean b = true;
		print("b = " + b);

		//Character Literals
		print("\nCharacter Literals Test...");
		//SingleCharacter
		print("1.'SingleCharacter':");
		char ch = 'a';
		print("ch = " + ch);
		ch = '\u03a9';
		print("ch = " + ch);	
		//EscapeSequence
		print("2.'EscapeSequence':");
		ch = '\t';
		print("ch = " + ch + ".");

		//String Literals
		print("\nString Literals Test...");		
		String s0 = "abcde\u03a9";
		print("s0 = " + s0);	

		//The Null Literal
		print("\nThe Null Literals Test...");
		Void v = null;
		print("v = " + v);			

	}
} /* Output:
Integer Literals Test...
1.DecimalIntegerLiteral:
i = 0
j = 7
2.HexIntegerLiteral:
i = 10
j = 23
3.OctalIntegerLiteral:
i = 14
j = 15
4.BinaryIntegerLiteral:
i = 7
j = 7

Floating-Point Literals Test...
1.DecimalFloatingPointLiteral:
f0 = 2.0
d0 = 0.003
2.HexadecimalFloatingPointLiteral:
f0 = 0.125
d0 = 0.0625

Boolean Literals Test...
b = true

Character Literals Test...
1.'SingleCharacter':
ch = a
ch = Ω
2.'EscapeSequence':
ch = 	.

String Literals Test...
s0 = abcdeΩ

The Null Literals Test...
v = null
*///:~
