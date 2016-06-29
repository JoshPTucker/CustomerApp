package CustomerApp;
import java.util.Scanner;
public class RunCustomerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		

		while(true){
			System.out.println("Enter (1) to search customers by last name, (2) update customer information"
					+ "(3) add new customer, (4) to quit");
			int a=in.nextInt();
		
		if(a==1){
		System.out.println("Enter customers last name");
		String lastname=in.next();
		Customer.searchByLastName(lastname);
		}else if(a==2){
			System.out.println("Enter customers first name");
			String firstname=in.next();
			System.out.println("Enter customers last name");
			String lastname=in.next();
			System.out.println("Enter customers email adress");
			String emailadress=in.next();
			
		}else if(a==3){
			
		}else if(a==4){
			break;
		}else{
			System.err.println("An error has occured."
					+ "You were not supposed to reach this point");
		}
	}
}
}