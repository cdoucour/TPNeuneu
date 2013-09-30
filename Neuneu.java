
public abstract class Neuneu {
	
	protected int energie;
	protected String nourriture; //type de nourriture mangée par le neuneu
	protected String boisson ; //type de boisson bue par le neuneu
	protected int position;
	protected int id_joueur;
	
	
	public Neuneu (){
		this.setEnergie(0);
		this.setNourriture("inconnu");
		this.setBoisson("inconnu");
		this.setPosition(0);
		this.setId_joueur(10);
	}
	
	public Neuneu (int energie, String nourriture, String boisson, int position, int id_joueur){
		this.setEnergie(energie);
		this.setNourriture(nourriture);
		this.setBoisson(boisson);
		this.setPosition(position);
		this.setId_joueur(id_joueur);
	}
	
	
	// -------- DECLARATION METHODES ABSTRAITES ------------------------------
	public abstract void manger(Nourriture mange, int quantite, Loft plateau);
	public abstract void boire(Boisson boire, int quantite, Loft plateau);
	public abstract void seDeplacer(int position, Loft plateau);
	
	
	
	// ---------- METHODES SUPPLEMENTAIRES ------------------------------------
	public void supprimer(){
		/* A COMPLETER
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
	}
	
	public void seReproduire(){
		/*A COMPLETER
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
	}
	
	public void donnerPosition(){
		/*A COMPLETER
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
	}

	// GETTERS ET SETTERS
	public int getEnergie() {
		return energie;
	}

	public void setEnergie(int energie) {
		this.energie = energie;
	}

	public String getNourriture() {
		return nourriture;
	}

	public void setNourriture(String nourriture) {
		this.nourriture = nourriture;
	}

	public String getBoisson() {
		return boisson;
	}

	public void setBoisson(String boisson) {
		this.boisson = boisson;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getId_joueur() {
		return id_joueur;
	}

	public void setId_joueur(int id_joueur) {
		this.id_joueur = id_joueur;
	}
	
	
}
