package reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import entities.Address;
import entities.Customer;
import entities.Email;
import entities.Invoice;
import entities.Person;
import entities.Product;
import entities.Name;

public class FlatFileReader {

	public ArrayList<Person> readPersons() {
		Scanner sc = null;

		try {
			sc = new Scanner(new File("data/Persons.dat"));
			sc.nextLine(); // reads the number of records from the first line

			// This Person ArrayList stores the Person objects
			ArrayList<Person> personList = new ArrayList<Person>();

			while (sc.hasNext()) {
				String line = sc.nextLine(); // reads each line starting from 2nd line
				String data[] = line.split(";"); // tokenizes the line and stores in a tring array

				// Stores the 4 array elements of each line into strings
				String perCode = data[0];
				String name = data[1];
				String nameA[] = name.split(",");
				String lastName = nameA[0];
				String firstName = nameA[1];
				String addressA = data[2];
				String addressAA[] = addressA.split(",");
				String street = addressAA[0];
				String city = addressAA[1];
				String state = addressAA[2];
				String zip = addressAA[3];
				String country = addressAA[4];
				String email = " ";
				if (data.length == 3) {
					email = " ";
				} else {
					email = data[3];

				}
				String emailA[] = email.split(",");
				Name nameobj = new Name(lastName, firstName);
				Email e = null;
				if (emailA.length == 0) {
					e = new Email();
				}
				if (emailA.length == 1) {
					e = new Email(emailA[0]);
				}
				if (emailA.length == 2) {
					e = new Email(emailA[0], emailA[1]);

				}
				if (emailA.length == 3) {
					e = new Email(emailA[0], emailA[1], emailA[2]);

				}
				if (emailA.length == 4) {
					e = new Email(emailA[0], emailA[1], emailA[2], emailA[3]);

				}

				// Creates an Address object
				Address address = new Address(street, city, state, zip, country);

				// Creates a Person object
				Person person = new Person(perCode, nameobj, address, e);

				// Adds the Person object into Person ArrayList
				personList.add(person);
			}
			sc.close();
			return personList;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}

	public ArrayList<Customer> readCustomer() {
		Scanner sc = null;

		try {
			sc = new Scanner(new File("data/Customers.dat"));
			sc.nextLine(); // reads the number of records from the first line

			// This Person ArrayList stores the Person objects
			ArrayList<Customer> customerList = new ArrayList<Customer>();

			while (sc.hasNext()) {
				String line = sc.nextLine(); // reads each line starting from 2nd line
				String data[] = line.split(";"); // tokenizes the line and stores in a tring array

				// Stores the 4 array elements of each line into strings
				String cusCode = data[0];
				String type = data[1];
				String primaryContact = data[2];
				String name = data[3];
				String address = data[4];
				String addressA[] = address.split(",");
				String street = addressA[0];
				String city = addressA[1];
				String state = addressA[2];
				String zip = addressA[3];
				String country = addressA[4];

				// Creates an Address object
				Address addressobj = new Address(street, city, state, zip, country);

				// Creates a Person object
				Customer customer = new Customer(cusCode, type, primaryContact, name, addressobj);

				// Adds the Person object into Person ArrayList
				customerList.add(customer);
			}
			sc.close();
			return customerList;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}

	public ArrayList<Product> readProduct() {
		Scanner sc = null;

		try {
			sc = new Scanner(new File("data/Products.dat"));
			sc.nextLine(); // reads the number of records from the first line

			// This Person ArrayList stores the Person objects
			ArrayList<Product> productList = new ArrayList<Product>();

			while (sc.hasNext()) {
				String line = sc.nextLine(); // reads each line starting from 2nd line
				String data[] = line.split(";"); // tokenizes the line and stores in a tring array

				// Stores the 4 array elements of each line into strings
				String code = data[0];
				String proType = data[1];
				if (proType.charAt(0) == 'L') {
					String startDate = data[2];
					String endDate = data[3];
					String address = data[4];
					String addressA[] = address.split(",");
					String street = addressA[0];
					String city = addressA[1];
					String state = addressA[2];
					String zip = addressA[3];
					String country = addressA[4];
					String customerName = data[5];
					String deposit = data[6];
					String monthlycost = data[7];
					Address addressobj = new Address(street, city, state, zip, country);
					entities.Product.Agreements.Lease product = new Product.Agreements.Lease(code, proType, startDate, endDate, addressobj,
							customerName, deposit, monthlycost);
					productList.add(product);
				} else if (proType.charAt(0) == 'S') {
					String dateTime = data[2];
					String address = data[3];
					String addressA[] = address.split(",");
					String street = addressA[0];
					String city = addressA[1];
					String state = addressA[2];
					String zip = addressA[3];
					String country = addressA[4];

					String totalCost = data[4];
					String downPayment = data[5];
					String monthlyPayment = data[6];
					String payableMonths = data[7];
					String interestRate = data[8];

					Address addressobj = new Address(street, city, state, zip, country);
					entities.Product.Agreements.Sale product = new Product.Agreements.Sale(code, proType, dateTime, addressobj, totalCost,
							downPayment, monthlyPayment, payableMonths, interestRate);
					productList.add(product);
				} else if (proType.charAt(0) == 'P') {
					String cost = data[2];

					entities.Product.Service.Parking product = new Product.Service.Parking(code, proType, cost);
					productList.add(product);
				} else if (proType.charAt(0) == 'A') {
					String parkingfee = data[2];
					entities.Product.Service.Amenity product = new Product.Service.Amenity(code, proType, parkingfee);
					productList.add(product);
				}

			}
			sc.close();
			return productList;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public ArrayList<Invoice> readInvoice() {
		Scanner sc = null;

		try {
			sc = new Scanner(new File("data/Invoice.dat"));
			sc.nextLine(); // reads the number of records from the first line

			// This Person ArrayList stores the Person objects
			ArrayList<Invoice> invoiceList = new ArrayList<Invoice>();

			while (sc.hasNext()) {
				String line = sc.nextLine(); // reads each line starting from 2nd line
				String data[] = line.split(";"); // tokenizes the line and stores in a tring array

				// Stores the 4 array elements of each line into strings
				String invCode = data[0];
				String cusCode = data[1];
				String perCode = data[2];
				String date = data[3];
				String product = data[4];
				String productList[] = product.split(",");
				String product1 = productList[1];
				

				// Creates a Person object
				Invoice invoice = new Invoice(invCode, cusCode, perCode, date, productList);

				// Adds the Person object into Person ArrayList
				invoiceList.add(invoice);
			}
			sc.close();
			return invoiceList;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}

}