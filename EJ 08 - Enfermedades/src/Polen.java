public class Polen implements Afeccion {
	
	private double gramos;
	
	public void setGramos(double cantidad) {
		gramos = cantidad;
	}
	
	public void afectarA(Persona unaPersona) {
		unaPersona.aumentarVitalidad(gramos*0.1);
	}
}