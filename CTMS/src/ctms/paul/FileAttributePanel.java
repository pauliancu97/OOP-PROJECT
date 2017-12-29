import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FileAttributePanel extends AttributePanel{
	private JTextField pathField;
	
	public FileAttributePanel(String name) {
		super(name);
		pathField = new JTextField();
		pathField.setPreferredSize(new Dimension(100,20));
		pathField.setEditable(false);
		this.add(pathField);
		JButton openBtn = new JButton("Open");
		//Add listener
		openBtn.addActionListener(new OpenButtonActionListener());
		this.add(openBtn);
	}
	
	public void clear() {
		pathField.setText("");
	}
	
	public String getPath() {
		return pathField.getText();
	}
	
	class OpenButtonActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			JFileChooser fileChooser = new JFileChooser();
			if(fileChooser.showOpenDialog(FileAttributePanel.this) == JFileChooser.APPROVE_OPTION) {
				File file = fileChooser.getSelectedFile();
				pathField.setText(file.getPath());
			}
		}
	}
}
