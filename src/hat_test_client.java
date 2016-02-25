
public class hat_test_client {

	public static void main(String[] args) {
		Hat<String> people = new Hat<String>();
		people.add("Ama");
		people.add("Kofi");
		people.add("Yaa");
		people.add("Adwoa");
		
		System.out.println("Washing dishes: " + people.draw());
		System.out.println("Vacuuming: " + people.draw());
		
		System.out.println(people.size());
	}

}
