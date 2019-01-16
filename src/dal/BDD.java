package dal;

import java.util.ArrayList;
import dal.ListeDepenseGenerator;

public class BDD {

	public static ArrayList<Depense> listDepense = ListeDepenseGenerator.createDepenseDB(2015,3);
	public static ArrayList<Recette> listRecette;
	public static ArrayList<String> listType;
	public static ArrayList<Professeur> professeurs;
	
}
