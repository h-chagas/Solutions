package AbstractClassesAndInterfaces;

public class Duck extends Bird implements Insurable {
	
	public Duck(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public String expires() {
		return "This duck expires today";
	}
	
	public String getPremium() {
		return "This is the premium Duck";
	}

}
