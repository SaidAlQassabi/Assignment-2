package entities;
public class Sale extends Product {
	private String code;
	private String proType;
	private String dateTime;
	private Address address;
	private String totalCost;
	private String downPayment;
	private String monthlyPayment;
	private String payableMonths;
	private String interestRate;
	
	public Sale(String code, String proType, String dateTime, Address address, String totalCost, String downPayment,
			String monthlyPayment, String payableMonths, String interestRate) {
		super();
		this.code = code;
		this.proType = proType;
		this.dateTime = dateTime;
		this.address = address;
		this.totalCost = totalCost;
		this.downPayment = downPayment;
		this.monthlyPayment = monthlyPayment;
		this.payableMonths = payableMonths;
		this.interestRate = interestRate;
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
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(String totalCost) {
		this.totalCost = totalCost;
	}
	public String getDownPayment() {
		return downPayment;
	}
	public void setDownPayment(String downPayment) {
		this.downPayment = downPayment;
	}
	public String getMonthlyPayment() {
		return monthlyPayment;
	}
	public void setMonthlyPayment(String monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}
	public String getPayableMonths() {
		return payableMonths;
	}
	public void setPayableMonths(String payableMonths) {
		this.payableMonths = payableMonths;
	}
	public String getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(String interestRate) {
		this.interestRate = interestRate;
	}
	
}