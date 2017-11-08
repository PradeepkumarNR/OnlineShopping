package simpleShopping;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class simple_shopping_tests {

	SimpleShopping sc;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/*@Test
	public void should_calculate_price_when_items_are_same() {
		sc = new SimpleShopping();
		sc.item = 12;
		sc.price = 2;
		int actual = sc.calculateTotalPrice();
		assertEquals(24, actual);

	}

	@Test
	public void should_calculate_price_when_one_itemEach_ofDifferent_price_isPurchased() {
		sc = new SimpleShopping();
		sc.item = 1;
		sc.price1 = 5;
		sc.price2 = 6;

		assertEquals(11, sc.calculateTotalPrice(true), 2);

	}*/
/*	
	@Test
	public void should_calculate_price_when_one_itemEach_ofDifferent_price_isPurchasedIndefinateNumber() {
		sc = new SimpleShopping();
		sc.item = 1;
		int userItemprice1 = 5;
		int userItemprice2 = 6;
		
		sc.cumulativeprice[0]= userItemprice1;
		sc.cumulativeprice[1]= userItemprice2;

		assertEquals(11, sc.calculateTotalPrice(), 2);

	}*/
	
	@Test
	public void should_calculate_price_when_2_itemEach_ofDifferent_price_isPurchasedIndefinateNumber() {
		sc = new SimpleShopping();
		//sc.item = 1;
		int useritem1=2;
		int useritem2=3;
		int userItemprice1 = 5;
		int userItemprice2 = 6;
		
		sc.cumulativeItemlist[0]=useritem2;
		sc.cumulativeItemlist[1]=useritem1;
		sc.cumulativeprice[0]= userItemprice2;
		sc.cumulativeprice[1]=userItemprice1;

		assertEquals(28, sc.calculatecumulativepricewithItems(), 2);

	}
	
	
	
	

}
