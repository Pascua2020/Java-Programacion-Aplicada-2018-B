
public class Basico implements Plan{
	
	public int getMonto(int m) {
		if(m < 2) {
			return 1500;
		}
		else
			m = m -2;
			return 1500 + ( m * 50);
	}
	
	public int getTipo() {
		
		return 0;
	}

}
