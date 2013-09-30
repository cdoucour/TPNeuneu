import java.util.*;


public class Case  {
	protected LinkedList<Aliment> contenuAliment;
	protected LinkedList<Neuneu> contenuNeuneu;
	protected int id_case;
	
	public Case () {
		
		this.contenuAliment= new LinkedList<Aliment>();
		this.contenuNeuneu= new LinkedList<Neuneu>();
		this.id_case=0;
	}
	
	public Case(LinkedList<Aliment> contenuAliement, LinkedList<Neuneu> contenuNeuenu, int id_case){
		this.contenuAliment= new LinkedList<Aliment>(contenuAliment);
		this.contenuNeuneu= new LinkedList<Neuneu>(contenuNeuneu);
		this.id_case=id_case;
			
	}
	
	public void modifierNourriture(){
		/* A COMPLETER
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
	}

	public int getId_case() {
		return id_case;
	}

	public void setId_case(int id_case) {
		this.id_case = id_case;
	}

}
