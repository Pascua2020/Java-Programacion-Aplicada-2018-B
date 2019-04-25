
public class Agencia {
	
	private Medio elMedio;
	
	public Medio getElMedio() {
		return elMedio;
	}

	public void setElMedio(Medio elMedio) {
		this.elMedio = elMedio;
	}

	public int costoPublicacion() {
		return 70 + elMedio.calcularCosto();
	}
	
}
