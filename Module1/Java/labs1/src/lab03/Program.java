package lab03;
import java.util.Scanner;

public class Program {

		public static void main(String[] args) {
			
			//Create a instance from another class/file, called Lab3Exercise in order to use its methods
			Lab3Exercise myLab3 = new Lab3Exercise();
			
			//Calling the method which is located in the Lab3Exercise.java, that is renamed by the instanced created on line 9 called myLab3
			myLab3.theLunchQueue(); 
			myLab3.convertInputToStonesPounds();
			myLab3.convertKgstoStonesPounds();
			
			
		}
		
}
