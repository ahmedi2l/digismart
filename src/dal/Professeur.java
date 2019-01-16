package dal;

public class Professeur {

	private int id;
	private boolean isPaid;
	private String nom, prenom;
	
	public void setIsPaid(boolean status) {
		isPaid = status;
	}
	
	public boolean getIsPaid() {
		return isPaid;
	}
	
}
