package entities;

public abstract class Customer {
	protected String name;
	protected Address address;
	protected String cusCode;
	protected static String type;
	protected String primaryContact;
	
	public abstract void GetTax();
	public abstract void GetDiscount();
	public abstract void GetAdditionalFees();

	
}