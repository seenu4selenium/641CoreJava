package corejavatopics;

import java.util.Iterator;

public class ArraysDemo {

	public static void main(String[] args) {
		int a = 90;
		String b = "Hi";
		char c = 'r';
		// Array: To store multiple set of values [] [][] [][][]
		int d[] = { 1, 435, 457, 34634, 4, 346, 547, 957, 5 };

		// Length of array?
		System.out.println(d.length);// 9
		// get the specific value from array based on the index
		System.out.println(d[5]);
		System.out.println("***************");

		// Print all array values?
		for (int i = 0; i < d.length; i++) {// 1<9
			System.out.println(d[i]);
		}
		System.out.println("***************");

		// Print all array values using advance for loop / Enhanced for loop / FOR EACH
		// loop?
		for (int i : d) {
			System.out.println(i);
		}

	}

}
