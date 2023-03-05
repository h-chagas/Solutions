package AbstractClassesAndInterfaces;

abstract class Bird extends Animal implements Consumable {
	
	AnimalType bird = AnimalType.BIRD;
	
	String name;
	
	public Bird(String name) { //constructor
		this.name = name;
	}
	
	public String getName() {
		//System.out.println(this.name);
		return this.name;
		
	}
	public String describeTaste() {
		//System.out.println(getName() + ": " + "Delicate");
		return getName() + ": " + "Delicate";
	}
	
	public String isMainCourseDish() {
		return getName() + ": " + true;
	}
}
