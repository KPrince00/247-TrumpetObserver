/**
 * Subject.java - An interface intended for use in conjunction with Observers.
 * A subject should have an ArrayList of observers, which can be added to
 * using registerObsever and removed from using removeObserver.
 * @author Kevin Prince
 * September 10th, 2019
 */
public interface Subject {
	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers();
}
