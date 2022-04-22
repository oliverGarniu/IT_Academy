package n1exercici3;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArrayIndexOutOfBoundsTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test

	public void arrayIndex() {

		ArrayList<Integer> num = new ArrayList<Integer>();

		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);

		try {
			num.get(7);

		} catch (Exception e) {
			System.out.println("Wrong");

		}
	}

}
