package day4Assingnment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class addressBookMain 

{
	private List<List<Contact>> addressBooks;


	public addressBookMain(List<List<Contact>> addressBooks2) {
		super();
		this.addressBooks = addressBooks2;
	}


	public void addAddressBook(List<Contact> addressBook) {
		addressBooks.add((List<Contact>) addressBook);
	}

	
	public static void main(String[] args) {
		
		List<List<Contact>> addressBooks = new ArrayList<List<Contact>>();

		System.out.println("Enter the number of address book you want in the system: ");
		
		Scanner sc = new Scanner(System.in);
		int noOfAddressBooks = sc.nextInt();
		
		HashMap<String, List<Contact>> addressBookManagement = new  HashMap<String, List<Contact>>();
		
		for (int i = 0; i < noOfAddressBooks; i++) {
			List<Contact> addressBook = new ArrayList<Contact>();
			System.out.println("Number of contacts to add in this addressbook : ");
			int noOfContacts = sc.nextInt();
			for(int j = 0; j < noOfContacts; j++) {
				System.out.println("Enter the details again to update the contact \nfirst name:");
				String firstName = sc.next();
				System.out.println("last name:");
				String lastName = sc.next();
				System.out.println("Address: ");
				sc.nextLine();
				String address = sc.nextLine();
				System.out.println("City: ");
				String city = sc.nextLine();
				System.out.println("State: ");
				String state = sc.nextLine();
				System.out.println("Zip: ");
				long zip = sc.nextLong();
				System.out.println("Phone Number: ");
				long phoneNumber = sc.nextLong();
				System.out.println("Email Address: ");
				String email = sc.next();
				
				addressBook.add(new Contact(firstName, lastName, address, city, state, email, zip, phoneNumber));
			}
			String addressBookName = sc.next();
			addressBookManagement.put(addressBookName, addressBook);
			addressBooks.add(addressBook);
		}
		
		addressBookMain addressBookObject = new addressBookMain(addressBooks);
		
	}

}
