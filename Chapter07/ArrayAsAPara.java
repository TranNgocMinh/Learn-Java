//mảng được dùng như tham số của phương thức
public class MyMainClass {

	public static void main(String[] args)  {
		
		int[] arrInt = {2,4,8,9};
		printArray(arrInt);
			
		}
	public static void printArray(int[] array) {
		   for (int i = 0; i < array.length; i++) {
		      System.out.print(array[i] + " ");
		   }
		}
			
}
