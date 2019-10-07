package entities;

public class Invoice {
	private String cusCode;
	private String realCode;
	private String date;
	private String[] product;

	public Invoice(String cusCode, String realCode, String date, String[] productList) {
		super();
		this.cusCode = cusCode;
		this.realCode = realCode;
		this.date = date;
		this.product = productList;
	}

	public String getCusCode() {
		return cusCode;
	}

	public void setCusCode(String cusCode) {
		this.cusCode = cusCode;
	}

	public String getRealCode() {
		return realCode;
	}

	public void setRealCode(String realCode) {
		this.realCode = realCode;
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
