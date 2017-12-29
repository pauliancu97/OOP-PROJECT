import java.awt.Dimension;

import javax.swing.*;

public class TextAttributePanel extends AttributePanel{
	private JTextField textField;
	
	public TextAttributePanel(String name) {
		super(name);
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(100, 20));
		this.add(textField);
	}
	
	public void clear() {
		textField.setText("");
	}
	
	public String getText() {
		return textField.getText();
	}
}
