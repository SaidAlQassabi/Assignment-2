package writer;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

//import com.datacontainers.Person;
import com.thoughtworks.xstream.XStream;

import entities.Address;
import entities.Customer;
import entities.Person;
import entities.Product;

public class XMLWriter {
	public void xmlConverterAddress(ArrayList<Address> Address) {
		XStream xstream = new XStream();
        File xmlOutput = new File("data/Address.xml");
		
		PrintWriter xmlPrintWriter = null;
		try {
			xmlPrintWriter = new PrintWriter(xmlOutput);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		xmlPrintWriter.write("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n");
		
		xstream.alias("Address", Address.class); 
		for(Address address : Address) {
			// Use toXML method to convert Person object into a String
			String personOutput = xstream.toXML(address);
			xmlPrintWriter.write(personOutput);
		}
		xmlPrintWriter.close();	
	}
	public void xmlConverterPerson(ArrayList<Person> Person) {
		XStream xstream = new XStream();
        File xmlOutput = new File("data/Persons.xml");
		
		PrintWriter xmlPrintWriter = null;
		try {
			xmlPrintWriter = new PrintWriter(xmlOutput);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		xmlPrintWriter.write("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n");
		
		xstream.alias("Person", Person.class); 
		for(Person person : Person) {
			// Use toXML method to convert Person object into a String
			String personOutput = xstream.toXML(person);
			xmlPrintWriter.write(personOutput);
		}
		xmlPrintWriter.close();	
	}
	public void xmlConverterCustomer(ArrayList<Customer> Customer) {
		XStream xstream = new XStream();
        File xmlOutput = new File("data/Customers.xml");
		
		PrintWriter xmlPrintWriter = null;
		try {
			xmlPrintWriter = new PrintWriter(xmlOutput);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		xmlPrintWriter.write("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n");
		
		xstream.alias("Customer", Customer.class); 
		for(Customer customer : Customer) {
			// Use toXML method to convert Person object into a String
			String personOutput = xstream.toXML(customer);
			xmlPrintWriter.write(personOutput);
		}
		xmlPrintWriter.close();	
	}
	public void xmlConverterProduct(ArrayList<Product> Product) {
		XStream xstream = new XStream();
        File xmlOutput = new File("data/Products.xml");
		
		PrintWriter xmlPrintWriter = null;
		try {
			xmlPrintWriter = new PrintWriter(xmlOutput);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		xmlPrintWriter.write("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n");
		
		xstream.alias("Product", Product.class); 
		for(Product product : Product) {
			// Use toXML method to convert Person object into a String
			String personOutput = xstream.toXML(product);
			xmlPrintWriter.write(personOutput);
		}
		xmlPrintWriter.close();	
	}
}