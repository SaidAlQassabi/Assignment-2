package writer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import entities.Address;
import entities.Customer;
import entities.Person;
import entities.Product;

public class JSONWriter {
	
	public void JSONConverterPerson(ArrayList<Person> Person) {

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		File jsonOutput = new File("data/Persons.json");

		PrintWriter jsonPrintWriter = null;
		try {

			jsonPrintWriter = new PrintWriter(jsonOutput);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		for(Person person : Person) {
			// Use toXML method to convert Person object into a String
			String json = gson.toJson(person);
			jsonPrintWriter.write(json);
		}
		jsonPrintWriter.close();


	}
	public void JSONConverterCustomer(ArrayList<Customer> Customer) {

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		File jsonOutput = new File("data/Customers.json");

		PrintWriter jsonPrintWriter = null;
		try {

			jsonPrintWriter = new PrintWriter(jsonOutput);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		for(Customer customer : Customer) {
			// Use toXML method to convert Person object into a String
			String json = gson.toJson(customer);
			jsonPrintWriter.write(json);
		}
		jsonPrintWriter.close();


	}
	public void JSONConverterProduct(ArrayList<Product> Product) {

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		File jsonOutput = new File("data/Products.json");

		PrintWriter jsonPrintWriter = null;
		try {

			jsonPrintWriter = new PrintWriter(jsonOutput);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		for(Product product : Product) {
			// Use toXML method to convert Person object into a String
			String json = gson.toJson(product);
			jsonPrintWriter.write(json);
		}
		jsonPrintWriter.close();


	}

}
