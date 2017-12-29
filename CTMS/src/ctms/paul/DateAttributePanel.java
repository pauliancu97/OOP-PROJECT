import javax.swing.*;
import java.awt.event.*;

public class DateAttributePanel extends AttributePanel{
	private JComboBox<String> dayComboBox;
	private JComboBox<String> monthComboBox;
	private JComboBox<String> yearComboBox;
	
	public DateAttributePanel() {
		super("Day");
		dayComboBox = new JComboBox<String>();
		for(int i = 1; i <= 31; i++)
			dayComboBox.addItem(String.valueOf(i));
		this.add(dayComboBox);
		JLabel monthLabel = new JLabel("Month:");
		this.add(monthLabel);
		monthComboBox = new JComboBox<String>();
		for(int i = 1; i <= 12; i++)
			monthComboBox.addItem(String.valueOf(i));
		this.add(monthComboBox);
		JLabel yearLabel = new JLabel("Year:");
		this.add(yearLabel);
		yearComboBox = new JComboBox<String>();
		for(int i = 2018; i >= 1905; i--)
			yearComboBox.addItem(String.valueOf(i));
		this.add(yearComboBox);
		//Listener for year and month 
		monthComboBox.addActionListener(new ComboBoxActionListener());
		yearComboBox.addActionListener(new ComboBoxActionListener());
	}
	
	
	public String getDate() {
		return (String) dayComboBox.getSelectedItem() + "/" + (String) monthComboBox.getSelectedItem() + "/" + (String) yearComboBox.getSelectedItem();
	}
	
	private void setDaysValues() {
		dayComboBox.removeAllItems();
		boolean isLeapYear = false;
		int year = Integer.parseInt((String)yearComboBox.getSelectedItem());
		if(year % 4 != 0)
			isLeapYear = false;
		else if(year % 100 != 0)
			isLeapYear = true;
		else if(year % 400 != 0)
			isLeapYear = false;
		else
			isLeapYear = true;
		int[] monthNrDays = {31,28,31,30,31,30,31,31,30,31,30,31};
		if(isLeapYear)
			monthNrDays[1]++;
		for(int i = 1; i <= monthNrDays[monthComboBox.getSelectedIndex()]; i++)
			dayComboBox.addItem(String.valueOf(i));
	}
	
	public void clear() {
		yearComboBox.setSelectedIndex(0);
		monthComboBox.setSelectedIndex(0);
		setDaysValues();
	}
	
	class ComboBoxActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			int day = dayComboBox.getSelectedIndex();
			setDaysValues();
			if(day < dayComboBox.getItemCount())
				dayComboBox.setSelectedIndex(day);
			else
				dayComboBox.setSelectedIndex(dayComboBox.getItemCount() - 1);
		}
	}
} 
