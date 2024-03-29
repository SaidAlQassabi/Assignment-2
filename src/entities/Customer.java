package entities;

public abstract class Customer {
	protected String name;
	protected Address address;
	protected String cusCode;
	protected String type;
	protected String primaryContact;

	public double abstract getTax() {
		return 0;
	}
	
	public double abstract getDiscount() {
		return 0;
	}

	public double abstract addFee() {
		return 0;
	}
	
	public static class General extends Customer {

		public General(String cusCode, String type, String primaryContact, String name, Address address) {
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
		}

		public String getType() {
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
		
		public double getTax() {
			return 0;
		}
		
		public double getDiscount() {
			return 0;
		}

		public double addFee() {
			return 0;
		}
		
	}
	
	public static class LowIncome extends Customer {

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
		}

		public String getType() {
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
		
		public double getTax() {
			return 0;
		}
		
		public double getDiscount() {
			return 0;
		}

		public double addFee() {
			return 0;
		}
		
		
	}
}