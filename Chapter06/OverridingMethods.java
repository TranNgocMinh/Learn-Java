//Abstract parent class:
public abstract class Person {
	//Member variables:
	String name;
	int age;
	// Member method
	public void Intro() {
	System.out.println("My name is " + name + " and I am " + age + " years old.");
	}
	//Abstract method:
	public abstract void Talk();
}
public class Student extends Person {
	public void Talk() {
		System.out.println("I am a Student!");
	}
	@Override
	public void Intro() {
		System.out.println("I love reading!");
	}
}
