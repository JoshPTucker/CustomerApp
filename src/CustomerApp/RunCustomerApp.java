package CustomerApp;
import java.util.Scanner;
public class RunCustomerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		
System.out.println("Enter (1) to search customers by last name, (2) update customer information"
					+ "(3) add new customer, (4) to quit");
		while(true){
			
			int a=in.nextInt();
		if(a==1){
		System.out.println("Enter customers last name");
		String lastname=in.nextLine();
		Customer.searchByLastName(lastname);
		}else if(a==2){
			System.out.println("Enter customers first name");
			String firstname=in.nextLine();
			System.out.println("Enter customers last name");
			String lastname=in.nextLine();
			System.out.println("Enter customers email address");
			String emailaddress=in.nextLine();
			System.out.println("Enter customers new street address");
			String newaddress=in.nextLine();
			Customer.updateCustomerData(firstname, lastname, emailaddress, newaddress);
		}else if(a==3){
			System.out.println("Enter customers first name");
			String firstname=in.nextLine();
			System.out.println("Enter customers last name");
			String lastname=in.nextLine();
			System.out.println("Enter customers email address");
			String emailaddress=in.nextLine();
			System.out.println("Enter customers street address");
			String streetaddress=in.nextLine();
			Customer.addNewCustomer(firstname, lastname, emailaddress, streetaddress);
		}else if(a==4){
			break;
		}else{
			System.err.println("An error has occured."
					+ "You entered an invalid number");
			break;
		}
		System.out.println();
	}
}
}