import java.util.ArrayList;
/**
 * Watchman.java - A watchman to issue warnings to other townsfolk.
 * Is a subject intended for use in a driver with other observers.
 * @author Kevin Prince
 * September 10, 2019
 */
public class Watchman implements Subject{
	private ArrayList<Observer> observers;
	int warning;
	public Watchman()
	{
		observers = new ArrayList<Observer>();
	}	
	/**
	 * Adds the passed in observer to an ArrayList, 
	 * which will all be updated when notifyObservers is called.
	 */
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	/**
	 * Removes the passed in observer from the ArrayList.
	 */
	@Override
	public void removeObserver(Observer observer) {
		// TODO Auto-generated method stub
		observers.remove(observer);
	}
	
	/**
	 * Goes through the ArrayList of Observers and 
	 * calls the update method for each of them, passing
	 * in the number of trumpet calls.
	 */
	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(Observer observer:observers)
			observer.update(this.warning);
	}
	/**
	 * Displays a message of how many warnings are issued,
	 * then calls notifyObservers() to update it's observers.
	 * @param warning number of trumpet calls/warnings
	 */
	public void issueWarning(int warning) {
		this.warning = warning;
		if(warning == 1)
			System.out.println("WARNING:  " + warning + " trumpet was played!");
		else
			System.out.println("WARNING:  " + warning + " trumpets were played!");
		notifyObservers();
	}
}
