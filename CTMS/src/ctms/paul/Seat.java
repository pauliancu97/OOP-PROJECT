
public class Seat {
	private int row, column;
	
	public Seat(int row, int column) {
		this.setRow(row);
		this.setColumn(column);
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(! (obj instanceof Seat))
			return false;
		if(obj == this)
			return true;
		Seat seat = (Seat) obj;
		if(seat.getRow() == row && seat.getColumn() == column)
			return true;
		return false;
	}
}
