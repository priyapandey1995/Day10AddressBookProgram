package addressbook;

public class PersonInformation {

	String first_name;
	String last_name;
	String address;
	String city;
	String state;
	int zip;
	long number;
	String email;

	public PersonInformation(String firstname, String lastname, String add, String ct, String stet, int pinCode,
			long phn, String mail) {
		first_name = firstname;
		last_name = lastname;
		address = add;
		city = ct;
		state = stet;
		zip = pinCode;
		number = phn;
		email = mail;
	}

	@Override
	public String toString() {
		return "PersonsInfo:: " + " " + first_name + " " + last_name + " " + address + " " + city + " " + state + " "
				+ zip + " " + number + " " + email + "\n";
	}

	public void print() {
		System.out.println("First Name: " + first_name + "\nLast Name: " + last_name + "\nAddress: " + address
				+ "\nCity:" + city + "\nState: " + state + "\nZip: " + zip + "\nContact number:" + number
				+ "\nEmail ID:" + email + "\n");
	}
}