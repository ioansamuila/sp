package sp_project;

public class Capitol extends Carte {
	
	private String titluc;

	public Capitol(String titlu, String titluc) {
		super(titlu);
		this.titluc = titluc;
	}

	public String getTitluc() {
		return titluc;
	}

	public void setTitluc(String titluc) {
		this.titluc = titluc;
	}	
}
