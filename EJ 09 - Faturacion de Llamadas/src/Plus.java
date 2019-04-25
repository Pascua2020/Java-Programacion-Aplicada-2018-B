public class Plus implements Plan{
	private int cantidadNrosFree;
	
	public void incrementarNroFree(int cantidad) {
		cantidadNrosFree = cantidadNrosFree + cantidad;
	}
	
	public double montoAPagar() {
		return 150 + (cantidadNrosFree * 5);
	}
	
	public void setCantidadNrosFree(int cantidad) {
		cantidadNrosFree = cantidad;
	}

	public int getCantNroFree() {
		return cantidadNrosFree;
	}
}