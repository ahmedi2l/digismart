package dal;

public abstract class RessourceFinanciere {

		private String intitule;
		private String type;
		private double montant;
		private int annee;
		private int mois;
		private String description;

		public RessourceFinanciere(String intitule, String type, double montant, int annee, int mois) {
			this.intitule = intitule;
			this.type = type;
			this.montant = montant;
			this.annee = annee;
			this.mois = mois;
			this.description = "";
		}

		public RessourceFinanciere(String intitule, String type, double montant, int annee, int mois,
			String description) {
			this.intitule = intitule;
			this.type = type;
			this.montant = montant;
			this.annee = annee;
			this.mois = mois;
			this.description = description;
		}

		// Getters

		/** Affiche l'intitulé de la ressource
		 * @return the intitule
		 */
		public String getIntitule() {
			return intitule;
		}

		/** Affiche le type de ressource
		 * @return the type
		 */
		public String getType() {
			return type;
		}

		/** Affiche le montant de la ressource
		 * @return the montant
		 */
		public double getMontant() {
			return montant;
		}

		/** Affiche l'année d'entrée de la ressource
		 * @return the annee
		 */
		public int getAnnee() {
			return annee;
		}

		/** Affiche le mois d'entrée de la ressource
		 * @return the mois
		 */
		public int getMois() {
			return mois;
		}

		/**
		 * @return the description
		 */
		public String getDescription() {
			return description;
		}
		
		

		//Methods
		public void modifierRessource(RessourceFinanciere nouvelleRessource) {
			this.intitule = nouvelleRessource.getIntitule();
			this.type = nouvelleRessource.gettype;
			this.montant = nouvelleRessource.getMontant();
			this.annee = nouvelleRessource.getAnnee();
			this.mois = nouvelleRessource.getMois();
			this.description = nouvelleRessource.getDescription();
		}
		
	}


