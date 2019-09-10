/**
 * Teacher.java - A townsperson which observes the watchman
 * and prints out messages depending on the number of warnings.
 * @author Kevin Prince
 * September 10, 2019
 */
public class Teacher implements Observer{
	private Subject watchman;
	/**
	 * Adds the Teacher to the watchman's list of Observers.
	 */
	public Teacher(Subject watchman) {
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
			System.out.println("Teacher: Helps get every kid home safe");
		if (warning==2)
			System.out.println("Teacher: Brings all students to the underground shelter");
	}
}
