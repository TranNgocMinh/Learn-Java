import java.io.*;
import java.util.*;

public class MyMainClass {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		Scanner inFile = new Scanner(new FileReader("D:\\LearnJava\\Data.txt"));
		String greeting = inFile.next();
		String name = inFile.next();
		System.out.print(greeting + " "+name);
		inFile.close();
		
	}
	

}
