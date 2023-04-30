package corejavatopics;

import java.util.Iterator;

public class LagerAndSmallNumberInAnArray {
	public static void main(String[] args) {
		int a[] = { 12, 545, 698, 15748, 9542, 1, 21, 5448, 7 };
		int maxNum = a[0];//12
		int minNum = a[0];//12
		System.out.println(a.length);// 9

		for (int i = 1; i < a.length; i++) {
			// compare the maxNum with other index values
			if (maxNum < a[i]) {
				maxNum = a[i];
			}
			if (minNum > a[i]) {
				minNum = a[i];
			}
		} // for loop end
		System.out.println("Array Max number is: " + maxNum);
		System.out.println("Array Min number is: " + minNum);

	}
}
