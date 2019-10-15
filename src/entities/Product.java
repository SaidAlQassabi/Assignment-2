package entities;

public abstract class Product {

	public String code;
	public String proType;
	public String startDate;
	public String endDate;
	public Address address;
	public String customerName;
	public String deposit;
	public String monthlyCost;
	public String totalCost;
	public String downPayment;
	public String monthlyPayment;
	public String payableMonths;
	public String interestRate;
	public String dateTime;
	public String parkingfee;
	
	public abstract double getTax() {
		return 0;
	}
	
	public abstract double grandTotal() {
		return 0;
	}

	public static class Agreements extends Product {
	public static class Lease extends Agreements {

		public Lease(String code, String proType, String startDate, String endDate, Address address,
				String customerName, String deposit, String monthlyCost) {
			super();
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
		
		public double getTax() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		public double grandTotal() {
			// TODO Auto-generated method stub
			return 0;
		}

	}

	public static class Sale extends Agreements {

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
		
		public double getTax() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		public double grandTotal() {
			// TODO Auto-generated method stub
			return 0;
		}
	}

	public double getTax() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double grandTotal() {
		// TODO Auto-generated method stub
		return 0;
	}
	}

	public static class Service extends Product {
	public static class Parking extends Service {
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
		
		public double getTax() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		public double grandTotal() {
			// TODO Auto-generated method stub
			return 0;
		}
	}

	public static class Amenity extends Service {
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
		
		public double getTax() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		public double grandTotal() {
			// TODO Auto-generated method stub
			return 0;
		}
	}

	@Override
	public double getTax() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double grandTotal() {
		// TODO Auto-generated method stub
		return 0;
	}
	}
	
}
