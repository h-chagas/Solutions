package lab03;
import java.util.Scanner;

public class Lab3Exercise {

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
	
	public void theLunchQueue() {
		int age = getInt("Please enter your age: ");
		String name = getString("Please enter your name: ");
		String mainCourse = getString("What main dish would you like (Fish, Burgers or veg) ?");
		int roastPot = getInt("How many roast potatoes would you like?");
		int brusselsSpr = getInt("How many Brussels Sprouts would you like?");
		System.out.printf("Hello %s, your lunch is %s with %d roast potatoes and %d Brussel sprouts\n", name, mainCourse, roastPot, brusselsSpr);
		System.out.println(" ");
	}
	
	public void convertInputToStonesPounds() {
		int pounds = getInt("Please, what's your weight in pounds? ");
		float newFloat = (float) pounds;
		System.out.printf("Your weight in stones is %.2f \n", newFloat / 14);
		System.out.println(" ");
		
	}
	
	public void convertKgstoStonesPounds() {
		int kg = getInt("Please insert your weight in kilograms: ");
		double kgToPounds = kg * 2.20462;
		System.out.printf("Your weight in pounds is %.2f pounds \n", kgToPounds);
	}
	
}
