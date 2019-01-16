package dal;

public class TypeRessourceUtil {

	// Attributs

	// Constructeur
	public TypeRessourceUtil() {

	}

	public static void addType(String type) {
		BDD.listType.add(type);
	}

	public static void deleteType(String type) {
		BDD.listType.remove(type);
	}

	public static void modifierType(String type1, String type2) {
		try {
			int type1Index = BDD.listType.indexOf(type1);
			BDD.listType.add(type1Index, type2);
			BDD.listType.remove(type1);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
