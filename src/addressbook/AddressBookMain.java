package addressbook;

import java.util.Scanner;

public class AddressBookMain {
		public static void main(String[] args) {
			System.out.println("<<<<<Welcome to Address Book>>>>>");
			ContactDetails contact = new ContactDetails();
			String name;
			int input;
			Scanner scanner = new Scanner(System.in);
			while (true) {
				System.out.println(" Enter 1 for add");
				System.out.println(" Enter 2 for update");
				System.out.println(" Enter 3 for delete");
				System.out.println(" Enter 4 for showing");
				input = scanner.nextInt();
				switch (input) {
				case 1:
					contact.addPerson();
					System.out.println("Contact Added Successfully");
					break;
				case 2:
					contact.update();
					break;
				case 3:
					contact.delete();
					break;
				case 4:
					System.out.println("");
					System.out.println("               " + "First Name " + " Last Name" + " Address" + " City" + " State"
							+ " Zip" + " Number" + " E-mail");
					contact.show();
					break;
				case 5:
					System.exit(0);
				}
			}
		}

	}
