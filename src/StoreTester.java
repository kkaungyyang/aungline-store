import java.util.ArrayList;

public class StoreTester {

	public static void main(String[] args) {
		

		Store s1 = new FoodStore("Ino", 1244, 5, true, 40, false);
		Store s2 = new BookStore("UCSD BookStore", 2312, 10, false, 100);
		
	
		
		ArrayList<Store> storeList = new ArrayList<>();
		
		storeList.add(s1);
		storeList.add(s2);
		storeList.add(new PetStore("Petco", 2321, 20, false, 30));
		
		for (Store x : storeList) {
			System.out.println(x.getName());
		}
		
		
	}

}
