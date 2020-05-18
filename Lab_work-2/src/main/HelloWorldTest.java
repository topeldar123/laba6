package main;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloWorldTest {

	@Test
	void test() {
		assertEquals("Проверка номера зачетки",18130453, 18130453);
		assertEquals("Проверка номера зачетки",18130364, 18130364);
		assertEquals("Проверка номера зачетки",18130466, 18130466);
		assertEquals("Проверка номера зачетки",18130006, 18130006);
	}

}
