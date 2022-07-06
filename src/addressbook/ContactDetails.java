package addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactDetails {
	ArrayList<PersonInformation> persons;
	Scanner scanner = new Scanner(System.in);

	public ContactDetails() {
		persons = new ArrayList<PersonInformation>();
	}

	public void addPerson() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter the First Name");
		String name = scanner.nextLine();
		System.out.println("Please Enter the Last Name");
		String lName = scanner.nextLine();
		System.out.println("Please Enter Address ");
		String address = scanner.nextLine();
		System.out.println("Please Enter City name ");
		String city = scanner.nextLine();
		System.out.println("Please Enter State name");
		String state = scanner.nextLine();
		System.out.println("Please Enetr Zip Code");
		int zip = scanner.nextInt();
		System.out.println("Please Enter contact");
		long number = scanner.nextLong();
		System.out.println("Please Enter Email address ");
		String email = scanner.nextLine();
		PersonInformation p = new PersonInformation(name, lName, address, city, state, zip, number, email);
		persons.add(p);
		System.out.println("Input 1 for storing multiple address");
		int n = scanner.nextInt();
		if (n == 1) {
			addPerson();
		} else
			System.out.println("");
	}

	public void show() {
		System.out.println(persons.size());
		if (persons.size() == 0) {
			System.out.println("No Record Found !!!!!!");
		} else {
			for (int i = 0; i < persons.size(); i++) {
				PersonInformation p = (PersonInformation) persons.get(i);
				System.out.println(persons.get(i));
				System.out.println("");
			}
		}
	}

	public void delete() {
		if (persons.size() == 0) {
			System.out.println("No Record Found !!!!!!");
		} else {
			System.out.println("Enter First Name for delete the contact details");
			String name = scanner.nextLine();
			for (int i = 0; i < persons.size(); i++) {
				PersonInformation p = persons.get(i);
				if (name.equals(p.first_name)) {
					persons.remove(i);
					System.out.println("Deleted Successfully !!!");
				}
			}
		}
	}

	public void update() {
		System.out.println("Enter First name and last name to update the details");
		String name1 = scanner.nextLine();
		String name2 = scanner.nextLine();
		for (int i = 0; i < persons.size(); i++) {
			PersonInformation p = persons.get(i);
			if (name1.equals(p.first_name) && name2.equals(p.last_name)) {
				p.print();
				System.out.println("Enter what you want to Update \n 1 for Address\n 2 for Contact \n 3 for Email");
				int choice = scanner.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Enter Address: ");
					String address = scanner.nextLine();
					System.out.println("Enter City Name: ");
					String city = scanner.nextLine();
					System.out.println("Enter State: ");
					String state = scanner.nextLine();
					System.out.println("Enetr Zip Code:");
					int zip = scanner.nextInt();
					break;
				case 2:
					System.out.println("Enter contact Number:");
					long number = scanner.nextLong();
					break;
				case 3:
					System.out.println("Enter Email: ");
					String email = scanner.nextLine();
					break;
				}
			} else
				System.out.println("No record found");
		}
	}
}