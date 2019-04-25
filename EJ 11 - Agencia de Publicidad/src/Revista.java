
public class Revista implements Medio{
	
	private int centimetros;

	public void setCentimetros(int centimetros) {
		this.centimetros = centimetros;
	}

	public int calcularCosto() {
		return 50 * centimetros;
	}
	
}
