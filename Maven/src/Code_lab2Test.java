import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Code_lab2Test {

	@Test
	void test() {
		Code_lab2 test = new Code_lab2();
		int output = test.square(5); 
		assertEquals(25, output);
	}

}
