
public class AppPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Plant plant1 = new Plant();
		Tree tree1 = new Tree();
		
		Plant plant2 = tree1;
		
		plant2.grow();

		plant1.grow();
		
//		will not work because the type of variable is not matching the type of reference
//		plant2.sheadLeaves();
		
		Plant plant3;

		
		
		tree1.sheadLeaves();
		
		doGrow(tree1);
		
		
	}
	
	
	public static void doGrow(Plant plant) {
			plant.grow();
	}
	

}
