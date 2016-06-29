package CustomerApp;

import java.util.Scanner;

public class RunCustomerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.println("Type (search) to search customers by last name, (update) to update customer information"
				+ "\n(add) to add new customer, (q) to quit");
		while (true) {

			String a = in.nextLine();
			if (a.equals("search")) {
				System.out.println("Enter customers last name");
				String lastname = in.nextLine();
				Customer.searchByLastName(lastname);
				System.out.println("Your results have been printed." + "\n Enter Your next command");
			} else if (a.equals("update")) {
				System.out.println("Enter customers first name");
				String firstname = in.nextLine();
				System.out.println("Enter customers last name");
				String lastname = in.nextLine();
				System.out.println("Enter customers email address");
				String emailaddress = in.nextLine();
				System.out.println("Enter customers new city");
				String newcity = in.nextLine();
				System.out.println("Enter customers new state");
				String newstate = in.nextLine();
				System.out.println("Enter customers new zipcode");
				String newzip = in.nextLine();
				System.out.println("Enter customers new street address");
				String newaddress = in.nextLine();
				Customer.updateCustomerData(firstname, lastname, emailaddress, newaddress, newcity, newzip, newstate);
				System.out.println("Your updates have been made." + "\n Enter Your next command");
			} else if (a.equals("add")) {
				System.out.println("Enter customers first name");
				String firstname = in.nextLine();
				System.out.println("Enter customers last name");
				String lastname = in.nextLine();
				System.out.println("Enter customers email address");
				String emailaddress = in.nextLine();
				System.out.println("Enter customers street address");
				String streetaddress = in.nextLine();
				Customer.addNewCustomer(firstname, lastname, emailaddress, streetaddress);
				System.out.println("Your results have been added." + "\n Enter Your next command");
			} else if (a.equals("q")) {
				break;
			} else {
				System.err.println("An error has occured." + "You entered an invalid statement");
				break;
			}
			System.out.println();
		}
	}
}