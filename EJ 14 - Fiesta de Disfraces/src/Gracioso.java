
public class Gracioso implements Disfraz{
	
	private int nivelDeGracia;
	
	public int getPuntos(int e) {
		nivelDeGracia = e;
		if(e > 50)
		{
			nivelDeGracia *= 3;
			return nivelDeGracia;
		}
		
		return nivelDeGracia;
	}

}
