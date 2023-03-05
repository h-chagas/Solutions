package lab06;

import java.util.Scanner;

public class Lab6 {
	
	public int getInt(String prompt) {
		System.out.println(prompt);
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}
	
	public void part1() {
				
		//String[] names = new String[5]; OR
		//String[] names;
		//names = new String[5];
		
		//int[] marks = new int[5]; OR
		//int[] marks;
		//marks = new int[5];
		
		String[] names = {"Peter", "Ellen", "Kim", "David", "John", "Emma", "Tandes"};
		int[] marks = {100, 90, 87, 71, 65, 50, 12};
		
		for (int i = 0; i < names.length; i++) {
			
			System.out.printf("The student %s has scored %d in the test", names[i], marks[i]);
			
			//int examMark = getInt("What is your exam mark?");
			if (marks[i] < 1 || marks[i] > 100) {
				System.out.println("Error: Marks must be between 1 - 100. Try again!");
			} else if  (marks[i] > 70) {
				System.out.println(", passed with Distinction");
			} else if (marks[i] > 60) {
				System.out.println(", passed with Merit");
			} else if (marks[i] >= 50) {
				System.out.println(" and received a Pass");
			} else {
				System.out.println(" and Fail");
			}
			System.out.println("\n");
		
		}
			
	}
	
	public void account() {
		double initialMoney = 0.00d;
		double currentMoney = 0.00d;
		double interestRate = 1.05d;
		int percentage = 5;
		String percentageSign = "%";
		int years = 0;
		
		initialMoney = getInt("How much would be your initial investment? ");
		currentMoney += initialMoney;
		
		while (currentMoney < 200) {
			currentMoney = currentMoney * interestRate;
			++years;
		}
		System.out.printf("Your initial investment is %.2f. It takes %d years to reach £ 200, in a interest rate of %d %s", initialMoney, years, percentage, percentageSign);
		
	}
	

}
