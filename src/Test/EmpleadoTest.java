package Test;


import Empleado.Empleado;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoTest {

	enum TipoEmpleado {
		vendedor, Encargado
	};
	
	private String tipo;
	private float ventames;
	private float horasextra;
	private float nominaBruta;
	
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
	void testCalculoNominaBrutaEncargado() {
		tipo="encargado";
		ventames=1100;
		horasextra=10;
		float expected=2900;
		float actual=Empleado.calculoNominaBruta(tipo, ventames, horasextra);
		assertEquals(expected,actual);
	}
	
	@Test
	void testCalculoNominaBrutaVendedor() {
		tipo="vendedor";
		ventames=1100;
		horasextra=10;
		float expected=2400;
		float actual=Empleado.calculoNominaBruta(tipo, ventames, horasextra);
		assertEquals(expected,actual);
	}
	
	@Test
	void testCalculoNominaBrutaPrima2() {
		tipo="encargado";
		ventames=1500;
		horasextra=10;
		float expected=3000;
		float actual=Empleado.calculoNominaBruta(tipo, ventames, horasextra);
		assertEquals(expected,actual);
	}
	
	@Test
	void testCalculoNominaBrutaPrima1() {
		tipo="encargado";
		ventames=1000;
		horasextra=10;
		float expected=2900;
		float actual=Empleado.calculoNominaBruta(tipo, ventames, horasextra);
		assertEquals(expected,actual);
	}
	
	@Test
	void testCalculoNominaBrutaSinPrima() {
		tipo="encargado";
		ventames=800;
		horasextra=10;
		float expected=2800;
		float actual=Empleado.calculoNominaBruta(tipo, ventames, horasextra);
		assertEquals(expected,actual);
	}
	
	@Test
	void testCalculoNominaBrutaConHorasExtra() {
		tipo="vendedor";
		ventames=1000;
		horasextra=10;
		float expected=2400;
		float actual=Empleado.calculoNominaBruta(tipo, ventames, horasextra);
		assertEquals(expected,actual);
	}
	
	@Test
	void testCalculoNominaBrutaSinHorasExtra() {
		tipo="vendedor";
		ventames=1000;
		horasextra=0;
		float expected=2100;
		float actual=Empleado.calculoNominaBruta(tipo, ventames, horasextra);
		assertEquals(expected,actual);
	}

	@Test
	void testCalculoNominaNeta0() {
		nominaBruta=2000;
		float expected=2000;
		float actual=Empleado.calculoNominaNeta(nominaBruta);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaNeta15() {
		nominaBruta=2200;
		float expected=1870;
		float actual=Empleado.calculoNominaNeta(nominaBruta);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaNeta18() {
		nominaBruta=2600;
		float expected=2132;
		float actual=Empleado.calculoNominaNeta(nominaBruta);
		assertEquals(expected, actual);
		
	}

}
