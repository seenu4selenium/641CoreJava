package corejavatopics;

public class AgeDemo {
	public static void main(String[] args) {
		int age = 45;

		if (age > 0 && age <= 2) {
			System.out.println("Age comes under : Infant");
		} else if (age > 2 && age <= 12) {
			System.out.println("Age comes under : child");
		} else if (age > 12 && age <= 25) {
			System.out.println("Age comes under : youth");
		} else if (age > 25 && age <= 59) {
			System.out.println("Age comes under : Adult");
		} else if (age > 59 && age <= 100) {
			System.out.println("Age comes under : Sr.Citizen");
		} else {
			System.out.println("Please enter age in betwseen 1-to 100");
		}

	}
}
