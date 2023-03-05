package AbstractClassesAndInterfaces;

public class Program {

	public static void main(String[] args) {
		Penguin myPenguin = new Penguin("Happy Feet");
		Fish myFish = new Fish("Dory");
		Duck myDuck = new Duck("Ducky");

		//myPenguin.getName();
		//myPenguin.describeTaste();
		
		
		
		String[] animals = {myPenguin.getName(), myFish.getName(), myDuck.getName()};
		
		for (String a : animals)
			System.out.println("This is a " + a);

	}

}
