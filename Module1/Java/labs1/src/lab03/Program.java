package lab03;
import java.util.Scanner;

public class Program {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			int age = getInt("Please enter your age: ");
			String name = getString("Please enter your name: ");
			
			//theLunchQueue();
			convertInputToStonesPounds(); 
			
		}

		public static int getInt(String prompt) {
			System.out.println(prompt);
			Scanner s = new Scanner(System.in);
			return s.nextInt();
		}
		
		public static String getString(String prompt) {
			System.out.println(prompt);
			Scanner s = new Scanner(System.in);
			return s.nextLine();
		}
		
		public static void theLunchQueue() {
			String mainCourse = getString("What main dish would you like (Fish, Burgers or veg) ?");
			int roastPot = getInt("How many roast potatoes would you like?");
			int brusselsSpr = getInt("How many Brussels Sprouts would you like?");
			System.out.printf("Hello, your lunch is %s with %d roast potatoes and %d Brussel sprouts\n", mainCourse, roastPot, brusselsSpr);
			
		}
		
		public static void convertInputToStonesPounds(int pounds) {
			int pounds = getInt("")
		}
		
		//Finish part 3 - Weight Conversions (introduction to methods)

}
