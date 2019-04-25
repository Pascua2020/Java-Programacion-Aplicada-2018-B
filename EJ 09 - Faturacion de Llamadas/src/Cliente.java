public class Cliente {

	private int idCliente;
	private String nombre;
	private Plan plan;
	
	public int getIdCliente() {
		return idCliente;
	}
	
	public void setIdCliente(int unIdCliente) {
		idCliente = unIdCliente;
	}
	
	public void asignarPlan(Plan unPlan) {
		plan = unPlan;
	}
	
	public void incrementarNroFree(int cantidad) {
		plan.incrementarNroFree(cantidad);
	}
	
	public int getCantNroFree() {
		return plan.getCantNroFree();
	}
	
	public Plan getPlan() {
		return plan;
	}
	
	public double montoAFacturar() {
		return plan.montoAPagar();
	}
}