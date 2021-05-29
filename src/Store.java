
public abstract class Store {

	private String name;
	private int storeID;
	private double distanceFromHome;
	private boolean pricey;
	private int ageOfStore;
	
	public static final int DEFAULT_ID = 0;
	
	
//	CONSTRUCTOR
	public Store(String name, int storeID, double distanceFromHome, 
		boolean pricey,	int ageOfStore) {
		this.name = name;
		this.storeID = storeID;
		this.distanceFromHome = distanceFromHome;
		this.pricey = pricey;
		this.ageOfStore = ageOfStore;
		
		
	}
	
//	2nd CONSTRUCTOR with default id
	public Store(String name, double distanceFromHome, boolean pricey, 
			int ageOfStore) {
		this(name, DEFAULT_ID, distanceFromHome, pricey, ageOfStore);
	}
	
//	GETTERS
	public String getName() {
		return name;
	}
	
	public int getStoreID() {
		return storeID;
	}
	
	public double getDistanceFromHome() {
		return distanceFromHome;
	}
	
	public boolean isPricey() {
		return pricey;
	}
	
	public int getAgeOfStore() {
		return ageOfStore;
	}
	
	
//	SETTERS
	public void setName(String name) {
		this.name = name;
	}
	
	public void setStoreID(int storeID) {
		this.storeID = storeID;
	}
	
	public void setDistanceFromHome(double distanceFromHome) {
		if(distanceFromHome > 0)
		this.distanceFromHome = distanceFromHome;
	}
	
	public void setPricey(boolean pricey) {
		this.pricey = pricey;
	}
	
	public void setAgeOfStore(int ageOfStore) {
		if(ageOfStore > 0)
		this.ageOfStore = ageOfStore;
	}
	
	
//	toString
	@Override
	public String toString() {
		String s = "";
		s += name + " " + "(Store ID: " + storeID + " ) \r";
		s += "This store is " + distanceFromHome + " miles away from you. \r";
	
		return s;
		
	}
	
	@Override
	public boolean equals(Object obj) {
//		"am i getting an object from store?"
		if(obj instanceof Store) {
			Store otherStore = (Store) obj;
			
			int otherStoreID = otherStore.storeID;
			String otherStoreName = otherStore.name;
			
			return (storeID == otherStoreID 
					&& name.equalsIgnoreCase(otherStoreName));
			
		} else {
			return false;
		}
	}
	
	public void giveDiscounts() {
		System.out.println(name + " is giving out  discounts!");
	}
	
	public abstract void review(); 
	
	public void recruitEmployees() {
		System.out.println(name + " will look to hire people");
	}
	
	public abstract void updateInventory();
	
}
