package view;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InputTest {

	@Test
	void inputNum() {
	}

	@Test
	void checkLen() {
		assertTrue(Input.checkLen("5443"));
	}

	@Test
	void isNumber() {
		assertFalse(Input.isNumber("abc"));
	}
}
