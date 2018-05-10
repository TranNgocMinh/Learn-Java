public class MyMainClass {

	public static void main(String[] args)  {
		float[][] arr2D = new float[7][5];
        	arr2D[0][0] = 50.5f;
       		arr2D[4][4] = 60.5f;
        	arr2D[3][1] = 10.3f;
        	for (int i = 0; i < 7; i++) { 
	        	for (int j = 0; j < 5; j++)
		            System.out.print(array2d[i][j] + " ");
	        System.out.println();			   
        	}			
	}
}
//Kết quả:
50.5 0.0 0.0 0.0 0.0 
0.0 0.0 0.0 0.0 0.0 
0.0 0.0 0.0 0.0 0.0 
0.0 10.3 0.0 0.0 0.0 
0.0 0.0 0.0 0.0 60.5 
0.0 0.0 0.0 0.0 0.0 
0.0 0.0 0.0 0.0 0.0
