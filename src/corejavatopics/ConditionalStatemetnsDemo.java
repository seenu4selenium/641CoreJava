package corejavatopics;

public class ConditionalStatemetnsDemo {

	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		int c = 21;

		// Find large number?
		// the condition is TRUE, system will go to IF block
		// the condition is FALSE, system will go to ELSE block
		if (a > b && a > c) {
			System.out.println("a is large value");
		} else if (b > a && b > c) {
			System.out.println("b is large value");
		} else if (c > a && c > b) {
			System.out.println("c is large value");
		} else {
			System.out.println("are equal");
		}

		// Nested if
//		if (condition) {
//			if (condition) {
//				
//			}
//		}
	}

}
