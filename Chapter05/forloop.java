public static void main(String[] args)  {
		// TODO Auto-generated method stub
		int i;
		String numseq = "";
		for (i = 1; i <= 10; i++)
		{
		numseq += " " + i;
		}
		System.out.println("The number sequence is "+ numseq);
}
//using for in collections 
public static void main(String[] args)  {
		// TODO Auto-generated method stub
		int[] fibarray = new int[] { 0, 1, 1, 2, 3, 5, 8, 13 };
		for (int element : fibarray)
		{
		System.out.print(" "+ element);
		}
}
