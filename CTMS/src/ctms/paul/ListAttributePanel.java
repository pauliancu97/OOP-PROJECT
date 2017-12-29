import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ListAttributePanel extends AttributePanel{
	private JComboBox<String> comboBox;
	private JTextField inputField;
	private JButton addBtn;
	private ArrayList<String> list;
	
	public ListAttributePanel(String name) {
		super(name);
		comboBox = new JComboBox<String>();
		comboBox.setPreferredSize(new Dimension(100,20));
		this.add(comboBox);
		JLabel inputLabel = new JLabel(name + " Name:");
		this.add(inputLabel);
		inputField = new JTextField();
		inputField.setPreferredSize(new Dimension(100,20));
		this.add(inputField);
		addBtn = new JButton("Add");
		addBtn.addActionListener(new AddButtonActionListener());
		this.add(addBtn);
		list = new ArrayList<String>();
	}
	
	public ArrayList<String> getList(){
		return list;
	}
	
	public void clear() {
		comboBox.removeAllItems();
		while(list.size() != 0)
			list.remove(0);
		inputField.setText("");
	}
	
	class AddButtonActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			String element = inputField.getText();
			if(!list.contains(element) && !element.equals("")) {
				comboBox.addItem(element);
				comboBox.setSelectedIndex(comboBox.getItemCount() -1);
				list.add(element);
			}
			inputField.setText("");
		}
	}
}
