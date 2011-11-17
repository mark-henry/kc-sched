/*
 * KCDataTab.java
 * Author: Bradley Zeller
 * Date: 10-20-11
 *
 * This class holds references to the three types of "data" tabs within
 * this view: Instructors, Rooms, and Courses.  This object is mainly
 * in charge of displaying/ managing the left-hand tabs and bringing
 * the corresponding data-view to the foreground.
 *
 */
package KCSched;

import java.util.*;

public abstract class DataTab {
	String userName;

	InstructorsTab instructorsTab;
	CoursesTab coursesTab;
	RoomsTab roomsTab;
	
	/*
	 * Brings the selected tab to the foreground
	 * and moves the others to the background.  It populates
	 * the main display with the corresponding tab.
	 */
	public abstract void bringToForeground();
	
}