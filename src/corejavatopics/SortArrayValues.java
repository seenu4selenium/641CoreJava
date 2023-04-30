package corejavatopics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortArrayValues {

	public static void main(String[] args) {
		char a[] = { 'Q', 'A', 'T', 'O' };
		for (char c : a) {
			System.out.println(c);
		}
		System.out.println("******** Sorting with Afphabetical order**********");
		Arrays.sort(a);//AOTQ
		for (char ch : a) {
			System.out.print(ch);
		}
	}

}
