import java.awt.*;
import javax.swing.*;
 
public class MainClass extends JFrame {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		MainClass mainWindow = new MainClass();
		
	}
	public MainClass() {
		// thiết lập kích thước cửa sổ
		this.setSize(640, 480);
		// thiết lập thao tác đóng cửa sổ
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		// cho phép cửa sổ hiển thị
		this.setVisible(true);
	} 
}
