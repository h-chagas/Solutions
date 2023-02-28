package Lab05;

import java.util.Scanner;

public class Lab5 {
	
	public int getInt(String prompt) {
		System.out.println(prompt);
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}
	
	public String getString(String prompt) {
		System.out.println(prompt);
		Scanner s = new Scanner(System.in);
		return s.nextLine();
	}
	
	public void grades() {
		int examMark = getInt("What is your exam mark?");
		if (examMark < 1 || examMark > 100) {
			System.out.println("Error: Marks must be between 1 - 100. Try again!");
		} else if  (examMark > 70) {
			System.out.println("Distinction");
		} else if (examMark > 60) {
			System.out.println("Merit");
		} else if (examMark >= 50) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}
	
	public void eveningBehaviours() {
		boolean isSummertime = false;
		boolean isSunnyEvening = false;
		
		String question1 = getString("Is this summertime?");
		String question2 = getString("Is this summertime?");
		
		if (question1.equals("yes"))
			isSummertime = !isSummertime;
		
		if (question2.equals("yes"))
			isSunnyEvening = !isSunnyEvening;
		
		if (isSummertime && isSunnyEvening) {
			System.out.println("Take a shower, eat outside, do outdoor hobby and contact friend");
		} else if (isSummertime && !isSunnyEvening) {
			System.out.println("Take a shower, eat inside, do outdoor hobby and contact friend");

		} else if (!isSummertime && isSunnyEvening) {
			System.out.println("Take a shower, eat inside, take a walk and contact friend");

		} else if (!isSummertime && !isSunnyEvening) {
			System.out.println("Take a shower, eat inside and contact friend");

		}
			
		
		//System.out.println(isSummertime);
		//System.out.println(isSunnyEvening);
		
	}

	

}
