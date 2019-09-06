package forest;

public class Plant {

	//Bad practice public
	public String name;
	
	//Acceptable practice --- it's final.
	public final static int ID=8;
	
	
	private String type;
	protected String size;
	int height;
	
	public Plant() {
		this.name = "Vegeta";
		this.type = "plant";
		this.size = "medium";
	}
	
}
