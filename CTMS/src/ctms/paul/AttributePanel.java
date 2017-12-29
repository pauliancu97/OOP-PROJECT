package ctms.paul;

import java.awt.*;
import javax.swing.*;

public abstract class AttributePanel extends JPanel{
	
	protected String name; 
	
	public AttributePanel(String name) {
		this.name = name;
		this.setLayout(new FlowLayout());
		JLabel nameLabel = new JLabel(name + ":");
		this.add(nameLabel);
	}
	
	public abstract void clear();
}
