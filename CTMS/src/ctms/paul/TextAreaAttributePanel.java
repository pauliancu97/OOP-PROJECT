import java.awt.Dimension;

import javax.swing.*;

public class TextAreaAttributePanel extends AttributePanel{
	private JTextArea textArea;
	
	public TextAreaAttributePanel(String name, int width, int height) {
		super(name);
		textArea = new JTextArea();
		textArea.setPreferredSize(new Dimension(width,height));
		this.add(textArea);
	}
	
	public void clear() {
		textArea.setText("");
	}
	
	public String getText() {
		return textArea.getText();
	}
}
