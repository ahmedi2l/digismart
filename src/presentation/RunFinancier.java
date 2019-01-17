package presentation;

import java.util.ArrayList;
import java.util.Scanner;

import bal.Financier;
import dal.BDD;
import dal.Depense;
import dal.Recette;
import dal.RessourceFinanciere;

public class RunFinancier {

	private static String menuPrincipal = "*********** MENU GESTION FINANCIERE ***********\r\n"
			+ "1. Afficher le r�capitulatif annuel des d�penses et recettes\r\n"
			+ "2. G�rer les d�penses\r\n" + "3. G�rer les recettes\r\n"
			+ "4. Changer les Types de D�penses ou de recettes\r\n\n" + "0. Quitter\r\n";

	private static String menuDepense = "*********** GESTION DES DEPENSES ***********\r\n"
			+ "1. Afficher une d�pense\r\n" + "2. Ajouter une d�pense\r\n"
			+ "3. Retirer une d�pense\r\n" + "4. Modifier une d�pense\r\n" + "0. Quitter\r\n";

	private static String menuRecette = "*********** GESTION DES DEPENSES ***********\r\n"
			+ "1. Afficher une recette\r\n" + "2. Ajouter une recette\r\n"
			+ "3. Retirer une recette\r\n" + "4. Modifier une recette\r\n" + "0. Quitter\r\n";

	public static void run() {
		// TODO clear screen
		boolean isRunning = true;

		while (isRunning) {
			System.out.println(menuPrincipal);
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			sc.close();

			switch (choice) {
			case 1:
				// TODO add method Afficher r�capitulatif annuel du bilan
				// financier
				break;
			case 2:
				afficherMenuDepense();
				break;
			case 3:
//				afficherMenuRecette();
				break;
			case 4:
				
				// TODO add method changer Types de d�penses
				break;
			case 0:
				break;
			default:
				isRunning = false;
				break;
			}
		}
	}

	
	/**
	 *  Affiche le sous-Menu Gestion des depenses
	 *  si quitte : retourne au menu principal de Gestion financiere
	 */
	public static void afficherMenuDepense() {
		boolean isRunning = true;
		
		while (isRunning) {
			ArrayList<Object> args;
			
			System.out.println(menuDepense);
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			sc.close();

			
			
			switch (choice) {
			case 1:
				// TODO add method
				break;
			case 2:
				System.out.println("**** Ajouter une d�pense ****\n");
				args = askRessourceArgs("depense");
				Depense newDepense = new Depense((String)args.get(0), (String)args.get(1), (double)args.get(2), (int)args.get(3), (int)args.get(4), (String)args.get(5));
				Financier.addDepense(newDepense);
				args = null;
				break;
			case 3:
				System.out.println("**** Supprimer une d�pense ****\n");
				args = findRessourceArgs("depense");
				Depense depenseToDelete = Financier.getDepenseFromDB(args);
				Financier.deleteDepense(depenseToDelete);
				args = null;
				break;
			case 4:
				System.out.println("**** Modifier une d�pense ****\n");
				args = findRessourceArgs("depense");
				Depense depenseToChange = Financier.getDepenseFromDB(args);
				Financier.modifierDepense(depenseToChange);
			case 0:
				isRunning = false;
				break;
			default:
				break;
			}
		}
	}
		
	/**
	 * R�cup�re les donn�es n�cessaires � la cr�ation/modification d'une ressource
	 * @param depenseORrecette choisir "depense" ou "recette
	 * @return ArrayList<Object> args = {String, String, double, int, int, String}
	 */
	public static ArrayList<Object> askRessourceArgs(String depenseORrecette){
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Object> args = new ArrayList<>();
		String intitule, type, description;
		double montant;
		int annee, mois;
		
		System.out.println("Veuillez saisir les informations concernant la "+ depenseORrecette);
		System.out.println("Intitul� : ");
		intitule = sc.nextLine();
		args.add(intitule);
		System.out.println("Type : ");
		type = sc.nextLine();
		args.add(type);
		System.out.println("Montant : ");
		montant = sc.nextInt();
		args.add(montant);
		System.out.println("Annee : ");
		annee = sc.nextInt();
		args.add(annee);
		System.out.println("Mois : ");
		mois = sc.nextInt();
		args.add(mois);
		System.out.println("Description (facultative) : \n");
		description = sc.nextLine();
		args.add(description);
		sc.close();
		
		return args;
	}
	/**
	 * R�cup�re les attributs n�cessaires � la recherche d'une ressource
	 * @param depenseOrRecette choisir le type de ressources "depense" ou "recette"
	 * @return ArrayList<Object> args = {String, int, int}
	 */
	public static ArrayList<Object> findRessourceArgs(String depenseOrRecette){
	Scanner sc = new Scanner(System.in);
		
		ArrayList<Object> args = new ArrayList<>();
		String intitule;
		int annee, mois;
		
		System.out.println("Veuillez saisir les informations concernant la "+ depenseOrRecette);
		System.out.println("Intitul� : ");
		intitule = sc.nextLine();
		args.add(intitule);
		System.out.println("Annee : ");
		annee = sc.nextInt();
		args.add(annee);
		System.out.println("Mois : ");
		mois = sc.nextInt();
		args.add(mois);
		sc.close();
		
		return args;
	}
}
