/*
 * KCCoursesTab.java
 * Author: Bradley Zeller
 * Date: 10-20-11
 *
 * This class is what is viewed when the main "Data" tab is selected from the top menu,
 * and then the "Courses" tab is selected from the left.  This is only viewed by an
 * admin, instructors do not have access to this view.
 *
 */

import java.util.*;
public abstract class KCCoursesTab {
	Collection<KCCourse> coursesList;
	
	/*
	 * Triggered when a user clicks the "+" button.
	 * This will pop up a dialogue box that will ask the user
	 * for all the course information.  It will then 
	 * add the course to the database. 
	 */
	public abstract void addCourse();
	
	/*
	 * This is triggered when a user clicks the column heading. 
	 * For example, if the user clicks the column "course name," then
	 * the list of courses becomes sorted by course name.
	 */
	public abstract void sortColumn();
	
	public abstract Collection<KCCourse> getInstructors();
	
}