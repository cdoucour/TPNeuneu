
public class Voraces extends Neuneu {
	
	// CONSTRCTEUR
		public Voraces (){
			super();
		}
		
		public Voraces (int energie, String nourriture, String boisson, int position, int id_joueur){
				super(energie, nourriture, boisson, position, id_joueur);
		}
	
public void manger(Nourriture mange, int quantite, Loft plateau){
		
		//if (plateau.plateauCase.get(this.getPosition()).contenuAliment)
			
		//boolean existe=false;
		for (Aliment nouri : plateau.plateauCase.get(this.getPosition()).contenuAliment ){
				
				// Si l'element a manger est contenu dans la case 
				// A voir : condition sur le droit de manger un aliment ou pas 
				if (nouri.getNom() == mange.getNom()) {
					
					// si la quantite dans la case est suffisante
					if (nouri.quantite<= quantite){
						// position de l'aliement dans la liste d'aliment que contient la case
						int i = plateau.plateauCase.indexOf(nouri);
						plateau.plateauCase.get(this.getPosition()).contenuAliment.get(i).setQuantite(plateau.plateauCase.get(this.getPosition()).contenuAliment.get(i).getQuantite()-quantite);
						this.energie=this.energie + (quantite)*(plateau.plateauCase.get(this.getPosition()).contenuAliment.get(i).getEnergie());
						}
					// sinon, on consomme tout et on supprime l'aliment de la liste dans la case
					else{int i = plateau.plateauCase.indexOf(nouri);
						this.energie=this.energie + (plateau.plateauCase.get(this.getPosition()).contenuAliment.get(i).getQuantite())*(plateau.plateauCase.get(this.getPosition()).contenuAliment.get(i).getEnergie());
						plateau.plateauCase.get(this.getPosition()).contenuAliment.remove(i);
					}
					
				}
		}
		
	}
	
	
public void boire(Boisson boire, int quantite, Loft plateau){
		// Si l'element a boire est contenu dans la case 
		// A voir : condition sur le droit de boire une boisson ou pas 
		for (Aliment nouri : plateau.plateauCase.get(this.getPosition()).contenuAliment ){
			if (nouri.getNom() == boire.getNom()) {
				
				// si la quantite dans la case est suffisante
				if (nouri.quantite<= quantite){
					// position de l'aliement dans la liste d'aliment que contient la case
					int i = plateau.plateauCase.indexOf(nouri);
					plateau.plateauCase.get(this.getPosition()).contenuAliment.get(i).setQuantite(plateau.plateauCase.get(this.getPosition()).contenuAliment.get(i).getQuantite()-quantite);
					this.energie=this.energie + (quantite)*(plateau.plateauCase.get(this.getPosition()).contenuAliment.get(i).getEnergie());
					}
				// sinon, on consomme tout et on supprime l'aliment de la liste dans la case
				else{int i = plateau.plateauCase.indexOf(nouri);
					this.energie=this.energie + (plateau.plateauCase.get(this.getPosition()).contenuAliment.get(i).getQuantite())*(plateau.plateauCase.get(this.getPosition()).contenuAliment.get(i).getEnergie());
					plateau.plateauCase.get(this.getPosition()).contenuAliment.remove(i);
				}
			}
		}
	}
	
	
public void seDeplacer(int position, Loft plateau){
		
		 plateau.plateauCase.get(position).contenuNeuneu.add(this);
		 plateau.plateauCase.get(this.position).contenuNeuneu.remove(this);
		 this.position=position;
	}

}
