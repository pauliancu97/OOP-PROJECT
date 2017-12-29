import javax.swing.*;

public class ComboBoxAttributePanel<T> extends AttributePanel{
	private JComboBox<T> comboBox;
	
	public ComboBoxAttributePanel(String name,T[] values) {
		super(name);
		comboBox = new JComboBox<T>(values);
		this.add(comboBox);
	}
	
	public void clear() {
		comboBox.setSelectedIndex(0);
	}
	
	public T getSelectedItem() {
		return (T) comboBox.getSelectedItem();
	}
	
}
