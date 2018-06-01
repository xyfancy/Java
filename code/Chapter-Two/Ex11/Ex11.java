//: ChapterTwo/Ex11/Ex11.java
/****************** Ex11*****************
* Turn the AllTheColorsOfTheRainbow example into a program that compiles and runs.
************************************************/

/** This is a class created for ChapterTwo Ex11
* @author xyfancy
* @author https://github.com/JavaLearningbyCSE/thinkinginjava/wiki
* @version 1.0
*/
public class Ex11 {
	/** An interger representing colors*/
	int anIntergerRepresentingColors;
	/** Change the hue of the color
	* @param newHue the new Hue of the color
	*/
	void changeTheHueOfTheColor(int newHue){
		anIntergerRepresentingColors = newHue;	
	}	
	/** Entry point to class and applicantion.
	* @param args array of string arguments
	*/
	public static void main(String[] args) {
		Ex11 a = new Ex11();
		System.out.println("The origin hue of the color : " + a.anIntergerRepresentingColors);
		a.changeTheHueOfTheColor(1);		
		System.out.println("The new hue of the color : " + a.anIntergerRepresentingColors);
	}
} /* Output:
The origin hue of the color : 0
The new hue of the color : 1
*///:~
