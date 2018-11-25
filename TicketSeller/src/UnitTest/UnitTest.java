package UnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.TicketSeller;

class UnitTest {

	@Test
	void test() {
		
		assertEquals(TicketSeller.BuyTicket(10), 90);
		assertEquals(TicketSeller.BuyTicket(15), 75);
		assertEquals(TicketSeller.BuyTicket(25), 55);
		assertEquals(TicketSeller.BuyTicket(5), 50);
		assertEquals(TicketSeller.BuyTicket(20), 30);
		assertEquals(TicketSeller.BuyTicket(20), 10);	
		assertEquals(TicketSeller.BuyTicket(10), 0);	
	}
}