package paqueteEjemploExamen;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class Prueba {
	
	//Apartado 2: Implementar testSetBit()

	private BinaryString bitset1, bitset2, bitset3;
	private String pruebaString2 = "1010101010", pruebaString3 = "100101";
	
	//Inicializamos las variables bitset1 con su String asociado
	@Before
	public void antesDelTest() {
		bitset1 = new BinaryString(10);
		bitset2 = new BinaryString(pruebaString2);
		bitset3 = new BinaryString(pruebaString3);
	}

	//Comprobamos si al cambiar una posición del bitset a un '1' el cambio se hace efectivo
	@Test
	public void testSetBit() {
		bitset3.set(1,'1');
		assertEquals('1', bitset3.get(1));
	}
}

