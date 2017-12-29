import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class MovieViewer extends JFrame{
	private TextAttributePanel titleField;
	private ListAttributePanel genresField;
	private TextAttributePanel lengthField;
	private DateAttributePanel premiereField;
	private ComboBoxAttributePanel<Rating> ratingField;
	private TextAttributePanel directorField;
	private ListAttributePanel actorsField;
	private TextAreaAttributePanel descriptionField;
	private FileAttributePanel posterPathField;
	private CheckBoxAttributePanel is3dField;
	private CheckBoxAttributePanel is4dField;
	private CheckBoxAttributePanel isIMAXField;
	private CheckBoxAttributePanel withSubtitlesField;
	private CheckBoxAttributePanel isDubbedField;
	private JButton insertBtn;
	private JButton printBtn;
	private JPanel mainPanel;
	
	public MovieViewer(int width, int height) {
		this.setSize(width, height);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		titleField = new TextAttributePanel("Title");
		mainPanel.add(titleField);
		genresField = new ListAttributePanel("Genres");
		mainPanel.add(genresField);
		lengthField = new TextAttributePanel("Length");
		mainPanel.add(lengthField);
		JLabel premiereLabel = new JLabel("Premiere:");
		mainPanel.add(premiereLabel);
		premiereField = new DateAttributePanel();
		mainPanel.add(premiereField);
		ratingField = new ComboBoxAttributePanel<Rating>("Rating", new Rating[] {Rating.AG, Rating.AP_12, Rating.N_15, Rating.IM_18});
		mainPanel.add(ratingField);
		directorField = new TextAttributePanel("Director");
		mainPanel.add(directorField);
		JLabel actorsLabel = new JLabel("Actors:");
		mainPanel.add(actorsLabel);
		actorsField = new ListAttributePanel("Actors");
		mainPanel.add(actorsField);
		descriptionField = new TextAreaAttributePanel("Description",200,50);
		mainPanel.add(descriptionField);
		posterPathField = new FileAttributePanel("Poster");
		mainPanel.add(posterPathField);
		is3dField = new CheckBoxAttributePanel("3D");
		mainPanel.add(is3dField);
		is4dField = new CheckBoxAttributePanel("4D");
		mainPanel.add(is4dField);
		isIMAXField = new CheckBoxAttributePanel("IMAX");
		mainPanel.add(isIMAXField);
		withSubtitlesField = new CheckBoxAttributePanel("Subtitles");
		mainPanel.add(withSubtitlesField);
		isDubbedField = new CheckBoxAttributePanel("Dubbed");
		mainPanel.add(isDubbedField);
		insertBtn = new JButton("Insert");
		mainPanel.add(insertBtn);
		printBtn = new JButton("Print");
		mainPanel.add(printBtn);
		this.getContentPane().add(mainPanel,BorderLayout.WEST);
		this.setVisible(true);
	}
	
	public void clear() {
		for(Component comp: mainPanel.getComponents()) {
			if(comp instanceof AttributePanel) {
				AttributePanel attributePanel = (AttributePanel) comp;
				attributePanel.clear();
			}
		}
	}
	
	public String getTitle() {
		return titleField.getText();
	}
	
	public ArrayList<String> getGenres(){
		return genresField.getList();
	}
	
	public int getLength() {
		return Integer.parseInt(lengthField.getText());
	}
	
	public String getPremiere() {
		return premiereField.getDate();
	}
	
	public Rating getRating() {
		return ratingField.getSelectedItem();
	}
	
	public String getDirector() {
		return directorField.getText();
	}
	
	public ArrayList<String> getActors(){
		return actorsField.getList();
	}
	
	public String getDescription() {
		return descriptionField.getText();
	}
	
	public String getPosterPath() {
		return posterPathField.getPath();
	}
	
	public boolean is3D() {
		return is3dField.isSelected();
	}
	
	public boolean is4D() {
		return is4dField.isSelected();
	}
	
	public boolean isIMAX() {
		return isIMAXField.isSelected();
	}
	
	public boolean withSubtitles() {
		return withSubtitlesField.isSelected();
	}
	
	public boolean isDubbed() {
		return isDubbedField.isSelected();
	}
	
	public void setInsertButtonActionListener(ActionListener  a) {
		insertBtn.addActionListener(a);
	}
	
	public void setPrintButtonActionListener(ActionListener  a) {
		printBtn.addActionListener(a);
	}
}
