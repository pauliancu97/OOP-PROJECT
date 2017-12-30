import java.util.*;

import javax.swing.JOptionPane;

import java.awt.event.*;

public class SeatSelectController {
	private Room room;
	private ArrayList<Seat> selectedSeats;
	private ArrayList<Seat> currentSeats;
	private int nrTickets;
	private int nrSeatsLeft;
	private SeatSelectViewer view;
	
	public SeatSelectController(Room room, ArrayList<Seat> selectedSeats, int nrTickets) {
		this.room = room;
		this.selectedSeats = selectedSeats;
		this.nrTickets = nrTickets;
		this.nrSeatsLeft = nrTickets;
		currentSeats = new ArrayList<Seat>();
		view = new SeatSelectViewer(room, nrTickets,900,500);
		view.setSeatButtonsActionListener(new SeatButtonActionListener());
		view.setNextButtonActionListener(new NextButtonActionListener());
	}
	
	class SeatButtonActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			SeatButton seatBtn = (SeatButton) e.getSource();
			if(room.isSeatFree(seatBtn.getRow(), seatBtn.getColumn())) {
				Seat selectedSeat = new Seat(seatBtn.getRow(), seatBtn.getColumn());
				if(!currentSeats.contains(selectedSeat)) {
					if(nrSeatsLeft > 0) {
						currentSeats.add(selectedSeat);
						nrSeatsLeft--;
						seatBtn.setBackground(Constants.GUI.Seat.YOUR_CHOICE_COLOR);
					}
					else if(nrSeatsLeft == 0) {
						for(Seat seat : currentSeats)
							view.setSeatButtonColor(seat.getRow(), seat.getColumn(), Constants.GUI.Seat.FREE_COLOR);
						while(currentSeats.size() != 0)
							currentSeats.remove(0);
						currentSeats.add(selectedSeat);
						seatBtn.setBackground(Constants.GUI.Seat.YOUR_CHOICE_COLOR);
						nrSeatsLeft = nrTickets - 1;
					}
				}
				else {
					currentSeats.remove(selectedSeat);
					nrSeatsLeft++;
					seatBtn.setBackground(Constants.GUI.Seat.FREE_COLOR);
				}
				view.setSeatsLeft(nrSeatsLeft);
			}
		}
	}
	
	class NextButtonActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(nrSeatsLeft != 0) {
				JOptionPane.showMessageDialog(view, "Insufficient number of seats selected", "Error", JOptionPane.ERROR_MESSAGE);
			}
			else {
				while(selectedSeats.size()!= 0)
					selectedSeats.remove(0);
				selectedSeats.addAll(currentSeats);
			}
		}
	}
	
}
