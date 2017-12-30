import javax.swing.*;

public class SeatButton extends JButton{
	private int row;
	private int column;
	
	public SeatButton(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	public int getRow() {
		return row;
	}
	
	public int getColumn() {
		return column;
	}
}
