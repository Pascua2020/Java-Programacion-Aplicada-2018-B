public class Varicela implements Afeccion{
	
	public void afectarA(Persona unaPersona) {
		unaPersona.disminuirVitalidad(5);
		unaPersona.disminuirPeso(unaPersona.getPeso() *0.1);
	}
}