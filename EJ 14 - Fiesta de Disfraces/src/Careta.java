
public class Careta implements Disfraz{
	
	private Personaje personaje;
	
	public int getPuntos(int e) {
		return personaje.getPuntosP();
	}
	
	public void setPersonaje(Personaje p) {
		personaje = p;
	}
	
}
