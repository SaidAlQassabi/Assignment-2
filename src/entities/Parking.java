package entities;

public class Parking {
	private String code;
	private String proType;
	private String parkingfee;

	public Parking(String code, String proType, String parkingfee) {
		super();
		this.code = code;
		this.proType = proType;
		this.parkingfee = parkingfee;
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
	public String getParkingfee() {
		return parkingfee;
	}
	public void setParkingfee(String parkingfee) {
		this.parkingfee = parkingfee;
	}

}
