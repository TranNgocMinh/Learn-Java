import java.util.Scanner;

public class MyMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner console = new Scanner(System.in);
		System.out.print("Enter a = ");
		int a = console.nextInt();
		System.out.print("Enter b = ");
		int b = console.nextInt();
		System.out.println();
		int c = a + b;
		System.out.printf("a + b = %d", c);
	}

}
