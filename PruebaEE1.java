package paqueteEjemploExamen;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class PruebaEE1 {
	
	//Apartado 1: Implementar testLength()

	private BinaryString bitset1, bitset2;
	private String pruebaString2 = "1010101010";
	
	//Inicializamos las variables bitset1 con su String asociado
	@Before
	public void antesDelTest() {
		bitset1 = new BinaryString(10);
		bitset2 = new BinaryString(pruebaString2);
	}

	//Comprobamos si al inicializar el bitset el tamaño es el esperado
	@Test
	public void testLength() {
		assertEquals (10, bitset1.length());
		assertEquals (10, bitset2.length());
	}
}
