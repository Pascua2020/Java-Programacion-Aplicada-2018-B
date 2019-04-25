
public class Jarron implements Elemento{
	
	private int grietas;
	
	public void acondicionar() {
		grietas = (grietas*80)/100;
	}
	
	public int cuantoQueda() {
		return grietas;
	}
	
	public void setGrietas(int g) {
		grietas = g;
	}

}
