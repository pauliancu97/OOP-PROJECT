import javax.swing.*;


public class CheckBoxAttributePanel extends AttributePanel{
	private JCheckBox checkBox;
	
	public CheckBoxAttributePanel(String name) {
		super(name);
		checkBox = new JCheckBox();
		this.add(checkBox);
	}
	
	public void clear() {
		checkBox.setSelected(false);
	}
	
	public boolean isSelected() {
		return checkBox.isSelected();
	}
}
