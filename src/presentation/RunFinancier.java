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
				afficherMenuRecette();
				break;
			case 4:
				
				// TODO add method changer Types de d�penses
				break;
			case 0:
				break;
			default:
				System.out.println("Veuillez indiquer votre choix : 1 2 3 ou 4");
				break;
			}
		}
	}

	public static void afficherMenuDepense() {
		boolean isRunning = true;
		
		while (isRunning) {
			ArrayList args;
			
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
				// TODO add method to find ressource depenseToDelete
				Financier.deleteDepense(depensetoDelete);
				args = null;
				break;
			case 4:
				System.out.println("**** Modifier une d�pense ****\n");
				args = findRessourceArgs("depense");
				// TODO add method to find ressource depenseTochange
				
				break;
			case 0:
				System.out.println("Vous avez quitt� l'application");
				break;
			default:
				break;
			}
		}
	}
	
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
