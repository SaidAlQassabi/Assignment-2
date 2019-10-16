package entities;

public abstract class LowIncome extends Customer{

	public LowIncome(String cusCode, String type, String primaryContact, String name, Address address) {
		super();
		this.cusCode = cusCode;
		this.type = type;
		this.primaryContact = primaryContact;
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getCusCode() {
		return cusCode;
	}

	public void setCusCode(String cusCode) {
		this.cusCode = cusCode;
	}s

	public static String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPrimaryContact() {
		return primaryContact;
	}

	public void setPrimaryContact(String primaryContact) {
		this.primaryContact = primaryContact;
	}
	public double GetTax(int cost) {
		if(type == "L") {
			
		}
		return 0;
}
}
