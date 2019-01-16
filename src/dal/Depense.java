package dal;

public class Depense extends RessourceFinanciere {
	
	public Depense(String intitule, String type, double montant, int annee, int mois) {
		super(intitule, type, montant, annee, mois);
		// TODO Auto-generated constructor stub
	}

	public Depense(String intitule, String type, double montant, int annee, int mois,
			String description) {
		super(intitule, type, montant, annee, mois, description);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Affiche une depense
	 */
	@Override
	public String toString() {
		return "DEPENSE : ["+ annee + ", " + mois + ", " + intitule + ", " + type + ", " + montant
				+ ", " + description + "]";
	}
}
