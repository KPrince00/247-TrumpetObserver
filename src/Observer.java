/**
 * Observer.java - an interface intended to be used in conjunction with Subject.
 * Observers are able to receive updates from their subjects.
 * @author Kevin
 * September 10th, 2019
 */
public interface Observer {
	/**
	 * Receives an update from subject and displays corresponding message
	 * @param warning Number of trumpet calls.
	 */
	public void update(int warning);
}
