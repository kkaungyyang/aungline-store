
public class FoodStore extends Store{

	private boolean veganFriendly;
	
//	child constructor for FoodStore
	public FoodStore(String name, int storeID, double distanceFromHome,
			boolean pricey, int ageOfStore, boolean veganFriendly) {
		
		super(name, storeID, distanceFromHome, pricey, ageOfStore);
		this.veganFriendly = veganFriendly;
	}
	
// 2nd child constructor with default id
	public FoodStore(String name, double distanceFromHome,
			boolean pricey, int ageOfStore, boolean veganFriendly) {
		
//		super(name, distanceFromHome, pricey, ageOfStore);
//		this.veganFriendly = veganFriendly;
		
		this(name, DEFAULT_ID, distanceFromHome, pricey, ageOfStore, veganFriendly);
	}

	
	public boolean isVeganFriendly() {
		return veganFriendly;
	}

	public void setVeganFriendly(boolean veganFriendly) {
		this.veganFriendly = veganFriendly;
	}

	@Override
	public String toString() {
		String s = super.toString();
		
		if(veganFriendly == true) {
			s += "Btw this place is vegan friendly";
			return s;
		} else {
			s += "Btw this place is not vegan friendly";
			return s;
		}
		
	}
	
	
//	aside from name and ID, both stores must be vegan friendly
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof FoodStore) {
			FoodStore otherStore = (FoodStore) obj;
			return (super.equals(obj) && veganFriendly == otherStore.veganFriendly);
		} else {
			return false;
		}
	}
	
	@Override
	public void review() {
		System.out.println("FDA will check for food safety");
	}

	@Override
	public void updateInventory() {
		System.out.println(super.getName() + " is receiving food items.");
		
	}
	
	
	
	



}
