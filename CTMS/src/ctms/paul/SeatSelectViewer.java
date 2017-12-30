import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SeatSelectViewer extends JFrame{
	private SeatButton[][] seatBtns;
	private JLabel seatsLeftLabel;
	private JButton nextBtn;
	
	public SeatSelectViewer(Room room, int nrTickets, int width, int height) {
		super("Seat Select");
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		this.setSize(width, height);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel seatsLeftNameLabel = new JLabel("Seats left to select:");
		seatsLeftLabel = new JLabel(String.valueOf(nrTickets));
		JPanel seatsNumberPanel = new JPanel(new FlowLayout());
		seatsNumberPanel.add(seatsLeftNameLabel);
		seatsNumberPanel.add(seatsLeftLabel);
		mainPanel.add(seatsNumberPanel);
		JButton mapFreeButton = new JButton();
		mapFreeButton.setSize(Constants.GUI.Seat.WIDTH, Constants.GUI.Seat.HEIGHT);
		mapFreeButton.setBackground(Constants.GUI.Seat.FREE_COLOR);
		JLabel freeLabel = new JLabel("Free");
		JButton mapReservedButton = new JButton();
		mapReservedButton.setSize(Constants.GUI.Seat.WIDTH, Constants.GUI.Seat.HEIGHT);
		mapReservedButton.setBackground(Constants.GUI.Seat.RESERVED_COLOR);
		JLabel reservedLabel = new JLabel("Reserved");
		JButton mapChoiceButton = new JButton();
		mapChoiceButton.setSize(Constants.GUI.Seat.WIDTH, Constants.GUI.Seat.HEIGHT);
		mapChoiceButton.setBackground(Constants.GUI.Seat.YOUR_CHOICE_COLOR);
		JLabel choiceLabel = new JLabel("Your Choice");
		JPanel mapLegendPanel = new JPanel(new FlowLayout());
		mapLegendPanel.add(mapFreeButton);
		mapLegendPanel.add(freeLabel);
		mapLegendPanel.add(mapReservedButton);
		mapLegendPanel.add(reservedLabel);
		mapLegendPanel.add(mapChoiceButton);
		mapLegendPanel.add(choiceLabel);
		mainPanel.add(mapLegendPanel);
		seatBtns = new SeatButton[Constants.Room.ROWS][Constants.Room.COLUMNS];
		JPanel mapPanel = new JPanel(null);
		for(int i = 0; i < Constants.Room.ROWS; i++)
			for(int j = 0; j < Constants.Room.COLUMNS; j++) {
				SeatButton seatButton = new SeatButton(i, j);
				seatButton.setSize(Constants.GUI.Seat.WIDTH, Constants.GUI.Seat.HEIGHT);
				seatButton.setLocation(j * Constants.GUI.Seat.WIDTH, i * Constants.GUI.Seat.HEIGHT);
				if(room.isSeatFree(i, j))
					seatButton.setBackground(Constants.GUI.Seat.FREE_COLOR);
				else
					seatButton.setBackground(Constants.GUI.Seat.RESERVED_COLOR);
				mapPanel.add(seatButton);
				seatBtns[i][j] = seatButton;
			}
		mainPanel.add(mapPanel);
		nextBtn = new JButton("Next");
		mainPanel.add(nextBtn);
		this.getContentPane().add(mainPanel);
		this.setVisible(true);
	}
	
	public void setSeatButtonsActionListener(ActionListener a) {
		for(int i = 0; i < Constants.Room.ROWS; i++) {
			for(int j = 0; j < Constants.Room.COLUMNS; j++)
				seatBtns[i][j].addActionListener(a);
		}
	}
	
	public void setNextButtonActionListener(ActionListener a) {
		nextBtn.addActionListener(a);
	}
	
	public void setSeatsLeft(int left) {
		if(left == 0)
			seatsLeftLabel.setText("None");
		else
			seatsLeftLabel.setText(String.valueOf(left));
	}
	
	public void setSeatButtonColor(int row, int column, Color color) {
		seatBtns[row][column].setBackground(color);
	}
}
