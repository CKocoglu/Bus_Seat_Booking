package swings;

import java.awt.EventQueue;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PrintScreen {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
    
	
	public JFrame getFrame() {
		return frame;
	}


	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
	
	public PrintScreen(JFrame superF, int type) {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 717, 521);
		frame.getContentPane().setLayout(null);
		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				superF.setVisible(true);
				try {
					this.finalize();
				} catch (Throwable e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 55, 681, 416);
		
		frame.getContentPane().add(textArea);
		
		JPanel panel = new JPanel();
		panel.setBounds(81, 6, 503, 38);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("Name :");
		label.setBounds(38, 9, 34, 14);
		panel.add(label);
		
		textField = new JTextField();
		textField.setBounds(77, 6, 86, 20);
		textField.setColumns(10);
		panel.add(textField);
		
		JLabel label_1 = new JLabel("Surname:");
		label_1.setBounds(188, 9, 59, 14);
		panel.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(257, 6, 86, 20);
		textField_1.setColumns(10);
		panel.add(textField_1);
		
		JButton button = new JButton("Search");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				textArea.setText(MenuPage.bus.search(textField.getText(), textField_1.getText()));
				
			}
		});
		button.setBounds(392, 5, 76, 23);
		panel.add(button);
		
		panel.setVisible(false);
		
		if(type == 1)
		{
			textArea.setText(MenuPage.bus.printAllPassengers());
		}
		else if(type == 2)
		{
			textArea.setText(MenuPage.bus.printAllAvailableSeatIDs());
		}
		else
		{
			panel.setVisible(true);
			
		}
		
	}
}
