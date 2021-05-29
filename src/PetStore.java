
public class PetStore extends Store {

//	child constructor for PetStore
	public PetStore(String name, int storeID, double distanceFromHome, boolean pricey, int ageOfStore) {
		super(name, storeID, distanceFromHome, pricey, ageOfStore);
	}
	
// 2nd child constructor with default id
	public PetStore (String name, double distanceFromHome, boolean pricey, int ageOfStore) {
		this(name, DEFAULT_ID, distanceFromHome, pricey, ageOfStore);
	}

	@Override
	public void updateInventory() {
		System.out.println(super.getName() + " is receiving birds and snakes.");
		
	}

	@Override
	public void review() {
		System.out.println("PETA will check for animal safety");
		
	}

	




}
