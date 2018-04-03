import java.io.*;
import java.util.*;

public class MyMainClass {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		// reading data from Input.txt
		Scanner inFile = new Scanner(new FileReader("D:\\LearnJava\\Input.txt"));
		double val1 = inFile.nextDouble();
		double val2 = inFile.nextDouble();
		double result = val1 + val2;
		//storing result to Output.txt
		PrintWriter outFile = new PrintWriter("D:\\LearnJava\\Output.txt");
		outFile.printf(val1 +" + "+ val2 + " = "+ result);
		inFile.close();
		outFile.close();
	}
	

}
