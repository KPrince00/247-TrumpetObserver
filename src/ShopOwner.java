/**
 * ShopOwner.java - A townsperson which observes the watchman
 * and prints out messages depending on the number of warnings.
 * @author Kevin Prince
 * September 10, 2019
 */
public class ShopOwner implements Observer{
	private Subject watchman;
	/**
	 * Adds the ShopOwner to the watchman's list of Observers.
	 */
	public ShopOwner(Subject watchman) {
		this.watchman = watchman;
		this.watchman.registerObserver(this);
	}
	/**
	 * Outputs messages depending on the number of warnings.
	 * This method is intended to have been called by a watchman.
	 */
	@Override
	public void update(int warning) {
		// TODO Auto-generated method stub
		if (warning==1) 
			System.out.println("Shop Owner: Close down shop and head home");
		if (warning==2)
			System.out.println("Shop Owner: Drops everything and find nearest hideout");
	}

}
