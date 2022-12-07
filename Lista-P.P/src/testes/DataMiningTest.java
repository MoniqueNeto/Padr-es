package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import data_mining.*;

class DataMiningTest {

	@Test
	void test() {
		PDF document = new PDF("./Test");
		assertEquals("./Test", document.getPath());
	}

}
