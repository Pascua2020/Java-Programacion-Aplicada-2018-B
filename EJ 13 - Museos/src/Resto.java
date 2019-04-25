
public class Resto implements Elemento{
	
	public int polvo;
	
	public void acondicionar() {
		polvo =  (polvo*10)%100;
	}
	
	public int cuantoQueda() {
		return polvo;
	}
	
	public void setResto(int r) {
		polvo = r;
	}

}
