package bookQuote;

import static org.junit.Assert.*;

import org.junit.Test;

import nl.utwente.di.bookQuote.Quoter;

public class TestQuoter {

	@Test
	public void testGetBookPrice() {
		Quoter quoter = new Quoter();
		
		double price = quoter.getBookPrice("1");
		assertEquals("ISBN1 = ", 10.0, price, 0.0);
		
		price = quoter.getBookPrice("2");
		assertEquals("ISBN2 = ", 45.0, price, 0.0);
		
		price = quoter.getBookPrice("3");
		assertEquals("ISBN3 = ", 20.0, price, 0.0);

		price = quoter.getBookPrice("4");
		assertEquals("ISBN4 = ", 35.0, price, 0.0);
		
		price = quoter.getBookPrice("5");
		assertEquals("ISBN5 = ", 50.0, price, 0.0);
		
		price = quoter.getBookPrice(null);
		assertEquals("ISBN1 = ", 0.0, price, 0.0);
	}

}
