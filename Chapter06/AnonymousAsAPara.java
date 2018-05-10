public class MainClass {
	// interface
	interface MathOperation {
		public int operation(int a, int b);
	}
	// Phương thức nhận một đối tượng như một tham số
	static int performOperation(int a, int b, MathOperation op) {
		return op.operation(a, b);
	}
	public static void main(String[] args) {
		
		int x = 100;
		int y = 97;
		// Gọi hàm PerformOperation với phép cộng:
		int resultOfAddition = performOperation(x, y,
			// lớp nặc danh như là một tham số
			new MathOperation() {
				public int operation(int a, int b) {
					return a + b;
				}
			});
		// Gọi hàm PerformOperation phép trừ:
		int resultOfSubtraction = performOperation(x, y,
			// lớp nặc danh như là một tham số
			new MathOperation() {
				public int operation(int a, int b) {
					return a - b;
				}
			});
		// Output Addition: 197
		System.out.println("Addition: " + resultOfAddition);
		// Output Subtraction: 3
		System.out.println("Subtraction: " + resultOfSubtraction);
	}
}
