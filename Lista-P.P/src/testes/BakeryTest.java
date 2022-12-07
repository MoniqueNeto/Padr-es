package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import bakery.ChocolateCake;
import bakery.MultiLayeredCake;
import bakery.Order;
import bakery.SprinklesCake;
import bakery.StrawberryCake;
import bakery.VanillaCake;
import bakery.WithSayingCake;

class BakeryTest {

	@Test
	void testOrderValue() {
		// Create the order
        Order order = new Order();
        order.addCake(new ChocolateCake());
        order.addCake(
    		new WithSayingCake(
				new VanillaCake(),
				"PLAIN!"
			)
        );
        order.addCake(
			new WithSayingCake(
				new SprinklesCake(
					new VanillaCake()
				),
				"FANCY"
				)
			);
        order.addCake(
    		new WithSayingCake(
				new WithSayingCake(
					new SprinklesCake(
						new SprinklesCake(
							new StrawberryCake(
									new MultiLayeredCake()
								)
							)
						), 
					"One of"), 
				"EVERYTHING")
		);
        
        assertEquals(61, order.getTotal());
	}

}
