
class Saiyan{
	
	int price;
	
	public Saiyan() {
		
	}
	
	public void getPrice(int price) {
		this.price = price;
	}
	
	public int setPrice() {
		return price;
	}
}


public class AppStringFormatting {

	public static void main(String[] args) {

		
		Saiyan saiyan = new Saiyan();
		
		saiyan.price = 44;
		
		
		// Inefficient
		String info = "";
		info +="Hai Haruhi Desu ";
		info +="Urusai wa ne !";
		
		System.out.println(info);
		
		// More Efficient
		StringBuilder sb = new StringBuilder();
		
		sb.append("Hello my name is Kyon.");
		sb.append(" ");
		sb.append("I am the Protagonist of the anime: ");
		sb.append("The Melancholy of Haruhi Suzumiya");
		
		System.out.println(sb.toString());
		
		StringBuilder s = new StringBuilder();
		
		s.append("Watashi wa namae Yuki Nagato.")
		.append(" ")
		.append("I am an Alien.");
		
		System.out.println(s.toString());
		
		
		////Formatting///////
		
		System.out.println("Here is some text. \t That was a tab. \nThat was a newline.");
		
		System.out.printf("Total cost is %-10d; quantitiy is %d \n", saiyan.price,15);
		
		
		for(int i=0;i<8;i++) {
			System.out.printf("text %-2d \n",i);
		}
		
		//Formatting floating value point "Decimal"
		System.out.printf("Total value:  %.3f \n",Math.PI);
		
		
		
	}

}
