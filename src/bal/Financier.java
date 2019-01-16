package bal;


import dal.BDD;
import dal.Depense;
import dal.Recette;

public class Financier {

	public static void addCotisation(double montant, int mois, int annee) {
		Recette recette = new Recette("Cotisation", "tier", montant, annee, mois, "Les cotisaions du mois");
		addRecette(recette);
	}
	
	public static void addInscription(double montant, int mois, int annee) {
		Recette recette = new Recette("Recette", "tier", montant, annee, mois, "Les inscriptions du mois");
		addRecette(recette);
	}
	
	private static boolean containRecette(Recette recette) {
		boolean res = false;
		for (Recette recetteFromList : BDD.listRecette) {
			if (recette.getIntitule().equals(recetteFromList.getIntitule()) && 
					recette.getMois() == recetteFromList.getMois() && recette.getAnnee() == recetteFromList.getAnnee() ) {
				res = true;
				break;
			}
		}
		return res;
	}
	
	private static boolean containDepense(Depense depense) {
		boolean res = false;
		for (Depense depenseFromList : BDD.listDepense) {
			if (depense.getIntitule().equals(depenseFromList.getIntitule()) && 
					depense.getMois() == depenseFromList.getMois() && depense.getAnnee() == depenseFromList.getAnnee() ) {
				res = true;
				break;
			}
		}
		return res;
	}
	
	private static void addDepense(Depense depense) {
		if (containDepense(depense)) {
			Depense depenseInitial = getDepenseFromDB(depense);
			Depense depenseModifier = new Depense(depense.getIntitule(), depense.getType(), depense.getMontant() + depenseInitial.getMontant(),
					depense.getAnnee(), depense.getMois());
			modifierDepense(depenseInitial, depenseModifier);
		} else {
			BDD.listDepense.add(depense);
		}
	}
	
	private static void modifierDepense(Depense depenseInitial, Depense depenseModifier) {
		
	}

	private static void addRecette(Recette recette) {
		if (containRecette(recette)) {
			Recette recetteInitial = getRecetteFromDB(recette);
			Recette recetteModifier = new Recette(recette.getIntitule(), recette.getType(), recette.getMontant() + recetteInitial.getMontant(),
					recette.getAnnee(), recette.getMois());
		}
	}
	
	private void deleteDepense(Depense depense) {
		
	}
	
	private static Depense getDepenseFromDB(Depense depense) {
		Depense res = null;
		for (Depense depenseFromList : BDD.listDepense) {
			if (depense.getIntitule().equals(depenseFromList.getIntitule()) && 
					depense.getMois() == depenseFromList.getMois() && depense.getAnnee() == depenseFromList.getAnnee() ) {
				res = depenseFromList;
				break;
			}
		}
		return res;
	}
	
	private static Recette getRecetteFromDB(Recette recette) {
		Recette res = null;
		for (Recette recetteFromList : BDD.listRecette) {
			if (recette.getIntitule().equals(recetteFromList.getIntitule()) && 
					recette.getMois() == recetteFromList.getMois() && recette.getAnnee() == recetteFromList.getAnnee() ) {
				res = recetteFromList;
				break;
			}
		}
		return res;
	}
}
