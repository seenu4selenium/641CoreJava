package corejavatopics;

public class StaticMethodDemo {
	int a = 2000;
	int b = 520;
	
	//Non-static method
	public void add() {
		int a = 90;
		int b = 565;
		System.out.println(a + b);
	}

	public void sub() {
//		int a = 101;
//		int b = 50;
		System.out.println(a - b);
	}
//Main method always should contains static keyword
	public static void main(String[] args) {
		//Non-static methods (Add / sub) you should not call directly in Main method
		//To call non-static methods into main method,Create object/Reference 
		//CLASSNAME referenceName = new CLASSNAME();
		StaticMethodDemo g = new StaticMethodDemo();
		g.add();
		g.sub();
	
	}

}
