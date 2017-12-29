package ctms.ioana;

import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class bookingWindow extends JFrame {

	public movieWindow parent;
	JLabel lblInfo = new JLabel("BOOKING");
	JButton btnBack = new JButton("BACK");
	JButton btnBook = new JButton("NEXT");
	JComboBox<String> comboBox = new JComboBox<String>();
	JComboBox<String> comboBox_1 = new JComboBox<String>();
	JComboBox<String> comboBox_2 = new JComboBox<String>();
	JComboBox<String> comboBox_3 = new JComboBox<String>();
	
	public bookingWindow() {
		
		this.setVisible(false);
		this.setBounds(100, 100, 507, 344);
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.setLayout(null);
		this.getContentPane().setLayout(null);
		
		
		lblInfo.setBounds(207, 0, 130, 67);
		this.getContentPane().add(lblInfo);
		
		
		btnBack.setBounds(0, 0, 68, 25);
		this.getContentPane().add(btnBack);
		
		
		btnBook.setBounds(423, 280, 68, 25);
		this.getContentPane().add(btnBook);
		
		
		comboBox.setBounds(185, 68, 100, 25);
		this.getContentPane().add(comboBox);
		comboBox.addItem("MOVIE");
		comboBox.addItem("FOOD");
		
		
		comboBox_1.setBounds(185, 130, 100, 25);
		this.getContentPane().add(comboBox_1);
		comboBox_1.addItem("Student");
		comboBox_1.addItem("Child");
		comboBox_1.addItem("Retired");
		comboBox_1.addItem("Normal");
		
		comboBox_2.setBounds(185, 195, 100, 25);
		this.getContentPane().add(comboBox_2);
		comboBox_2.addItem("Monday");
		comboBox_2.addItem("Tuesday");
		comboBox_2.addItem("Wednesday");
		comboBox_2.addItem("Thursday");
		comboBox_2.addItem("Friday");
		comboBox_2.addItem("Saturday");
		comboBox_2.addItem("Sunday");
		
		comboBox_3.setBounds(185, 260, 100, 25);
		this.getContentPane().add(comboBox_3);
		comboBox_3.addItem("14.00");
		comboBox_3.addItem("18.00");
		comboBox_3.addItem("21.00");
		
	}
	
	public void addNew(ActionListener action) {
		btnBack.addActionListener(action);
	}
	
}
