import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class MainClass extends JFrame implements ActionListener{

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		MainClass mainWindow = new MainClass();
		
	}
	public MainClass() {
		
		// tạo một đối tượng JPanel
		JPanel panel = new JPanel(new FlowLayout());
		
		// Thêm một JLabel
		JLabel lbName = new JLabel("Test button: ");
		panel.add(lbName);
		//Thêm một JButton
		JButton btnClickMe = new JButton("Click here to display a message!");
		panel.add(btnClickMe);
		// Thiết lập nội dung hiện tại cho panel
		this.setContentPane(panel);
		//lắng nghe sự kiện từ button
		btnClickMe.addActionListener(this);
		// thiết lập kích thước cửa sổ
		this.setSize(640, 480);
		// thiết lập thao tác đóng cửa sổ
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		// cho phép cửa sổ hiển thị
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// Hiển thị hộp thông điệp
		JOptionPane.showMessageDialog(null,
		"You clicked on the button!");
	}
	
}
