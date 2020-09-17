package swings;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class MenuPage {

	private JFrame frame;
    private JRadioButton rbtnBookASeat;
	private JRadioButton rbtnDisplayAllP;
	private JRadioButton rbtnDisplayAllS;
    private JRadioButton rbtnSearch;
    private JRadioButton rbtnExit;
    private BookASeat bs;
    private PrintScreen ps;
    
    public static Bus bus = new Bus("35 DEU", 10);
    
	public MenuPage() 
	{
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 286);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblMenu = new JLabel("MENU");
		lblMenu.setBounds(123, 30, 46, 14);
		frame.getContentPane().add(lblMenu);
		
		rbtnBookASeat = new JRadioButton("Book a seat");
		rbtnBookASeat.setBounds(60, 51, 109, 23);
		rbtnBookASeat.setSelected(true);
		frame.getContentPane().add(rbtnBookASeat);
		
		rbtnDisplayAllP = new JRadioButton("Display all passengers with their seat numbers");
		rbtnDisplayAllP.setBounds(60, 77, 323, 23);
		frame.getContentPane().add(rbtnDisplayAllP);
		
		rbtnDisplayAllS = new JRadioButton("Display all available seatIDs");
		rbtnDisplayAllS.setBounds(60, 103, 213, 23);
		frame.getContentPane().add(rbtnDisplayAllS);
		
		rbtnSearch = new JRadioButton("Search");
		rbtnSearch.setBounds(60, 129, 109, 23);
		frame.getContentPane().add(rbtnSearch);
		
		rbtnExit = new JRadioButton("Exit");
		rbtnExit.setBounds(60, 155, 109, 23);
		frame.getContentPane().add(rbtnExit);
		
		ButtonGroup btnG = new ButtonGroup();
		btnG.add(rbtnBookASeat);
		btnG.add(rbtnDisplayAllP);
		btnG.add(rbtnDisplayAllS);
		btnG.add(rbtnSearch);
		btnG.add(rbtnExit);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				if(rbtnBookASeat.isSelected())
				{
					bs = new BookASeat(frame);
					bs.getFrame().setVisible(true);
					frame.setVisible(false);
				}
				else if(rbtnDisplayAllP.isSelected())
				{
					ps = new PrintScreen(frame, 1);
					ps.getFrame().setVisible(true);
					frame.setVisible(false);
				}
				else if(rbtnDisplayAllS.isSelected())
				{
					ps = new PrintScreen(frame, 2);
					ps.getFrame().setVisible(true);
					frame.setVisible(false);
				}
				else if(rbtnSearch.isSelected())
				{
					ps = new PrintScreen(frame, 3);
					ps.getFrame().setVisible(true);
					frame.setVisible(false);
				}
				else
				{
					System.exit(0);
				}
			}
		});
		btnOk.setBounds(218, 193, 89, 23);
		frame.getContentPane().add(btnOk);
		
	}


	public JFrame getFrame() {
		return frame;
	}


	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
