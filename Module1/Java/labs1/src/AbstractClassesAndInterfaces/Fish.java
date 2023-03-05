package AbstractClassesAndInterfaces;

public class Fish extends Animal implements Consumable, Insurable {
	String name;
	
	public Fish(String name) { //constructor
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public String describeTaste() {
		return getName() + ": " + "Delicate";
	}
	
	public String expires() {
		return "This fish expires today";
	}

	
	public String getPremium() {
		return "This is the premium Fish";
	}
	
	public String isMainCourseDish() {
		return getName() + ": " + true;
	}
	
}
