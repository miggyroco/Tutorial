
public class AppInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Machine mach1 = new Machine();
	        mach1.start();
	         
	     Person person1 = new Person("Vegeta");
	     	person1.greet();
	     
	     Info info1 = new Machine();
	     info1.showInfo();
	         
	     Info info2 = person1;
	     info2.showInfo();
//	         
	        System.out.println();
//	         
	        showInfo(mach1);
	        showInfo(person1);
//	    	  
		
	}
	
	private static  void showInfo(Info info) {
		info.showInfo();
	}
	
	

}
