package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telephone.PhoneModel;

class PhoneModelTest {

	@Test
	void testCounterDigits() {
		PhoneModel phone = new PhoneModel();
		phone.addDigit(0);
		phone.addDigit(2);
		phone.addDigit(4);
		phone.addDigit(8);
		assertEquals(4, phone.getDigits().size());
	}

	@Test
	void testGetLastNumber() {
		PhoneModel phone = new PhoneModel();
		phone.addDigit(0);
		phone.addDigit(2);
		phone.addDigit(4);
		phone.addDigit(8);
		assertEquals(8, phone.getLastNumber());
	}
	
	@Test
	void testGetCompleteNumber() {
		String expectedOutput = "Agora discando 0248";
		
		PhoneModel phone = new PhoneModel();
		phone.addDigit(0);
		phone.addDigit(2);
		phone.addDigit(4);
		phone.addDigit(8);
		assertEquals(expectedOutput, phone.toString());
	}
}
