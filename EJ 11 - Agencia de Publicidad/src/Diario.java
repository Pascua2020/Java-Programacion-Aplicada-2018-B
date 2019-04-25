
public class Diario implements Medio{
	
	private int cantCaracteres;

	public void setCantCaracteres(int cantCaracteres) {
		this.cantCaracteres = cantCaracteres;
	}

	public int calcularCosto() {
		return cantCaracteres;
	}

}
