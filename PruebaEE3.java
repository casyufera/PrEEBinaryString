package paqueteEjemploExamen;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class PruebaEE3 {
	
	//Apartado 3: Implementar testGetOutOfLimitBit()

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
	@Test(expected = BinaryStringException.class)
	public void testGetOutOfLimitBit() {
		bitset4.get(56);
	}
}

