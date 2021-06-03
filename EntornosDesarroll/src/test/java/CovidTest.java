import static org.junit.Assert.*;

import org.junit.Test;

public class CovidTest {

	@Test
	public void testCalcularPrioridadVacunacion() {
		Covid cc = new Covid();
		int resultado = cc.calcularPrioridadVacunacion(63,1);
		int valor_esperado = 2;
				assertTrue(resultado==valor_esperado);
	}
	@Test
	public void testCalcularPrioridadVacunacion1() {
		Covid cc = new Covid();
		int resultado = cc.calcularPrioridadVacunacion(45,1);
		int valor_esperado = 3;
				assertTrue(resultado==valor_esperado);
	}
	@Test
	public void testCalcularPrioridadVacunacion2() {
		Covid cc = new Covid();
		int resultado = cc.calcularPrioridadVacunacion(20,1);
		int valor_esperado = 1;
				assertTrue(resultado==valor_esperado);
	}

}
