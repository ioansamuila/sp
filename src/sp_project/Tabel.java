package sp_project;

public class Tabel extends Subcapitol {
	
	private String tabel;

	public Tabel(String titlu, String titluc, String titlus, String tabel) {
		super(titlu, titluc, titlus);
		this.tabel = tabel;
	}

	public String getTabel() {
		return tabel;
	}

	public void setTabel(String tabel) {
		this.tabel = tabel;
	}
	
}
