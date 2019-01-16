package dal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import dal.ListeDepenseGenerator;

public class BDD {

	public static ArrayList<Depense> listDepense = ListeDepenseGenerator.createDepenseDB(2015,3);
	public static ArrayList<Recette> listRecette;
	public static Map<Integer, String> listType = new HashMap<Integer, String>();
	public static ArrayList<Professeur> professeurs;
	
}
