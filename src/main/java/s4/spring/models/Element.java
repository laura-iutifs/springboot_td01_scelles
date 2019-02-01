package s4.spring.models;

public class Element {
	private String nom;
	private int evaluation;
	public Element() {
		this.nom="scelles";
	}

	// -----------------------------------
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	// -----------------------------------
	public int getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(int evaluation) {
		this.evaluation = evaluation;
	}
	// -----------------------------------

	public boolean equalsItems(Object obj) {
		if ((obj == null) || (obj.getClass() != this.getClass()) || nom == null)
			return false;

		if (nom == obj.getClass().getName())
			return true;
		
		return false;
	}
}
