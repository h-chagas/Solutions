package lab04;

import java.util.Scanner;

public class Lab04 {
	
	public int getInt(String prompt) {
		System.out.println(prompt);
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}
	
	public void part1() {
		
		int bagPrice = getInt("Price of a bag, please?");
		int moneyInPocket = getInt("How much money do you have?");
		if (bagPrice <= 0) {
			System.out.println("The bag price should be a positive number. Please try again");
		} else if (bagPrice > moneyInPocket && moneyInPocket > 0) {
			int lackingMoney = bagPrice - moneyInPocket;
			System.out.printf("%d pence left to buy at least a bag", lackingMoney);
		} else if (moneyInPocket == 0) {
			System.out.println("Come back with your pocket money");
		} else {
			int bagsCanAfford = moneyInPocket / bagPrice;
			System.out.printf("If the price is %d pence and you have %d, then you will be able to buy %d bags.", bagPrice, moneyInPocket, bagsCanAfford);
		}
		
	}
	
	
	
}
