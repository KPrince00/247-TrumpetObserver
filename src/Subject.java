/**
 * Subject.java - An interface intended for use in conjunction with Observers.
 * A subject should have an ArrayList of observers, which can be added to
 * using registerObsever and removed from using removeObserver.
 * @author Kevin Prince
 * September 10th, 2019
 */
public interface Subject {
	/**
	 * Adds the passed in observer to an ArrayList, 
	 * which will all be updated when notifyObservers is called.
	 */
	public void registerObserver(Observer observer);
	/**
	 * Removes the passed in observer from the ArrayList.
	 */
	public void removeObserver(Observer observer);
	/**
	 * Goes through the ArrayList of Observers and 
	 * calls the update method for each of them.
	 */
	public void notifyObservers();
}
