
public class Invitado {
	
	private int edad;
	
	private Disfraz disfraz;
	
	public int getPuntosI() {
		
		return disfraz.getPuntos(edad);
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setDisfraz(Disfraz d) {
		disfraz = d;
	}
	
	public void setEdad(int e) {
		e = edad;
	}
	
	
}
