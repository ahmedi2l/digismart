package dal;

public class TypeRessourceUtil {

	// Attributs
	private static int typeNextKey = 0;

	// Constructeur
	public TypeRessourceUtil() {
		super();
	}

	// Methodes
	/**
	 * Ajouter un type de ressource
	 * 
	 * @param type Nom de la ressource a ajouter
	 */
	public static void addType(String type) {
		BDD.listType.put(typeNextKey, type);
		typeNextKey++;
	}

	/**
	 * Recuperer la cle d'un type
	 * 
	 * @param type Nom du type
	 * @return cle du type type
	 */
	public static Integer getKey(String type) {
		Integer key = null;
		for (int keyIterator : BDD.listType.keySet()) {
			if (type.equals(BDD.listType.get(keyIterator))) {
				key = keyIterator;
			}
		}
		return key;
	}

	/**
	 * Supprimer un type deja enregistre
	 * 
	 * @param type nom du type a supprimer
	 */
	public static void deleteType(String type) {
		if (getKey(type) != null) {
			BDD.listType.remove(getKey(type));
		}
	}

	/**
	 * Modifier un type de ressource
	 * 
	 * @param type1 nom du type a modifier
	 * @param type2 nom du nouveau type
	 */
	public static void modifierType(String type1, String type2) {
		try {
			int key1 = getKey(type1);
			BDD.listType.remove(key1);
			BDD.listType.put(key1, type2);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}