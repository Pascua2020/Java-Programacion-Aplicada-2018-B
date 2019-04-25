import junit.framework.TestCase;

public class TestFiesta extends TestCase{
	
	private Invitado juana = new Invitado();
	private Careta elCareta = new Careta();
	private Personaje gatubela = new Personaje();
	
	public void setUp() {
		gatubela.setPuntos(2);
		elCareta.setPersonaje(gatubela);
		
		juana.setEdad(30);
		juana.setDisfraz(elCareta);
	}
	
	public void testPuntosInvitado() {
		assertTrue(juana.getPuntosI()==2);
	}

}
