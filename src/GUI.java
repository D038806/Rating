import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JToolBar;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JPanel;

public class GUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(164, 200, 87, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblmName = new JLabel("Movie name");
		lblmName.setBounds(75, 24, 46, 15);
		frame.getContentPane().add(lblmName);
		
		JLabel lblavg = new JLabel("average");
		lblavg.setBounds(205, 24, 46, 15);
		frame.getContentPane().add(lblavg);
		
		JLabel lblpeople = new JLabel("people");
		lblpeople.setBounds(312, 24, 46, 15);
		frame.getContentPane().add(lblpeople);
		
		JLabel rank1 = new JLabel("New label");
		rank1.setBounds(75, 78, 46, 15);
		frame.getContentPane().add(rank1);
		
		JLabel rank2 = new JLabel("New label");
		rank2.setBounds(75, 103, 46, 15);
		frame.getContentPane().add(rank2);
		
		JLabel rank3 = new JLabel("New label");
		rank3.setBounds(75, 128, 46, 15);
		frame.getContentPane().add(rank3);
		
		JLabel rank4 = new JLabel("New label");
		rank4.setBounds(75, 155, 46, 15);
		frame.getContentPane().add(rank4);
		
		JLabel lblno1 = new JLabel("1.");
		lblno1.setBounds(45, 78, 20, 15);
		frame.getContentPane().add(lblno1);
		
		JLabel lblno2 = new JLabel("2.");
		lblno2.setBounds(45, 103, 20, 15);
		frame.getContentPane().add(lblno2);
		
		JLabel lblno3 = new JLabel("3.");
		lblno3.setBounds(45, 128, 20, 15);
		frame.getContentPane().add(lblno3);
		
		JLabel lblno4 = new JLabel("4.");
		lblno4.setBounds(45, 155, 20, 15);
		frame.getContentPane().add(lblno4);
		
		JLabel no1avg = new JLabel("New label");
		no1avg.setBounds(205, 78, 46, 15);
		frame.getContentPane().add(no1avg);
		
		JLabel no2avg = new JLabel("New label");
		no2avg.setBounds(205, 103, 46, 15);
		frame.getContentPane().add(no2avg);
		
		JLabel no3avg = new JLabel("New label");
		no3avg.setBounds(205, 128, 46, 15);
		frame.getContentPane().add(no3avg);
		
		JLabel no4avg = new JLabel("New label");
		no4avg.setBounds(205, 155, 46, 15);
		frame.getContentPane().add(no4avg);
		
		JLabel no1p = new JLabel("New label");
		no1p.setBounds(312, 78, 46, 15);
		frame.getContentPane().add(no1p);
		
		JLabel no2p = new JLabel("New label");
		no2p.setBounds(312, 103, 46, 15);
		frame.getContentPane().add(no2p);
		
		JLabel no3p = new JLabel("New label");
		no3p.setBounds(312, 128, 46, 15);
		frame.getContentPane().add(no3p);
		
		JLabel no4p = new JLabel("New label");
		no4p.setBounds(312, 155, 46, 15);
		frame.getContentPane().add(no4p);
		
		JPanel panel = new JPanel();
		panel.setBounds(85, 49, 87, 15);
		frame.getContentPane().add(panel);
	}
}
