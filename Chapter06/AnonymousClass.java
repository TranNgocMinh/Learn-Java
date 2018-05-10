public class MainClass {
	// Lớp cha 
	static class OutputLyrics {
		public void output() {
			System.out.println("No lyrics supplied...");
		}
	}
	public static void main(String[] args) {
	//tạo một thể hiện từ lớp OutputLyrics.
	OutputLyrics regularInstance = new OutputLyrics();
	// tạo một lớp nặc danh thừa kế từ lớp OutputLyrics
	OutputLyrics anonymousClass = new OutputLyrics() {
		public void output() {
			System.out.println(
				"Desmond has a barrow in the market place.");
		}
	};
	// gọi output dùng thể hiện của OutputLyrics
	regularInstance.output();
	// gọi output dùng thể hiện lớp nặc danh
	anonymousClass.output();
	}
}
