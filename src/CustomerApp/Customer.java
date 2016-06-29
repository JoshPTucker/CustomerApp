package CustomerApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Customer {
	public Customer() {

	}

	public static void searchByLastName(String customerLastName) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String lastName = customerLastName;
		// String action=;
		String sql = "select * from customers where lastname=" + "\'" + lastName + "\'";
		// System.out.println("select * from customers where
		// lastname="+"\'"+lastName+"\'");
		String printStatement = "Still not working";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// con = DriverManager.getConnection("jdbc:oracle:thin:sys as
			// sysdba/oracle@localhost:1521:orcl");
			con = DriverManager.getConnection("jdbc:oracle:thin:ora1/ora1@localhost:1521:orcl");
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				// printStatement= rs.getString(1);
				System.out.println("\n" + "Customer: " + rs.getString("Customerid"));
				System.out.println(rs.getString("Title") + rs.getString("Firstname") + " " + rs.getString("lastname"));
				System.out.println(rs.getString("Streetaddress") + "\n" + rs.getString("zipcode")
				+ rs.getString("cityid") + " " + rs.getString("stateid"));
				System.out.println(rs.getString("emailaddress"));
				System.out.println(rs.getString("positionid") + " at " + rs.getString("companyid"));

			}
		} catch (SQLException e) {
			System.err.println("You have enetered an invalid sql statement");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.err.println("Data you are searching for is unavailable");
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public static void updateCustomerData(String FirstName, String LastName, String EmailAddress, String NewStreet,
			String NewCity, String NewZip, String NewState) {

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String lastName = LastName;
		String firstName = FirstName;
		String email = EmailAddress;
		String streetAddress = NewStreet;
		String city = NewCity;
		String zip = NewZip;
		String state = NewState;

		String sql = "update  customers set streetaddress=" + "\'" + streetAddress + "\'" + " where lastname=" + "\'"
				+ lastName + "\'" + " and firstname=" + "\'" + firstName + "\'" + " and emailaddress=" + "\'" + email
				+ "\'";

		String printStatement = "Still not working";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// con = DriverManager.getConnection("jdbc:oracle:thin:sys as
			// sysdba/oracle@localhost:1521:orcl");
			con = DriverManager.getConnection("jdbc:oracle:thin:ora1/ora1@localhost:1521:orcl");
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			// while (rs.next()) {
			// printStatement= rs.getString(1);
			// System.out.println("\n"+"Customer: " +
			// rs.getString("Customerid"));
			// System.out.println(rs.getString("Title") +
			// rs.getString("Firstname") + " " + rs.getString("lastname"));
			// System.out.println(rs.getString("Streetaddress") + "\n" +
			// rs.getString("zipcode")
			// + rs.getString("cityid") + " " + rs.getString("stateid"));
			// System.out.println(rs.getString("emailaddress"));
			// System.out.println(rs.getString("positionid")+" at
			// "+rs.getString("companyid"));

			// }
		} catch (SQLException e) {
			System.err.println("You have enetered an invalid sql statement");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.err.println("Data you are searching for is unavailable");
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public static void addNewCustomer(String FirstName, String LastName, String EmailAddress, String StreetAddress) {
		// String NewCity,String NewZip,String NewState
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String lastName = LastName;
		String firstName = FirstName;
		String email = EmailAddress;
		String streetAddress = StreetAddress;

		String sql = "insert into  customers(firstname,lastname,streetaddress," + "emailaddress) values(\'" + firstName
				+ "\'," + "\'" + lastName + "\'," + "\'" + streetAddress + "\'," + "\'" + email + "\')";

		String printStatement = "Still not working";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// con = DriverManager.getConnection("jdbc:oracle:thin:sys as
			// sysdba/oracle@localhost:1521:orcl");
			con = DriverManager.getConnection("jdbc:oracle:thin:ora1/ora1@localhost:1521:orcl");
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			// while (rs.next()) {
			// printStatement= rs.getString(1);
			// System.out.println("\n"+"Customer: " +
			// rs.getString("Customerid"));
			// System.out.println(rs.getString("Title") +
			// rs.getString("Firstname") + " " + rs.getString("lastname"));
			// System.out.println(rs.getString("Streetaddress") + "\n" +
			// rs.getString("zipcode")
			// + rs.getString("cityid") + " " + rs.getString("stateid"));
			// System.out.println(rs.getString("emailaddress"));
			// System.out.println(rs.getString("positionid")+" at
			// "+rs.getString("companyid"));

			// }
			
		} catch (SQLException e) {
			System.err.println("You have enetered an invalid sql statement");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.err.println("Data you are searching for is unavailable");
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}
