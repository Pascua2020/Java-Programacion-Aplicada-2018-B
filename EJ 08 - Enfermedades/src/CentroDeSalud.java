import java.util.ArrayList;

public class CentroDeSalud {
	
	private ArrayList pacientes = new ArrayList();
	
	public int cantidadDePacientes() {
		return pacientes.size();
	}
	
	public void agregarA(Persona unPaciente) {
		pacientes.add(unPaciente);
	}

}