package ISOTesting.Ejercicio3;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class Ejercicio3Test {
	Ejercicio3 prueba = new Ejercicio3();

	@Test
	public void testCalcular1() {
		int calidad1 = prueba.calcular(1, 3);
		assertEquals(1, calidad1);
	}

	@Test
	public void testCalcular2() {
		int calidad2 = prueba.calcular(0, 2);
		assertEquals(1, calidad2);
	}

	@Test
	public void testCalcular3() {
		int calidad3 = prueba.calcular(2, 3);
		assertEquals(2, calidad3);
	}

	@Test
	public void testCalcular4() {
		int calidad4 = prueba.calcular(2, 1);
		assertEquals(1, calidad4);
	}

	@Test
	public void testCalcular5() {
		int calidad5 = prueba.calcular(3, 3);
		assertEquals(3, calidad5);
	}

	@Test
	public void testCalcular6() {
		int calidad6 = prueba.calcular(3, 2);
		assertEquals(2, calidad6);
	}

	@Test
	public void testCalcular7() {
		int calidad7 = prueba.calcular(3, 1);
		assertEquals(2, calidad7);
	}

	@Test
	public void testCalcular8() {
		int calidad8 = prueba.calcular(4, 3);
		assertEquals(3, calidad8);
	}

	@Test
	public void testCalcular9() {
		int calidad9 = prueba.calcular(4, 5);
		assertEquals(4, calidad9);
	}

	@Test
	public void testCalcular10() {
		int calidad10 = prueba.calcular(5, 3);
		assertEquals(4, calidad10);
	}

	@Test
	public void testCalcular11() {
		int calidad11 = prueba.calcular(5, 2);
		assertEquals(3, calidad11);
	}

	@Test
	public void testCalcular12() {
		int calidad12 = prueba.calcular(5, 1);
		assertEquals(3, calidad12);
	}

	@Test
	public void testCalcular13() {
		int calidad13 = prueba.calcular(5, 5);
		assertEquals(5, calidad13);
	}

	@Test
	public void testAlgo1() {

		int completitud = prueba.algo(50, 0, 1, 2, 2, 3, 4);
		assertEquals(2, completitud);
	}

	@Test(expected = ValorNoValido.class)
	public void testAlgo2() {

		int correcion = prueba.algo(300, 0, 1, 1, 2, 4, 4);
		

	}

	@Test
	public void testAlgo3() {

		int pertinencia = prueba.algo(0, 0, 2, 2, 3, 4, 5);
		assertEquals(0, pertinencia);
	}

	@Test
	public void testAlgo4() {

		int modularidad = prueba.algo(30, 0, 1, 2, 2, 3, 4);
		assertEquals(1, modularidad);
	}

	@Test
	public void testAlgo5() {

		int reusabilidad = prueba.algo(40, 0, 1, 2, 2, 3, 5);
		assertEquals(2, reusabilidad);
	}

	@Test
	public void testAlgo6() {

		int analizabilidad = prueba.algo(80, 0, 0, 1, 2, 3, 5);
		assertEquals(3, analizabilidad);
	}

	@Test
	public void testAlgo7() {

		int modificado = prueba.algo(95, 0, 1, 2, 3, 4, 5);
		assertEquals(5, modificado);
	}

	@Test
	public void testAlgo8() {
		try {
			int probado = prueba.algo(-5, 0, 1, 1, 2, 4, 4);
		} catch (Exception e) {
			Assert.fail("Valor introducido erroneo");
		}

	}

}
class ValorNoValido extends Exception {
	private String S;

	ValorNoValido() {
		S = "Valor introducido erroneo";
	}

	public String toString() {
		return S;
	}
}
