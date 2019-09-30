package entities;

public class Amenity {

	private String code;
	private String proType;
	private String cost;
	
	public Amenity(String code, String proType, String cost) {
		super();
		this.code = code;
		this.proType = proType;
		this.cost = cost;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getProType() {
		return proType;
	}
	public void setProType(String proType) {
		this.proType = proType;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}

}
