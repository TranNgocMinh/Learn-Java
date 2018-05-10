//Abstract parent class:
public abstract class Person {
	//Abstract method:
	public abstract void Talk();
}
public class Student extends Person {
	public void Talk() {
		System.out.println("I am a Student!");
	}
}
public class Employee extends Person {
	public void Talk() {
		System.out.println("I am an Employee!");
	}
}
public class MainClass {
	
	public static void main(String[] args) {
	    Person student = new Student();
      student.Talk();// I am a Student!
      Person employee = new Employee();
      employee.Talk();// I am an Employee!
	}
}
