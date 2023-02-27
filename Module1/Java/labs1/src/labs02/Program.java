package labs02;

public class Program {

	public static void main(String[] args) {
		
		/*
		int age, houseNumber;
		String name, telephoneNumber, street, postcode, company;
		double salary;
		boolean haveDrivingLicence;
		
		name = "Hugo Chagas";
		age = 35;
		telephoneNumber = "07450599950";
		houseNumber = 1000;
		street = "My street";
		postcode = "OL10 5HU";
		company = "UK Home Office";
		salary = 120000.00;
		haveDrivingLicence = true;
		
		System.out.printf("Hi, my name is %s, I am %d years old. My mobile number is %s. My full address is %d %s, %s. I work for %s, my salary is %.2f. If I have a driving licence? The answer is %b", name, age, telephoneNumber, houseNumber, street, postcode, company, salary, haveDrivingLicence); 
		*/
				
		
		
		
		int number = 5; 
		System.out.println("Initial Value: " + number); 
		
		// Task 1 
		// - double it using the '*' operator 
		number = number * 2;
		// - now double it again using the '*=' operator 
		number *= 2;
		System.out.println("\n1. After doubling it twice: " + number); 
		
		// Task 2 
		// - add 3 to it using the '+' operator 
		number = number + 3;
		// - now add 3 to it using the '+=' operator 
		number += 3;
		System.out.println("\n2. After adding 3 twice: " + number);
		
		// Task 3 - subtract 12 from it using an appropriate 'compound' operator 
		number -= 12;
		System.out.println("\n3. After subtracting 12: " + number); 
	
		// Task 4 - divide the number (ought to be 14 now) by 3 
		number /= 3;
		// what do you think the answer is 
		System.out.println("\n4. After dividing by 3: " + number); 
		
		// Task 5 write 4 different statements that all do the same thing 
		// namely 'add 1 to the number' 
		++number;
		number++;
		number = number + 1;
		number += 1;
		System.out.println("\n5. After adding 1 four times: " + number); 
		
		// Task 6 decrement by 1 the value of number 
		--number;
		System.out.println("\n6. After decrementing once: " + number); 
		
		// Task 7 put the remainder when dividing by 3 into 'remainder' 
		int remainder = 0; 
		remainder = number%3;
		System.out.println("\n7. Remainder when dividing by 3 is :" + remainder); 
		
		// Task 8 
		// decide what it will print before uncommenting the println() 
		int a = 2, b = 3, c = 5; 
		double d1, d2, d3, d4; 
		
		d1 = a + b * c / 2; // 9.0
		d2 = (a + b * c) / 2;  // 8.0
		d3 = (a + b) * c / 2; // 12.0
		d4 = (a + b) * (c / 2); // 10.0
		
		
		System.out.println("\n8. Values: " + d1 + " : " + d2 + " : " + d3 + " : " + d4); 
		// Type your answer here--> 
		
		
		// Task 9 
		int p, q; 
		p = 10; 
		q = 10; 
		p += q++; // p is 20, it will become 21 only after the next operation
		
		// Decide what the next line will print 
		System.out.println("\n9. Result is: " + (p + q)); 
		// Answer--> 31
		
		
		// Task 10 – Uncomment the code below 
		System.out.println("\n11."); 
		
		// Decide what the following 4 lines will print 
		// The 4th one might surprise you 
		
		System.out.println("fred" + 3 + 4); // Answer--> fred34      when the print starts with a string, all the rest is summed as string
		System.out.println(3 + 4 + "fred"); // Answer--> 7fred       when the print starts with numbers, the numbers are summed then concatenated with the string
		System.out.println("" + 3 + 4); // Answer--> 34
		
		
		System.out.println(3 + ' ' + 4); // why this answer??? Answer--> 39
		
		
		
		

	}

}
