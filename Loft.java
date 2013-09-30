import java.util.*;


public class Loft {
	protected int hauteur;
	protected int largeur;
	protected ArrayList<Case> plateauCase;
	protected LinkedList<Neuneu> population;
	
	
	// CONSTRUCTEURS
	public Loft(){
		this.hauteur=0;
		this.largeur=0;
		this.plateauCase= new ArrayList<Case>();
		this.population= new LinkedList<Neuneu>();
		
	}
	
	public Loft(int largeur, int hauteur){
		this.hauteur=largeur;
		this.largeur=hauteur;
		int a = largeur*hauteur;
		this.plateauCase= new ArrayList<Case>(a);
		this.population= new LinkedList<Neuneu>();
		
	}
	
	public Loft(int hauteur, int largeur, ArrayList<Case> plateauCase, LinkedList<Neuneu> population){
		this.hauteur=hauteur;
		this.largeur=largeur;
		this.plateauCase= new ArrayList<Case>(plateauCase);
		this.population= new LinkedList<Neuneu>(population);
		
	}
	
	// METHODES
	public void modifierNourriture(Aliment nour, int caseModifiee, int quantite){
		
		boolean existe=false;
		for (Aliment nouri : this.plateauCase.get(caseModifiee).contenuAliment ){
				if (nouri.nom == nour.nom) {
					int i = this.plateauCase.indexOf(nouri);
					this.plateauCase.get(caseModifiee).contenuAliment.get(i).setQuantite(quantite);
					existe = true;
				}
				
		}
		
		if (existe=false){
			this.plateauCase.get(caseModifiee).contenuAliment.add(new Aliment(nour));
		}
	}
	
	// *******GETTERS ET SETTERS **************
	public int getHauteur() {
		return hauteur;
	}

	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}

	public int getLargeur() {
		return largeur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	

	
	
	
}
