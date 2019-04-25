public class Persona {
	private double peso;
	private double vitalidad;
	private double temperatura;
	private String nombre;	
	
	public void esAfectadoPor(Afeccion unaAfeccion) {
		unaAfeccion.afectarA(this);
	}
	
	public void aumentarTemperatura(int cantidad) {
		temperatura = temperatura + cantidad;
	}	
	
	public void disminuirVitalidad(double cantidad) {
		vitalidad = vitalidad - cantidad;
	}
	
	public void aumentarVitalidad(double cantidad) {
		vitalidad = vitalidad + cantidad;
	}
	
	public void disminuirPeso(double cantidad) {
		peso = peso - cantidad;		
	}
	
	public void setTemperatura(double cantidad) {
		temperatura = cantidad;
	}
	
	public double getTemperatura() {
		return temperatura;
	}
	
	public void setVitalidad(double cantidad) {
		vitalidad = cantidad;
	}
	
	public double getVitalidad() {
		return vitalidad;
	}
	
	public void setPeso(double unPeso) {
		peso = unPeso;
	}
	
	public double getPeso() {
		return peso;
	}
}
