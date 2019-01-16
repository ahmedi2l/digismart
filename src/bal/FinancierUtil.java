package bal;

import java.util.ArrayList;
import dal.*;

public final class FinancierUtil {
	
	/**
	 * 
	 * @param annee
	 * @param mois
	 * @param listDepense
	 * @param listRecette
	 * @return Tableau de double [Total dépenses mensuelles, total recettes mensuelles, bénéfice ou déficit]
	 */
	public static double[] calculBilanMois(int annee, int mois, ArrayList<Depense> listDepense, ArrayList<Recette> listRecette) {
		double totalRecetteMois = 0;
		double totalDepenseMois = 0;
			
		for (Recette recette : listRecette) {
			if (mois == recette.getMois() && annee == recette.getAnnee()) {
				totalRecetteMois = totalRecetteMois + recette.getMontant();
			}			
		}
		
		for (Depense depense : listDepense) {
			if (mois == depense.getMois() && annee == depense.getAnnee()) {
				totalDepenseMois = totalDepenseMois + depense.getMontant();
			}			
		}
		
		double bilanMois = totalRecetteMois - totalDepenseMois;
		
		return new double[] { totalDepenseMois, totalRecetteMois, bilanMois };		
	}
	
	/**
	 * 
	 * @param listDepense
	 * @param listRecette
	 * @param annee
	 * @return Tableau de double [Total dépenses annuelles, total recettes annuelles, bénéfice ou déficit annuel]
	 */
	public static double[] calculBilanAnnee (ArrayList<Depense> listDepense, ArrayList<Recette> listRecette, int annee) {
		double totalRecetteAnnee = 0;
		double totalDepenseAnnee = 0;
		
		for (Recette recette : listRecette) {
			if (annee == recette.getAnnee()) {
				totalRecetteAnnee = totalRecetteAnnee + recette.getMontant();
			}			
		}
		
		for (Depense depense : listDepense) {
			if (annee == depense.getAnnee()) {
				totalDepenseAnnee = totalDepenseAnnee + depense.getMontant();
			}			
		}
		
		double bilanAnnee = totalRecetteAnnee - totalDepenseAnnee;
		
		return new double[] { totalDepenseAnnee, totalRecetteAnnee, bilanAnnee };
	}
	
	
	
	
	// Test en attendant Listes recettes
	public static double[] testMois(int annee, int mois, ArrayList<Depense> listDepense) {
	
		double totalDepenseMois = 0;
		
		for (Depense depense : listDepense) {
			if (mois == depense.getMois() && annee == depense.getAnnee()) {
				totalDepenseMois = totalDepenseMois + depense.getMontant();
			}
		}
		
		double bilanMois = totalDepenseMois - 5;
		
		return new double[] { totalDepenseMois, bilanMois };		
	}
	
}
