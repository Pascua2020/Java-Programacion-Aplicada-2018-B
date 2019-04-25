public class Fuego implements TipoPokemon {
	
	private Ataque ataque;
	
	public void aprenderAtaque(Ataque unAtaque) {
		this.setAtaque(unAtaque);
	}
	
	public double nivelAtaque() {
		return ataque.getPotencia();
	}
	
	public void setAtaque(Ataque unAtaque) {
		ataque = unAtaque;
	}
	
	public Ataque getAtaque() {
		return ataque;
	}
}