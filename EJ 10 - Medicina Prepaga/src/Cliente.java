
public class Cliente {
	
	private String nombre;
	
	private int id;
	
	private int cantCirugias;
	
	private int cantEstudios;
	
	private Plan elPlan;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCantCirugias() {
		return cantCirugias;
	}
	
	public void setCantCirugias(int c) {
		cantCirugias = c;
	}

	public void aumentarCantCirugias(int c) {
		cantCirugias += c;
	}

	public int getCantEstudios() {
		return cantEstudios;
	}

	public void setCantEstudios(int cantEstudios) {
		this.cantEstudios = cantEstudios;
	}

	public Plan getElPlan() {
		return elPlan;
	}

	public void setElPlan(Plan elPlan) {
		this.elPlan = elPlan;
	}
	
	public int getMonto(Plan elPlan) {
		if(elPlan.getTipo()==0) 
		{
			return elPlan.getMonto(cantEstudios);
		}
		else if(elPlan.getTipo()==1) 
		{
			return elPlan.getMonto(cantCirugias);
		}
		else 
		{
			return elPlan.getMonto(0);     
		}

	}
}
