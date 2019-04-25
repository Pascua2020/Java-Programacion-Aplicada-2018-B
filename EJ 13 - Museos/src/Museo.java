import java.util.ArrayList;

public class Museo {
	
	private ArrayList<Elemento> elElemento = new ArrayList<Elemento>();
	
	public int getCantElementos() {
		return elElemento.size();
	}
	
	public void acondEl(int a) {
		Elemento el = elElemento.get(a);
		el.acondicionar();
		}
	
	public int cuantoQuedaAcondicionar(Elemento el) {
		return el.cuantoQueda();
	}
	
	public void addElemento(Elemento el) {
		elElemento.add(el);
	}
	
	
}
