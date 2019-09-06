import forest.Field;
import forest.Oak;
import forest.Plant;





/*
 * Public = can access anywhere
 * protected = can access within child class or package
 * no modifier = same package only
 * 
 */




public class AppPubPriPro {

	public static void main(String[] args) {
		

		Plant plant1 = new Plant();
		
		Oak oak1 = new Oak();
		
		
		//bad practice
		System.out.println(plant1.name);
		//acceptable
		System.out.println(plant1.ID);
		
		
		
		Field field1 = new Field();
		
		//size is protected it wont work; AppPubPriPro is not in the same package as plant
		//System.out.println(plant1.size);
		
		
		
		
	}

}
