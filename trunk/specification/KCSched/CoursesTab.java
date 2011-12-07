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
	
   
   /**
    * The collection of all the courses already added
    */
   private /*@ spec_public @*/ Collection<Course> coursesList;
   
   
   /**
    * A Course holds all the information about a course
    */
   private /*@ spec_public @*/ Course newCourse;
	
   
	/**
	 * Triggered when a user clicks the "+" button on the 'Courses Added'
    * section of the view. This will then bring up a clear 'Course Information'
    * section in which you can enter course info into.
	 */
   
   //@ ensures coursesList.size() == \old(coursesList.size()) + 1;
	public abstract void addCourse();
   
   
   /**
    * Triggered when a user clicks the "-" button on the 'Courses Added'
    * section of the view. This will then remove the highlighted course in 
    * 'Courses Added'.
    */
   
   //@ requires coursesList.size() > 0;
   //@ ensures coursesList.size() == \old(coursesList.size()) - 1;
   public abstract void removeCourse();
   
   
   /**
    * Triggered when a user selects a course in the 'Courses Added' section of
    * the view. This will then fill all the fields of the 'Course Information'
    * section of the view with the course information.
    */
   
   //@ requires coursesList.size() > 0;
   public abstract void viewInfo();
   
   
   /**
    * Triggered when a user clicks the "Commit" button on the 'Course
    * Information' section of the view. This will create a new Course object,
    * add it to the Collection of Courses, and display it in the 'Courses
    * Added' section.
    */
   
   //@ ensures coursesList.size() == \old(coursesList.size()) + 1; 
   public abstract void commitInfo();
   
   
   /**
    * Triggered when a user clicks the "Restore" button on the 'Course
    * Information' section of the view. This will clear all of the info already
    * entered into the 'Course Information' section.
    */
   
   public abstract void restoreInfo();
	
	
	/**
    * Helper method used to get the collection of courses that have already
    * been added.
    */
   
   //@ requires coursesList.size() > 0;
	public abstract Collection<Course> getCourses();
	
}