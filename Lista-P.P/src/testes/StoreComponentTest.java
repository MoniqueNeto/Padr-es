package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import orders.StoreComponent;
import orders.Box;
import orders.Product;

class StoreComponentTest {

	@Test
	void testUniqueValue() {
		StoreComponent box = new Box("Test", 2.0);
		assertEquals(2.0, box.getValue());
	}

	@Test
	void testOrderValue() {
		StoreComponent balls = new Product("Bolinha", 2.50);
		StoreComponent smartphone_case = new Product("Case", 15.50);
		
		StoreComponent fish = new Product("Peixe", 22.50);
		StoreComponent moto = new Product("Moto", 150.50);
		StoreComponent mini_box = new Box("Mini Box", 15.50);
		mini_box.addComponent(fish);
		mini_box.addComponent(moto);
		
		StoreComponent box = new Box("Encomenda completa", 0.25);
		box.addComponent(balls);
		box.addComponent(smartphone_case);
		box.addComponent(mini_box);
		
		assertEquals(206.75, box.getTotalValue());
	}
}
