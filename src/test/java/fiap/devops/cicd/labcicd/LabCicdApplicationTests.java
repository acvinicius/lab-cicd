package fiap.devops.cicd.labcicd;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LabCicdApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void devePassarNaEsteiraTeste1() {
		assertTrue(true);
	}

	@Test
	void devePassarNaEsteiraTeste2() {
		assertTrue(true);
	}

	@Test
	void devePassarNaEsteiraTeste3() {
		assertTrue(true);
	}

	@Test
	void devePassarNaEsteiraTeste4() {
		assertTrue(false);
	}
}
