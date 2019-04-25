public class Estres implements Afeccion {

	public void afectarA(Persona unaPersona) {
		unaPersona.disminuirVitalidad(unaPersona.getVitalidad()*0.2);
	}
}