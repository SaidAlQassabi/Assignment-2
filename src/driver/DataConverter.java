package driver;

import java.util.ArrayList;
import java.util.List;
import entities.Address;
import entities.Customer;
import entities.Person;
import entities.Product;
import reader.FlatFileReader;
import writer.XMLWriter;
import writer.JSONWriter;

public class DataConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a FlatFileReader object
				FlatFileReader fr = new FlatFileReader();
				ArrayList<Customer> customerList = fr.readCustomer();
				ArrayList<Person> personList = fr.readPersons();
				ArrayList<Product> productList = fr.readProduct();
		
				
				XMLWriter xml = new XMLWriter();
				xml.xmlConverterCustomer(customerList);
				xml.xmlConverterPerson(personList);
				xml.xmlConverterProduct(productList);
				
				JSONWriter json = new JSONWriter();
				json.JSONConverterCustomer(customerList);
				json.JSONConverterPerson(personList);
				json.JSONConverterProduct(productList);

				
				
			
			}

	}