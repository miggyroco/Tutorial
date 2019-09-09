import java.util.ArrayList;
import java.util.HashMap;


class Animal{
	
}




public class AppGenerics {

	public static void main(String[]args) {
		
		
		//////// Before java 5 /////////
		ArrayList list = new ArrayList();
		
		list.add("apple");
		list.add("banana");
		list.add("orange");
		
		String fruit = (String)list.get(2);
		System.out.println(fruit);
		
		
		///////////// Modern
		ArrayList<String> pets = new ArrayList<String>();
		pets.add("Neko");
		pets.add("Inu");
		pets.add("Tori");
		
		String animal = pets.get(0);
		
		System.out.println(animal);
		
		///////////// more than one type of argument
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		
		//////////// java 7 style ////////////
		ArrayList <Animal> someList = new ArrayList<>();
		
		
		
		
	}
	
	
}
