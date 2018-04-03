import javax.swing.JOptionPane;

public class MyMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = JOptionPane.showInputDialog("Enter your name and press OK");
		System.out.printf("Hello %s", name);
	}

}
