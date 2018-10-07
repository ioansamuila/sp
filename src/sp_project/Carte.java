package sp_project;

public class Carte {
	
	private String titlu;

	public Carte(String titlu) {
		super();
		this.titlu = titlu;
	}

	public String getTitlu() {
		return titlu;
	}

	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}

	@Override
	public String toString() {
		return "Carte = " + titlu;
	}
	
	
}
