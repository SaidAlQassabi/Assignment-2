package entities;

import java.util.ArrayList;

public class Invoice {
	private String cusCode;
	private String realCode;
	private String date;
	private ArrayList<String> productList;

	public Invoice(String cusCode, String realCode, String date, ArrayList<String> productList2) {
		super();
		this.cusCode = cusCode;
		this.realCode = realCode;
		this.date = date;
		this.productList = productList2;
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

	public ArrayList<String> getProductList() {
		return productList;
	}

	

}
