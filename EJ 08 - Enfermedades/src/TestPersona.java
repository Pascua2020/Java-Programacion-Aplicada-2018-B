import junit.framework.TestCase;

public class TestPersona extends TestCase {
	
	private Persona sara = new Persona();
	private Afeccion malaria = new Malaria();
	private Afeccion varicela = new Varicela();
	private Afeccion paracetamol  = new Paracetamol();
	private Polen polen = new Polen();
	private Afeccion estres = new Estres();
	private Afeccion nuez = new Nuez();
	private CentroDeSalud centro = new CentroDeSalud();
	private Persona julio = new Persona();
	
	public void setUp() {
		sara.setTemperatura(37);
		sara.setVitalidad(100);
		sara.setPeso(60);
		polen.setGramos(10);
		centro.agregarA(sara);
		centro.agregarA(julio);
	}
	
	public void testAfectadoPorMalaria() {
		sara.esAfectadoPor(malaria);
		assertTrue(sara.getTemperatura() == 40.0);
	}	
	
	public void testAfectadoPorVaricela() {
		sara.esAfectadoPor(varicela);
		assertTrue(sara.getVitalidad() == 95.0);
		assertTrue(sara.getPeso() == 54.0);
	}	
	
	public void testAfectadoPorParacetamol() {
		sara.setTemperatura(40.0);
		sara.esAfectadoPor(paracetamol);
		assertTrue(sara.getTemperatura() == 37.0);
	}
	
	public void testAfectadoPorPolen() {
		sara.esAfectadoPor(polen);
		assertTrue(sara.getVitalidad() == 101.0);
	}	
	
	public void testAfectadoPorEstres() {
		sara.esAfectadoPor(estres);
		assertTrue(sara.getVitalidad() == 80.0);
	}
	
	public void testAfectadPorNuez() {
		sara.esAfectadoPor(nuez);
		assertTrue(sara.getVitalidad() == 130.0);
	}
	
	public void testCantidadDePacientes() {
		assertTrue(centro.cantidadDePacientes() == 2);
	}
}