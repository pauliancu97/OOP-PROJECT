package ctms.models.tickettype;

public class TicketType {

	private String ticketType;
	private float ticketTypePrice;

	public String getTicketType() {
		return ticketType;
	}

	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}

	public float getTicketTypePrice() {
		return ticketTypePrice;
	}

	public void setTicketTypePrice(float ticketTypePrice) {
		this.ticketTypePrice = ticketTypePrice;
	}

	public TicketType(String ticketType, float ticketTypePrice) {
		this.setTicketType(ticketType);
		this.setTicketTypePrice(ticketTypePrice);
	}
}