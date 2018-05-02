public class Animal {
	public boolean voluntaryMotion;
	protected boolean requiresFood;
	public Animal(){
		voluntaryMotion = true;
		requiresFood = true;
	}
}

public class Insect extends Animal {
	public boolean antennas;
	public String skeleton;
	public int numberOfLegs;
	public boolean wings;
	public Insect(){
		super();
		antennas = true;
		skeleton = "Exosketon";
		numberOfLegs = 6;
		wings = true;
	}
	public void Print() {
		System.out.println("Antennas: " + antennas +
				" Skeleton: " + skeleton +
				" Number of Legs: " + numberOfLegs +
				" Wings: " + wings +
				" Voluntary Motion: " + voluntaryMotion +
				" Requires Food: " + requiresFood);
	}
}

public class MyMainClass {

	public static void main(String[] args)  {
			
		// Create an instance of Insect called i.
		Insect i = new Insect();
		// Change the insect class's members:
		i.antennas = false;
		i.numberOfLegs = 100;
		// Call the Insect's Print method:
		i.Print();
		// Change the parent class's requiresFood member:
		i.requiresFood = false;
		
		}
			
}
