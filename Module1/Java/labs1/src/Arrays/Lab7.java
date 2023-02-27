package Arrays;
import java.util.*;

import java.util.Scanner;

public class Lab7 {
	
	public int getInt(String prompt) {
		System.out.println(prompt);
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}
	
	public void start() {
		int[] numbers = {1, 3, -5, 7, 0, 4, 6, 8};
		task1(numbers);
		task2(numbers);
		task3(numbers);
		task4(numbers);
		task5(numbers);
		sort(numbers); // In order to this method works, comment out above calling methods (lines 16-20) as well as their methods below (lines 27-70):
	
	}
	
	
	
	public void task1(int[] arrayOfnumbers) {
		int sum = 0;
		for (int number: arrayOfnumbers) {
			sum += number;
		}
		System.out.printf("The sum of the numbers is %d", sum);
		System.out.println("\n");
	}
	
	public void task2(int[] arrayOfnumbers) {
		int sum = 0;
		for (int number: arrayOfnumbers) {
			sum += number;
		}
		System.out.printf("The average is %d", sum/arrayOfnumbers.length);
		System.out.println("\n");
	}
	
	public void task3 (int[] arrayOfnumbers) {
		Arrays.sort(arrayOfnumbers);
		System.out.printf("The minimun number is %d", arrayOfnumbers[0]);
		System.out.println("\n");
	}
	
	public void task4 (int[] arrayOfnumbers) {
		//Arrays.sort(arrayOfnumbers);
		System.out.printf("The maximum number is %d", arrayOfnumbers[arrayOfnumbers.length-1]);
		System.out.println("\n");
	}
	
	public void task5 (int[] arrayOfnumbers) {
		
		//This is just to make sure the order of the array
		System.out.println(Arrays.toString(arrayOfnumbers));
		
		for (int i = 0; i < arrayOfnumbers.length; i++) {
			
			if (arrayOfnumbers[i] == 0) {
				System.out.printf("The index of 0(zero) is %d", i);
				System.out.println("\n");
			}
		}

	}
	
	
	
	
	public void sort(int[] anArray) {
		
		int[] originalArray = Arrays.copyOf(anArray, anArray.length);
		Arrays.sort(originalArray);
		
		int count = 1;
		
			do {
				
				for (int i = 0; i < anArray.length-1; i++) {
					
					int nextArrItem = anArray[i+1];
					//System.out.println("This is the next item: " + nextArrItem);
					//System.out.println("This is the before item: " + anArray[i]);
					
					if (nextArrItem < anArray[i]) {
						//System.out.printf("The next item %d is smaller than the before item %d\n", nextArrItem, anArray[i]);
						anArray[i+1] = anArray[i];
						anArray[i] = nextArrItem;
						//System.out.println(Arrays.toString(anArray));
						//System.out.println("\n"); 
						
					}
					
				}
				System.out.println("Run number " + count + ": " + Arrays.toString(anArray));			
				++count;
				
			} while (!Arrays.equals(originalArray, anArray));
				
			System.out.println("The final result is" + Arrays.toString(anArray));
			
	}

}
