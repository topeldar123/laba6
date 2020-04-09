import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testing_code_lab_2 {

	@Test
	void test() {
		Code_lab_2 test = new Code_lab_2();
		int output = test.square(5); 
		assertEquals(25, output);
	}

}
