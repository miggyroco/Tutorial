
class Saiyan{
	
	private String name;
	private int age;
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setInfo(String name, int age) {
		setName(name);
		setAge(age);
		
	}
	
	
}


public class App {

	public static void main(String[] args) {
		
		
		Saiyan saiyan1 = new Saiyan();
		Saiyan saiyan2 = new Saiyan();
		
		saiyan1.setName("Vegeta");
		saiyan1.setAge(41);
	
		
		System.out.println(saiyan1.getName());
		System.out.println(saiyan1.getAge());
		
		saiyan2.setInfo("Goku", 37);
		
		System.out.println(saiyan2.getName()+" "+saiyan2.getAge());
		
		
	}
	
}
