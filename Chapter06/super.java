//Abstract parent class:
public abstract class Person {
	//Member variables:
	String name;
	int age;
	//Default constructor
	public Person() {
		name = "Minh";
		age = 18;
	}
	//Another constructor
	public Person(String name, int age) {
		this.name = name ;
		this.age = age;
	}
	// Member method
	public void Intro() {
		System.out.println("My name is " + name + " and I am " + age + " years old.");
	}
	//Abstract method:
	public abstract void Talk();
}
public class Student extends Person {
	//constructor
	public Student() {
 		//super();
		//super("Minh",18);	
}
	...
}
