import java.util.ArrayList;

public class Electrico implements TipoPokemon{
	
	private ArrayList<Ataque> ataques = new ArrayList<Ataque>();
	
	public void aprenderAtaque(Ataque unAtaque) {
		ataques.add(unAtaque);
	}
	
	public double nivelAtaque() {
		double suma = 0;
		for (Ataque unAtaque : ataques) {
			suma = suma + unAtaque.getPotencia();
		}
		return suma;
	}
}