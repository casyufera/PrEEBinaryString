package paqueteEjemploExamen;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class PruebaEE7 {
	
	//Apartado 7: Implementar testToString()

	private BinaryString bitset1, bitset2, bitset3, bitset4, bitset5;
	private String pruebaString2 = "1010101010", pruebaString3 = "100101", pruebaString4 = "0110101", pruebaString5 = "1111000";
	
	//Inicializamos las variables bitset1 con su String asociado
	@Before
	public void antesDelTest() {
		bitset1 = new BinaryString(10);
		bitset2 = new BinaryString(pruebaString2);
		bitset3 = new BinaryString(pruebaString3);
		bitset4 = new BinaryString(pruebaString4);
		bitset5 = new BinaryString(pruebaString5);
	}

	//Comprobamos que al intentar toString el resultado es el esperado   
	@Test
	public void testToString() {
			assertEquals("1111000", bitset5.toString());
	}
}

