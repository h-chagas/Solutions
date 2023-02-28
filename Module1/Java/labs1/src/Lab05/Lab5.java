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
		String question = getString("Is this summertime?");
		boolean isSummertime = false;
		
		if (question == "yes") {
			isSummertime = true;
		}
		System.out.println(isSummertime);
		
	}

	

}
