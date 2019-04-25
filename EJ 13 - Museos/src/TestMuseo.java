import junit.framework.TestCase;

public class TestMuseo extends TestCase{
	
	private Museo elMuseo = new Museo();
	
	private Jarron elJarron = new Jarron();
	private Resto elResto = new Resto();
	
	public void setUp() {
		elMuseo.addElemento(elJarron);
		elMuseo.addElemento(elResto);
		elJarron.setGrietas(100);
		elResto.setResto(100);
	}
	
	public void testElementosMuseo() {
		assertTrue(elMuseo.getCantElementos()==2);
	}
	
	public void testAcondicionarElemento() {
		assertTrue(elJarron.cuantoQueda()==100);
		elJarron.acondicionar();
	}

	public void testCuantoAcondicionar() {
		elJarron.acondicionar();
		assertTrue(elJarron.cuantoQueda()==80);
	}
}
