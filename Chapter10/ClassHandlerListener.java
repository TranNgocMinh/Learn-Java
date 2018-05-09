import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class MainClass extends JFrame{

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		MainClass mainWindow = new MainClass();
		
	}
	public MainClass() {
		
		// tạo một đối tượng JPanel
		JPanel panel = new JPanel(new FlowLayout());
		
		// Thêm một JLabel
		JLabel label1 = new JLabel("Button 1: ");
		panel.add(label1);
		//Thêm button 1
		JButton btn1 = new JButton("Click me!");
		panel.add(btn1);
		btn1.addActionListener(new Button1Handler());
		// Thêm một JLabel
		JLabel label2 = new JLabel("Button 2: ");
		panel.add(label2);
		//Thêm button 2
		JButton btn2 = new JButton("Click me!");
		panel.add(btn2);
		btn2.addActionListener(new Button2Handler());
		// Thiết lập nội dung hiện tại cho panel
		this.setContentPane(panel);
		//lắng nghe sự kiện từ button
		//btnClickMe.addActionListener(this);
		// thiết lập kích thước cửa sổ
		this.setSize(640, 480);
		// thiết lập thao tác đóng cửa sổ
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		// cho phép cửa sổ hiển thị
		this.setVisible(true);
	}
	
	private class Button1Handler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JOptionPane.showMessageDialog(null,"I am button 1");
		}	
	}
	private class Button2Handler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JOptionPane.showMessageDialog(null,"I am button 2");
		}	
	}
}

