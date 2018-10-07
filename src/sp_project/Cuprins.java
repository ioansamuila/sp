package sp_project;

public class Cuprins extends Carte {
	
	private String continut;

	public Cuprins(String titlu, String continut) {
		super(titlu);
		this.continut = continut;
	}

	public String getContinut() {
		return continut;
	}

	public void setContinut(String continut) {
		this.continut = continut;
	}
}
