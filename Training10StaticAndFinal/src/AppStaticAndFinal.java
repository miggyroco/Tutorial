class Thing{
	
	public final static int CODE = 27;
	
	public static int count = 0;
	
	public int id;
	
	public String name;
	public static String description;
	
	
	public Thing() {
		
		id = count;
		count++;
	}
	
	public void showName() {
		System.out.println("Object ID:"+id +" "+ description + name);
		
	}
	
	public static void showInfo() {
		System.out.println(description);
	}
	
}


public class AppStaticAndFinal {
	
	public static void main(String[] args) {		
		
		Thing.description = "Equipment: ";
		Thing.showInfo();
		
		System.out.println(Thing.description);
		
		System.out.println("Before creating objects count is "+Thing.count);
		
		
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		thing1.name = "Phone";
		thing2.name = "Knife";
		
		thing1.showName();
		thing2.showName();

		System.out.println("After creating objects count is "+Thing.count);
		
		
		//Static
		System.out.println(Thing.CODE);
		
	}

}
