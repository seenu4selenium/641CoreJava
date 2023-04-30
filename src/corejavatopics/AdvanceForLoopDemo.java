package corejavatopics;

public class AdvanceForLoopDemo {
	public static void main(String[] args) {
		String a[] = { "hi", "Hello", "MyMobile num: 9728908819", "3535" };
		for (String uma : a) {
			System.out.println(uma);
		}
		System.out.println("***********");

//		a= 97
//				z=122

		// Print alphabets
		for (char abc = 'A'; abc <= 'Z'; abc++) {//98<=122
			System.out.print(abc);
		}
	}
}
