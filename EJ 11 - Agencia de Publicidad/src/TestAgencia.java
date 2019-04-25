import junit.framework.TestCase;

public class TestAgencia extends TestCase{
	
	private Agencia uno = new Agencia();
	private Agencia dos = new Agencia();
	private Agencia tres = new Agencia();
	
	private Diario elDiario = new Diario();
	private Folleto elFolleto = new Folleto();
	private Revista laRevista = new Revista();
	
	public void setUp() {
		laRevista.setCentimetros(2);
		elDiario.setCantCaracteres(3);
	}
	
	public void testConocerCostoRevista() {
		uno.setElMedio(laRevista);
		assertTrue(uno.costoPublicacion()==170);
	}
	
	public void testConocerCostoFolleto() {
		dos.setElMedio(elFolleto);
		assertTrue(dos.costoPublicacion()==570);
	}
	
	public void testConocerCostoDiario() {
		tres.setElMedio(elDiario);
		assertTrue(tres.costoPublicacion()==73);
	}

}
