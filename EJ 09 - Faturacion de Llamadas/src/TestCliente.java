import junit.framework.TestCase;

public class TestCliente extends TestCase {
	
	private Cliente alicia = new Cliente();
	private Plus unPlus = new Plus();

	public void setUp() {
		alicia.setIdCliente(3453);
		unPlus.setCantidadNrosFree(10);
		alicia.asignarPlan(unPlus);
	}
	
	public void testGetIdCliente() {
		assertTrue(alicia.getIdCliente() == 3453);
	}
	
	public void testIncrementarNroFree() {
		alicia.incrementarNroFree(5);
		assertTrue(alicia.getCantNroFree() == 15);
	}
	
	public void testAsignarPlanCliente() {
		Super planSuper = new Super();
		alicia.asignarPlan(planSuper);
		assertTrue(alicia.getPlan() == planSuper);
	}
	
	public void testMontoAFacturar() {
		assert(alicia.montoAFacturar() == 200);
	}
}