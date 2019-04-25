public class Nuez implements Afeccion{
	
	public void afectarA(Persona unaPersona) {
		unaPersona.aumentarVitalidad(unaPersona.getVitalidad()*0.3);
	}

}