import junit.framework.TestCase;

public class TestPokemon extends TestCase {
	
	private Entrenador ash = new Entrenador();
	
	private Electrico pikachu = new Electrico();	
	private Agua psyduck =  new Agua();	
	private Fuego charizard = new Fuego();
	
	private Ataque agilidad = new Ataque();
	private Ataque trueno = new Ataque();
	private Ataque lanzallamas = new Ataque();
	
	public void setUp() {
		agilidad.setPotencia(50);
		trueno.setPotencia(220);
		lanzallamas.setPotencia(120);
		pikachu.aprenderAtaque(agilidad);
		charizard.setAtaque(lanzallamas);
	}
	
	public void testAtraparAPokemon() {
		ash.atraparA(pikachu);
		assertTrue(ash.cantidadDePokemones() == 1);
	}
	
	public void testAprenderAtaqueElectrico() {
		assertTrue(pikachu.nivelAtaque() == 50);
	}
	
	public void testNivelAtaqueElectrico() {
		pikachu.aprenderAtaque(trueno);
		assertTrue(pikachu.nivelAtaque() == 270);
	}
	
	public void testAprenderAtaqueFuego() {
		charizard.aprenderAtaque(trueno);
		assertTrue(charizard.nivelAtaque()== 220);
	}
	
	public void testAprenderAtaqueAgua() {
		psyduck.aprenderAtaque(agilidad);
		assertTrue(psyduck.nivelAtaque() == 0);
	}
	
	public void testNivelTotal() {
		ash.atraparA(pikachu);
		ash.atraparA(charizard);
		ash.atraparA(psyduck);		
		assertTrue(ash.nivelAtaqueTotal()== 170);
	}
}