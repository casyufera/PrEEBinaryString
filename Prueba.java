package paqueteEjemploExamen;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class Prueba {
	
	//Apartado 6: Implementar testInvalidBitValue()

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

	//Comprobamos si al intentar meter un char que no sea '1' o '0' lanza una excepción BinaryStringException 
	@Test(expected = BinaryStringException.class)
	public void testInvalidBitValue() {
			bitset4.set(1, 'a');
	}
}

