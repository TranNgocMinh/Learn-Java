import java.awt.*;
import javax.swing.*;
 
public class MainClass extends JFrame {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		MainClass mainWindow = new MainClass();
		
	}
	public MainClass() {
		
		// tạo một đối tượng JPanel
		JPanel panel = new JPanel(new FlowLayout());
		
		JButton btn = new JButton("Initial Text");
		btn.setText("New text!"); 
		String text = btn.getText();
		btn.setVisible(false); 
		btn.setVisible(true); 
		btn.setMargin(new Insets(100, 100, 100, 100)); 
		Dimension dim = btn.getSize();
		btn.setBackground(Color.BLUE);
		btn.setForeground(Color.WHITE); 
		btn.setEnabled(false); 
		btn.setEnabled(true); 
		btn.setSize(new Dimension(10, 10));
		btn.setBounds(new Rectangle(20, 20, 200, 60));
		panel.add(btn);
		
    // Thiết lập nội dung hiện tại cho panel
		this.setContentPane(panel);
		// thiết lập kích thước cửa sổ
		this.setSize(640, 480);
		// thiết lập thao tác đóng cửa sổ
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		// cho phép cửa sổ hiển thị
		this.setVisible(true);
	} 
}
