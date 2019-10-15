package writer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import entities.Invoice;

public class InvoiceReport {
		//Create a FlatFileReader object
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
		
		//Create a ConsoleWriter object
	}

