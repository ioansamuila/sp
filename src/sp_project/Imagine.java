package sp_project;

public class Imagine extends Subcapitol {
	
	private String imagine;

	public Imagine(String titlu, String titluc, String titlus, String imagine) {
		super(titlu, titluc, titlus);
		this.imagine = imagine;
	}

	public String getImagine() {
		return imagine;
	}

	public void setImagine(String imagine) {
		this.imagine = imagine;
	}
	
}
