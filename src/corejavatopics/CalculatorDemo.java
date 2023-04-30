package corejavatopics;

import java.util.Scanner;

public class CalculatorDemo {
	static int a;
	static int b;
	static String c, d;

	// Give inputs from Console for a and b
	// System.in: Console
	static Scanner s = new Scanner(System.in);
	// Get the user input from console

	public static void add() {
		System.out.println(a + b);
	}

	public static void sub() {
		System.out.println(a - b);
	}

	public static void stringConcat() {
		System.out.println(c + d);
		System.out.println(c.toUpperCase());
		System.out.println(d.toLowerCase());
	}

	public static void main(String[] args) {
		System.out.println("Please enter Two numbers:");
		a = s.nextInt();
		b = s.nextInt();
		System.out.println("Please enter Two String content:");
		c = s.next();
		d = s.next();
		System.out.println("****************************");

		add();
		sub();
		stringConcat();
	}

}
