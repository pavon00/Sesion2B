package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cmepps.Empleado;
import cmepps.Empleado.TipoEmpleado;

class EmpleadoTest {
	private TipoEmpleado tipo;
	private float ventasMes;
	private float horasExtra;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before All");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After All");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before each");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After each");
	}

	@Test
	void testCalculoNominaBrutaVendedor() {
		tipo = Empleado.TipoEmpleado.Vendedor;
		ventasMes = 0;
		horasExtra = 0;
		float expected = 2000;
		float actual = Empleado.calculoNominaBruta(tipo, ventasMes, horasExtra);
		assertEquals(expected, actual);
	}

	@Test
	void testCalculoNominaBrutaEncargado() {
		tipo = Empleado.TipoEmpleado.Encargado;
		ventasMes = 0;
		horasExtra = 0;
		float expected = 2500;
		float actual = Empleado.calculoNominaBruta(tipo, ventasMes, horasExtra);
		assertEquals(expected, actual);
	}

	@Test
	void testCalculoNominaBrutaNegativas() {
		tipo = Empleado.TipoEmpleado.Encargado;
		ventasMes = -1000;
		horasExtra = 0;
		float expected = 2500;
		float actual = Empleado.calculoNominaBruta(tipo, ventasMes, horasExtra);
		assertEquals(expected, actual);
	}

	@Test
	void testCalculoNominaBrutaEntre0y1000() {
		tipo = Empleado.TipoEmpleado.Encargado;
		ventasMes = 999;
		horasExtra = 0;
		float expected = 2600;
		float actual = Empleado.calculoNominaBruta(tipo, ventasMes, horasExtra);
		assertEquals(expected, actual);
	}

	@Test
	void testCalculoNominaBrutaEntre1000y1500() {
		tipo = Empleado.TipoEmpleado.Encargado;
		ventasMes = 1100;
		horasExtra = 0;
		float expected = 2700;
		float actual = Empleado.calculoNominaBruta(tipo, ventasMes, horasExtra);
		assertEquals(expected, actual);
	}

	@Test
	void testCalculoNominaBrutaHorasExtrasNegativas() {
		tipo = Empleado.TipoEmpleado.Encargado;
		ventasMes = 999;
		horasExtra = -1;
		float expected = 2600;
		float actual = Empleado.calculoNominaBruta(tipo, ventasMes, horasExtra);
		assertEquals(expected, actual);
	}

	@Test
	void testCalculoNominaBrutaHorasExtrasPositivas() {
		tipo = Empleado.TipoEmpleado.Encargado;
		ventasMes = 999;
		horasExtra = 1;
		float expected = 2630;
		float actual = Empleado.calculoNominaBruta(tipo, ventasMes, horasExtra);
		assertEquals(expected, actual);
	}

}
