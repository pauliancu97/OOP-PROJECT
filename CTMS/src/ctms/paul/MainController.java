import java.util.ArrayList;

import javax.swing.*;

public class MainController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Room room = new Room();
		room.reserveSeat(0, 1);
		room.reserveSeat(4, 3);
		room.reserveSeat(10, 7);
		room.reserveSeat(11, 13);
		room.reserveSeat(9, 7);
		ArrayList<Seat> selectedSeat = new ArrayList<Seat>();
		new SeatSelectController(room, selectedSeat, 5);
	}

}
