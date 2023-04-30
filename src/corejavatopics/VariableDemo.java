package corejavatopics;

public class VariableDemo {
	// Global variable+
	static int a = 50;
	static int b = 31;

	public static void add() {
		// Local variable
		 int a = 90;
		// int b = 45;
		System.out.println("Add results is : " + (a + b));//90+31=121
	}// add method end

	public static void sub() {
		// Local variable
		// int a = 101;
		int b = 20;
		System.out.println("Sub results is : " + (a - b));//50-20=30
	}// sub method end

	public static void main(String[] args) {
		add();
		sub();
	}
}
