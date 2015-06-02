package paqueteEjemploExamen;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class Prueba {
	
	//Apartado 5: Implementar testSetOutOfLimitBitV2()

	private BinaryString bitset1, bitset2, bitset3, bitset4;
	private String pruebaString2 = "1010101010", pruebaString3 = "100101", pruebaString4 = "0110101";
	
	//Inicializamos las variables bitset1 con su String asociado
	@Before
	public void antesDelTest() {
		bitset1 = new BinaryString(10);
		bitset2 = new BinaryString(pruebaString2);
		bitset3 = new BinaryString(pruebaString3);
		bitset4 = new BinaryString(pruebaString4);
	}

	//Comprobamos si al acceder fuera de los límites del array nos lanza una excepción tipo BinaryStringException
	//pero utilizando el método set() con un try-catch
	@Test(expected = BinaryStringException.class)
	public void testSetOutOfLimitBit() {
		try {
			bitset4.set(56, '0');
			fail("Se esperaba excepcion BinaryStringException");
			
		} catch (BinaryStringException e) {
			
		}
	}
}
