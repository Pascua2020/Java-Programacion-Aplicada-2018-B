public class Paracetamol implements Afeccion {

	public void afectarA(Persona unaPersona) {		
		if (unaPersona.getTemperatura() > 37) {
			unaPersona.setTemperatura(37);
		}
	}
}