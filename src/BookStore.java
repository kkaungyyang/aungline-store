
public class BookStore extends Store {

//	child constructor for BookStore
	public BookStore(String name, int storeID, double distanceFromHome, boolean pricey, int ageOfStore) {
		super(name, storeID, distanceFromHome, pricey, ageOfStore);
	}
	
// 2nd child constructor with default id
	public BookStore(String name, double distanceFromHome, boolean pricey, int ageOfStore) {
		super(name, distanceFromHome, pricey, ageOfStore);
	}

	
	@Override
	public void updateInventory() {
		System.out.println(super.getName() + " is receiving books.");
		
	}

	@Override
	public void review() {
		System.out.println("The librarian will check for for book defects");
		
	}

	
	
}
