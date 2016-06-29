import static org.junit.Assert.*;

import org.junit.Test;

import CustomerApp.Customer;

public class CustomerAppTest1 {

	@Test
	public void testAdd() {
		assertTrue(Customer.addNewCustomer("JunitTest", "JunitTest", "JunitTest", "JunitTest"));
	}
	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}
	@Test
	public void testSearch() {
		fail("Not yet implemented");
	}

}
