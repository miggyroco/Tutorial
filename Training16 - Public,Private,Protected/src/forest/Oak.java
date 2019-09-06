package forest;

public class Oak extends Plant{

	public Oak() {
		
		//Won't work because type is private
		//type = "tree";
		
		//this is working because the size is protected(the subclass can use it) 
		this.size = "large";
		this.height = 15;
	
		
	}
	
}
