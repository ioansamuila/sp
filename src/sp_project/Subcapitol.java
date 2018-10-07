package sp_project;

public class Subcapitol extends Capitol {
	
	private String titlus;

	public Subcapitol(String titlu, String titluc, String titlus) {
		super(titlu, titluc);
		this.titlus = titlus;
	}

	public String getTitlus() {
		return titlus;
	}

	public void setTitlus(String titlus) {
		this.titlus = titlus;
	}
	
}
