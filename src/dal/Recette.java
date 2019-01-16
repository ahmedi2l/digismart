package dal;

public class Recette extends RessourceFinanciere {

	public Recette(String intitule, String type, double montant, int annee, int mois) {
		super(intitule, type, montant, annee, mois);
		// TODO Auto-generated constructor stub
	}
	
	public Recette(String intitule, String type, double montant, int annee, int mois, String description) {
		super(intitule, type, montant, annee, mois, description);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Affiche une recette
	 */
	@Override
	public String toString() {
		return "RECETTE : ["+ annee + ", " + mois + ", " + intitule + ", " + type + ", " + montant
				+ ", " + description + "]";
	}
}
