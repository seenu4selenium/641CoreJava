package corejavatopics;

public class AgeDemo2 {
	public static void main(String[] args) {
		int age = 101;

		if (age > 0) {
			if (age <= 2) {
				System.out.println("Age comes under : Infant");
			}
			else if (age <= 12) {
				System.out.println("Age comes under : Child");
			}
			else if (age <= 25) {
				System.out.println("Age comes under : Youth");
			}
			else if (age <= 59) {
				System.out.println("Age comes under : Adult");
			}
			else if (age <= 100) {
				System.out.println("Age comes under : Sr.Citizen");
			}else {
				System.out.println("Please enter age in between 1 to 100");
			}
		} 

	}
}
