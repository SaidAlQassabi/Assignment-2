package entities;

public class Invoice {
	private String invCode;
	private Customer cusCode;
	private Person perCode;
	private String date;
	private String[] product;

	public Invoice(String invCode, Customer cusCode, Person perCode, String date, String[] productList) {
		super();
		this.invCode = invCode;
		this.cusCode = cusCode;
		this.perCode = perCode;
		this.date = date;
		this.product = productList;
	}
	
	public String getinvCode() {
		return invCode;
	}
	
	public void setInvCode(String invCode) {
		this.invCode = invCode;
	}

	public Customer getCusCode() {
		return cusCode;
	}

	public void setCusCode(Customer cusCode) {
		this.cusCode = cusCode;
	}

	public Person getPerCode() {
		return perCode;
	}

	public void setRealCode(Person perCode) {
		this.perCode = perCode;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String[] getProduct() {
		return product;
	}

	public void setProduct(String[] product) {
		this.product = product;
	}

}
