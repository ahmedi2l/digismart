package bal;

import java.util.ArrayList;
import dal.*;

public final class FinancierUtil {

	public static double[] calculBilanMois (int annee, String mois, ArrayList<Depense> listDepense, ArrayList<Recette> listRecette) {
		double totalRecetteMois = 0;
		double totalDepenseMois = 0;
		
		for (Recette recette : listRecette) {
			totalRecetteMois = totalRecetteMois + recette.getCount();
		}
		
		for (Depense depense : listDepense) {
			totalDepenseMois = totalDepenseMois + depense.getCount();
		}
		
		double bilanMois = totalRecetteMois - totalDepenseMois;
		
		return new double[] { totalDepenseMois, totalRecetteMois, bilanMois };		
	}
	
	public static double[] calculBilanAnnee (ArrayList<Depense> listDepense, ArrayList<Recette> listRecette, int annee) {
		double totalRecetteAnnee = 0;
		double totalDepenseAnnee = 0;
		
		for (Recette recette : listRecette) {
			totalRecetteAnnee = totalRecetteAnnee + recette.getCount();
		}
		
		for (Depense depense : listDepense) {
			totalDepenseAnnee = totalDepenseAnnee + depense.getCount();
		}
		
		double bilanAnnee = totalRecetteAnnee - totalDepenseAnnee;
		
		return new double[] { totalDepenseAnnee, totalRecetteAnnee, bilanAnnee };

	}
	

}
