/*
 * CoursesTab.java
 * Author: Nathaniel Chamness
 * Date: 11/29/11
 *
 * This class is what is viewed when the main "Data" tab is selected from the 
 * top menu, and then the "Courses" tab is selected from the left.  This is 
 * only viewed by an admin, instructors do not have access to this view.
 *
 */
package KCSched;

import java.util.*;
public abstract class CoursesTab {
	Collection<Course> coursesList;
   Course newCourse;
	
	/*
	 * Triggered when a user clicks the "+" button on the 'Courses Added'
    * section of the view. This will then bring up a clear 'Course Information'
    * section in which you can enter course info into.
	 */
	public abstract void addCourse();
   
   
   /*
    * Triggered when a user clicks the "-" button on the 'Courses Added'
    * section of the view. This will then remove the highlighted course in 
    * 'Courses Added'.
    */
   public abstract void removeCourse();
   
   
   /*
    * Triggered when a user selects a course in the 'Courses Added' section of
    * the view. This will then fill all the fields of the 'Course Information'
    * section of the view with the course information.
    */
   public abstract void viewInfo();
   
   /*
    * Triggered when a user clicks the "Commit" button on the 'Course
    * Information' section of the view. This will create a new Course object,
    * add it to the Collection of Courses, and display it in the 'Courses
    * Added' section.
    */
   public abstract void commitInfo();
   
   
   /*
    * Triggered when a user clicks the "Restore" button on the 'Course
    * Information' section of the view. This will clear all of the info already
    * entered into the 'Course Information' section.
    */
   public abstract void restoreInfo();
	
	/*
	 * This is triggered when a user clicks the column heading. 
	 * For example, if the user clicks the column "course name," then
	 * the list of courses becomes sorted by course name.
	 */
	//public abstract void sortColumn();
	
	public abstract Collection<Course> getCourses();
	
}