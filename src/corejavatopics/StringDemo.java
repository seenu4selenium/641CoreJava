package corejavatopics;

public class StringDemo {

	public static void main(String[] args) {

		int a = 90909;
		System.out.println(a);

		String b = "SeleniumNew";
		String c = "How are You?";
		String d = "My mobile no is: 9728908819";

		// Length: always starts with one(1)
		System.out.println(c.length());

		// Index: always starts with zero(0)
		System.out.println(b.charAt(5));
		System.out.println(c.charAt(4));

		// Convert String to Lowercase/uppercase
		System.out.println(c.toLowerCase());
		System.out.println(c.toUpperCase());
		System.out.println(c);

		System.out.println(b + ":::" + c);
		System.out.println(b + " " + c);
		System.out.println(b + "," + c);

		String e = "Apple";
		String f = "mango";
		// e and f String are equal?
		if (e.equals(f)) {
			System.out.println("Both the  String are  matching");
		} else {
			System.out.println("Both the  String are not matching");
		}

		if (e.equalsIgnoreCase(f)) {
			System.out.println("Both the  String are  matching***");
		} else {
			System.out.println("Both the  String are not matching***");
		}

		//While concatenating variables, data types should be same
		String g = "50";
		int h = 40;
		System.out.println(g+h);//5040
		
		//Convert String to int
		int i = Integer.parseInt(g);
		System.out.println(i+h);
		
		//convert int to String
		String j = Integer.toString(h);
		System.out.println(g+j);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
