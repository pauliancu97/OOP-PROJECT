package ctms.ioana;


import java.awt.List;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class movieWindow extends JFrame{

	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private ArrayList<JTextField> textFieldsArray; 
	JLabel lblInfo = new JLabel("INFO");
	JButton btnBack = new JButton("BACK");
	JButton btnBook = new JButton("BOOK");

	
	public void setTextField(ArrayList<String> text) {  // "textTextBox1","textBox
		for(int i=0;i<text.size();i++)
			if(i < textFieldsArray.size())
				textFieldsArray.get(i).setText(text.get(i));
	}
	
	public movieWindow() {
	
		this.setVisible(true);
		this.setLayout(null);
		this.setBounds(100, 100, 507, 344);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		
		
		lblInfo.setBounds(192, 0, 33, 25);
		this.getContentPane().add(lblInfo);
		
		
		btnBack.setBounds(0, 0, 68, 25);
		this.getContentPane().add(btnBack);
		
	
		btnBook.setBounds(423, 280, 68, 25);
		this.getContentPane().add(btnBook);
		
		JLabel lblTitle = new JLabel("Title");
		lblTitle.setBounds(10, 40, 46, 14);
		this.getContentPane().add(lblTitle);
		
		JLabel lblGenre = new JLabel("Genre");
		lblGenre.setBounds(10, 65, 46, 14);
		this.getContentPane().add(lblGenre);
		
		JLabel lblLength = new JLabel("Length");
		lblLength.setBounds(10, 90, 46, 14);
		this.getContentPane().add(lblLength);
		
		JLabel lblNewLabel = new JLabel("Language");
		lblNewLabel.setBounds(10, 115, 60, 14);
		this.getContentPane().add(lblNewLabel);
		
		JLabel lblPremiere = new JLabel("Premiere");
		lblPremiere.setBounds(10, 140, 60, 14);
		this.getContentPane().add(lblPremiere);
		
		JLabel lblRating = new JLabel("Rating");
		lblRating.setBounds(10, 165, 46, 14);
		this.getContentPane().add(lblRating);
		
		JLabel lblDirector = new JLabel("Director");
		lblDirector.setBounds(10, 190, 46, 14);
		this.getContentPane().add(lblDirector);
		
		JLabel lblActors = new JLabel("Actors");
		lblActors.setBounds(10, 215, 46, 14);
		this.getContentPane().add(lblActors);
		
		textField = new JTextField();
		textField.setBounds(80, 37, 86, 20);
		textField.setEditable(false);
		textField.setText("lala");
		this.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(80, 62, 86, 20);
		this.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(80, 87, 86, 20);
		this.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(80, 112, 86, 20);
		this.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(80, 137, 86, 20);
		this.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(80, 162, 86, 20);
		this.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(80, 187, 86, 20);
		this.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(80, 212, 86, 20);
		this.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setBounds(10, 240, 46, 14);
		this.getContentPane().add(lblYear);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setBounds(250, 36, 68, 14);
		this.getContentPane().add(lblDescription);
		
		JLabel lblPoster = new JLabel("Poster");
		lblPoster.setBounds(250, 65, 46, 14);
		this.getContentPane().add(lblPoster);
		
		textField_8 = new JTextField();
		textField_8.setBounds(80, 237, 86, 20);
		this.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lbld = new JLabel("3D");
		lbld.setBounds(250, 90, 46, 14);
		this.getContentPane().add(lbld);
		
		JLabel lblImax = new JLabel("IMAX");
		lblImax.setBounds(250, 115, 46, 14);
		this.getContentPane().add(lblImax);
		
		JLabel lbld_1 = new JLabel("4D");
		lbld_1.setBounds(250, 140, 46, 14);
		this.getContentPane().add(lbld_1);
		
		JLabel lblSubtitles = new JLabel("Subtitles");
		lblSubtitles.setBounds(250, 165, 60, 14);
		this.getContentPane().add(lblSubtitles);
		
		JLabel lblDubbed = new JLabel("Dubbed");
		lblDubbed.setBounds(250, 190, 46, 14);
		this.getContentPane().add(lblDubbed);
		
		textField_9 = new JTextField();
		textField_9.setBounds(328, 37, 86, 20);
		this.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(328, 62, 86, 20);
		this.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(328, 87, 86, 20);
		this.getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(328, 112, 86, 20);
		this.getContentPane().add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(328, 137, 86, 20);
		this.getContentPane().add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(328, 162, 86, 20);
		this.getContentPane().add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setBounds(328, 187, 86, 20);
		this.getContentPane().add(textField_15);
		textField_15.setColumns(10);
		
		textFieldsArray = new ArrayList<JTextField>();
		textFieldsArray.add(textField);	
		textFieldsArray.add(textField_1);
		textFieldsArray.add(textField_2);
		textFieldsArray.add(textField_3);
		textFieldsArray.add(textField_4);
		textFieldsArray.add(textField_5);
		textFieldsArray.add(textField_6);
		textFieldsArray.add(textField_7);
		textFieldsArray.add(textField_8);
		textFieldsArray.add(textField_9);
		textFieldsArray.add(textField_10);
		textFieldsArray.add(textField_11);
		textFieldsArray.add(textField_12);
		textFieldsArray.add(textField_13);
		textFieldsArray.add(textField_14);
		textFieldsArray.add(textField_15);
	

		
	}
	
	public void addNew3(ActionListener action) {
		btnBook.addActionListener(action);
	}
	
}
