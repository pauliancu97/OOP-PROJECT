
public class Room {
	private boolean[][] seats;
	
	public Room() {
		seats = new boolean[Constants.Room.ROWS][Constants.Room.COLUMNS];
		for(int i = 0; i < Constants.Room.ROWS; i++)
			for(int j = 0; j < Constants.Room.COLUMNS; j++)
				seats[i][j] = true;
	}
	
	public boolean isSeatFree(int row, int column) {
		return seats[row][column];
	}
	
	public void reserveSeat(int row, int column) {
		seats[row][column] = false;
	}
}
