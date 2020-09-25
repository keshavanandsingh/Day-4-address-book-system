package day4Assingnment;

public class AddressBookMainUC1
{
	private String firstName, lastName;
	private String address, city, state, zip;
	private String phoneNumber, email;
	
	public AddressBookMainUC1() {
	}

	public AddressBookMainUC1(String firstName, String lastName, String address, String city, String state, String zip,
			String phoneNumber, String email) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program!");

		AddressBookMainUC1 adbk = new AddressBookMainUC1();
	}
}
