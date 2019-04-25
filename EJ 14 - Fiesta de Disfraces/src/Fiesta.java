import java.util.ArrayList;

public class Fiesta {
	
	public ArrayList<Invitado> invitados = new ArrayList<Invitado>();
	
	public int getInvitados() {
		int in=0;
		for(Invitado i: invitados){
			in++;
			}	
		return in;
	}

}
