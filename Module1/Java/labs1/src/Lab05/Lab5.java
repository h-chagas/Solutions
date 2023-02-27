package Lab05;

import java.util.Scanner;

public class Lab5 {
	
	public int getInt(String prompt) {
		System.out.println(prompt);
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}
	
	public void grades() {
		int examMark = getInt(" What is your exam mark?");
		if (examMark < 1 || examMark > 100) {
			System.out.println("Error: Marks must be between 1 - 100. Try again!");
		} else if  (examMark < 50) {
			System.out.println("Fail");
		} else if () {
			
		}
	}

	

}
