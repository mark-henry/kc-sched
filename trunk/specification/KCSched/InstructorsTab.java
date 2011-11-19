/*
 * KCInstructorsTab.java
 * Author: Bradley Zeller
 * Date: 10-20-11
 *
 * This class is what is viewed when the main "Data" tab is selected from the top menu,
 * and then the "Instructors" tab is selected from the left.  This is only viewed by an
 * admin, instructors do not have access to this view.
 *
 */
package KCSched;

import java.util.*;
public abstract class InstructorsTab {
	Collection<Instructor> instructorsList;
	
	/*
	 * Triggered when a user clicks the "+" button.
	 * This will pop up a dialogue box that will ask the user
	 * for all the instructors information.  It will then 
	 * add the instructor to the database. 
	 */
	public abstract void addInstructor();
	
	/*
	 * This is triggered when a user clicks the column heading. 
	 * For example, if the user clicks the column "first name," then
	 * the list of instructors becomes sorted by first name.
	 */
	public abstract void sortColumn();
	
	public abstract Collection<Instructor> getInstructors();
	
}