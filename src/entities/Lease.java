package entities;

public class Lease {
	private String code;
	private String proType;
	private String startDate;
	private String endDate;
	private Address address;
	private String customerName;
	private String deposit;
	private String monthlyCost;
	
	public Lease(String code, String proType, String startDate, String endDate, Address address,
			String customerName, String deposit, String monthlyCost) {
		this.code = code;
		this.proType = proType;
		this.startDate = startDate;
		this.endDate = endDate;
		this.address = address;
		this.customerName = customerName;
		this.deposit = deposit;
		this.monthlyCost = monthlyCost;
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
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getDeposit() {
		return deposit;
	}
	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}
	public String getMonthlyCost() {
		return monthlyCost;
	}
	public void setMonthlyCost(String monthlyCost) {
		this.monthlyCost = monthlyCost;
	}

}
