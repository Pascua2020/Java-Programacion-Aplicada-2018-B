public class Basico implements Plan {
	
	private int cantMinConsumos;
	private double valorMinuto;
	public void incrementarNroFree(int cantidad) {
		
	}
	
	public double montoAPagar() {
		return 30 + (cantMinConsumos * valorMinuto);
	}
	
	public int getCantNroFree() {
		return 0;
	}
}
