
public enum Rating {
	AG("AG","Audienta generala"),AP_12("AP-12","Acord parental pentru varste sub 12 ani"),N_15("N-15","Interzis celor sub 15 ani"),IM_18("IM-18","Interzis minorilor");
	
	private String name;
	private String description;
	
	private Rating(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	@Override
	public String toString() {
		return name + "(" + description + ")";
	}
}
