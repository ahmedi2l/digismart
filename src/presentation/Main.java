package presentation;

import bal.Depense;
import bal.RessourceFinanciere;
import dal.BDD;
import sun.security.provider.certpath.OCSP.RevocationStatus;

public class Main {

	public static void main(String[] args) {
//		BDD bdd = new BDD();
//		ArrayList<Depense> testList = ListeDepenseGenerator.createDepenseDB(2015,3);
//		for (RessourceFinanciere ressourceFinanciere : testList) {
//			System.out.println(ressourceFinanciere);
//		}
		for (Depense depense : BDD.listDepense) {
			System.out.println(depense);
		}
		
	}

}
