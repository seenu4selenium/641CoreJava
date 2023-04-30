package corejavatopics;

import java.util.Random;

public class PrintRandomNumbers {

	public static void main(String[] args) {
		// Print any random number from 0 to 100 Range
		Random r = new Random();
		int ranNum = r.nextInt(100);
		System.out.println(ranNum);
		System.out.println("**************");

		// Generate 10 digit Mobilenumber(Random),
		// but first digit always starts with 9 only.
		String countryCode = "+1-";
		String ranNum0 = "9";
		String ranNum1 = Integer.toString(r.nextInt(10));
		String ranNum2 = Integer.toString(r.nextInt(10));
		String ranNum3 = Integer.toString(r.nextInt(10));
		String ranNum4 = Integer.toString(r.nextInt(10));
		String ranNum5 = Integer.toString(r.nextInt(10));
		String ranNum6 = Integer.toString(r.nextInt(10));
		String ranNum7 = Integer.toString(r.nextInt(10));
		String ranNum8 = Integer.toString(r.nextInt(10));
		String ranNum9 = Integer.toString(r.nextInt(10));

		String paswd = countryCode+ranNum0 + ranNum1 + ranNum2 + ranNum2 + ranNum4 + ranNum5 + ranNum6 + ranNum7 + ranNum8
				+ ranNum9;

		System.out.println(paswd);

	}

}
