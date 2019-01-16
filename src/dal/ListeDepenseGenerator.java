package dal;

import java.util.ArrayList;

public class ListeDepenseGenerator {

	private double montant;
	static ArrayList<Depense> listDepense;
	
	private static String[] listStock = { "fournitures", "cantine", "informatique", "entretien" };

	public static ArrayList<Depense> createDepenseDB(int anneeDepart, int nbAnnee) {
	
		listDepense = new ArrayList<>();
		
		for (int annee = anneeDepart; annee <= (anneeDepart + nbAnnee); annee++) {

			for (int mois = 1; mois <= 12; mois++) {
				// (Immobilisation / Charges / Stocks/ Tiers/)
				// ("Intitlé", "TypeDepense", montant, annee, mois,
				// ("description"))

				// Immobilisation
				listDepense.add(new Depense("loyer", "immobilisation", 4500, annee, mois, "ex description"));

				// charges
				listDepense
						.add(new Depense("electricite", "charge", rand(150.0, 200.0), annee, mois));
				listDepense.add(new Depense("eau", "charge", rand(80.0, 120.0), annee, mois, "c'est très cher"));
				// Stocks
				for (int nbStocks = 0; nbStocks < rand(2, 5); nbStocks++) {

					listDepense.add(new Depense(listStock[rand(0, listStock.length - 1)], "Stock",
							rand(100.0, 400.0), annee, mois));
				}
			}
		}
		return listDepense;
	}

	public static int rand(int valMin, int valMax) {
		int value = valMin + (int) (Math.random() * (valMax - valMin + 1));
		return value;
	}

	public static double rand(double valMin, double valMax) {
		double value = valMin + (Math.random() * (valMax - valMin + 1));
		int valueInt = (int)(value * 100);
		value = (double)valueInt / 100;
		return value;
	}
}
