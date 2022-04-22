package n1exercici1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MainClassTest {

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
	void testArrayNull() {

		ArrayList<String> mesosAny = new ArrayList<String>();

		mesosAny.add("Gener");
		mesosAny.add("Febrer");
		mesosAny.add("Març");
		mesosAny.add("Abril");
		mesosAny.add("Maig");
		mesosAny.add("Juny");
		mesosAny.add("Juliol");
		mesosAny.add("Agost");
		mesosAny.add("Setembre");
		mesosAny.add("Octubre");
		mesosAny.add("Novembre");
		mesosAny.add("Desembre");
		
		MainClass mainClass = new MainClass();
		
		assertThrows(Exception.class, () ->  mainClass.arrayNull(mesosAny));

		//assertTrue(mesosAny.size() != 0);

	}

	@Test
	public void testArraySize() throws Exception {

		ArrayList<String> mesosAny = new ArrayList<String>();

		mesosAny.add("Gener");
		mesosAny.add("Febrer");
		mesosAny.add("Març");
		mesosAny.add("Abril");
		mesosAny.add("Maig");
		mesosAny.add("Juny");
		mesosAny.add("Juliol");
		mesosAny.add("Agost");
		mesosAny.add("Setembre");
		mesosAny.add("Octubre");
		mesosAny.add("Novembre");
		mesosAny.add("Desembre");
		
		MainClass mainClass = new MainClass();
		
		assertThrows(Exception.class, () ->  mainClass.arraySize(mesosAny));

//		assertEquals(12, mesosAny.size());

	}

	@Test
	public void testPosicioArray() throws Exception {

		ArrayList<String> mesosAny = new ArrayList<String>();

		mesosAny.add("Gener");
		mesosAny.add("Febrer");
		mesosAny.add("Març");
		mesosAny.add("Abril");
		mesosAny.add("Maig");
		mesosAny.add("Juny");
		mesosAny.add("Juliol");
		mesosAny.add("Agost");
		mesosAny.add("Setembre");
		mesosAny.add("Octubre");
		mesosAny.add("Novembre");
		mesosAny.add("Desembre");
		
		
		MainClass mainClass = new MainClass();
		
		assertThrows(Exception.class, () ->  mainClass.posicioArray(8));
		
		//la posició 8 correspon a setembre

//		assertEquals("Agost", mesosAny.get(8));

	}

}
