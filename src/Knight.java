/**
 * Knight.java - A townsperson which observes the watchman
 * and prints out messages depending on the number of warnings.
 * @author Kevin Prince
 * September 10, 2019
 */
public class Knight implements Observer{
	private Subject watchman;
	/**
	 * Adds the Knight to the watchman's list of Observers.
	 */
	public Knight(Subject watchman) {
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
			System.out.println("Knight: Helps everyone get home safe");
		if (warning==2)
			System.out.println("Knight: Prepares for battle");
	}
}
