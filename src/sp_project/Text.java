package sp_project;

public class Text extends Subcapitol {
	
	private String text;

	public Text(String titlu, String titluc, String titlus, String text) {
		super(titlu, titluc, titlus);
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
