package forest;

public class Field extends Plant{

	private Plant plant = new Plant();
	
	public Field() {
		
		
		//size is protected and field is within the same package as plant
		System.out.println(plant.size);
	}
	
	
}
