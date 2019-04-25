import java.util.ArrayList;

public class Entrenador {

	private ArrayList<TipoPokemon> pokemones = new ArrayList<TipoPokemon>();
	
	public void atraparA(TipoPokemon unPokemon) {
		pokemones.add(unPokemon);
	}
	
	public int cantidadDePokemones() {
		return pokemones.size();
	}
	
	public double nivelAtaqueTotal() {
		double total = 0;
		for (TipoPokemon pokemon : pokemones) {
			total = total + pokemon.nivelAtaque();
		}
		return total;
	}
}