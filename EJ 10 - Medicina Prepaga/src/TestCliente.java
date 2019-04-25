import junit.framework.TestCase;

public class TestCliente extends TestCase{
	
	private Cliente fulano = new Cliente();
	
	private Full planFull = new Full();
	private Basico planBasico = new Basico();
	private Estandar planEstandar = new Estandar();
	
	public void setUp() {
		fulano.setCantCirugias(3);
	}
	
	public void testSetCantCirugias() {
		fulano.aumentarCantCirugias(2);
		assertTrue(fulano.getCantCirugias()==5);
	}

}
