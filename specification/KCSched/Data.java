/*
 * Data.java
 * Author: Bradley Zeller
 * Date: 12-4-11
 */

package KCSched;

import java.util.*;

/**
 * Data holds references to collections of the three types of "data":
 * Instructors, Rooms, and Courses.  There is only one of these in the
 * entire program.
 */
public abstract class Data {
	
   /** Collection of the permanent copies of all instructors*/
   private List<Instructor> instructors;
   /** Collection of the permanent copies of all courses*/
   private List<Course> courses;
   /** Collection of the permanent copies of all rooms*/
   private List<Room> rooms;
	
   /** Add an instructor to the database.
    *
    * @param newInstruct The new instructor to add.
    */
   
   /*@ requires newInstruct != null
    @    &&
    @       //requires that all instructors are unique
    @       (\forall int i; 0 < i && i < instructors.size();
    @          instructors.get(i).getID() != newInstruct.getID());
    @    
    @  ensures \old(instructors.size()) == instructors.size() - 1;
    @*/
	public abstract void addInstructor(Instructor newInstruct);
   
   
   /** Add a course to the database.
    *
    * @param newCourse The new course to add.
    */
   
   /*@ requires newCourse != null
    @    &&
    @       //requires that all courses are unique
    @       (\forall int i; 0 < i && i < courses.size();
    @          courses.get(i).id != newCourse.id);
    @    
    @  ensures \old(courses.size()) == courses.size() - 1;
    @*/
   public abstract void addCourse(Course newCourse);
   
   
   /** Add a room to the database.
    *
    * @param newRoom The new room to add.
    */
   /*@ requires newRoom != null
    @    &&
    @       //requires that all rooms are unique
    @       (\forall int i; 0 < i && i < rooms.size();
    @          rooms.get(i).id != newRoom.id);
    @    
    @  ensures \old(rooms.size()) == rooms.size() - 1;
    @*/
   public abstract void addRoom(Room newRoom);
   
   
	/** Remove an instructor from the database.
    *
    * @param id The id of the instructor to remove.
    * @return The removed instructor.  Or null if there was no instructor with that id.
    */
   /*@ requires id >= 0;
    @    
    @*/
   public abstract Instructor removeInstructor(int id);
   
   
   /** Remove a course from the database.
    *
    * @param id The id of the course to remove.
    * @return The removed course.  Or null if there was no course with that id.
    */
   
   /*@ requires id >= 0;
    @    
    @*/
   public abstract Course removeCourse(int id);
   
   
   /** Remove a room from the database.
    *
    * @param id The id of the room to remove.
    * @return The removed room.  Or null if there was no room with that id.
    */
   /*@ requires id >= 0;
    @    
    @*/
   public abstract void removeRoom(int id);
   
   
   /** Get an instructor from the database, with the specified id.
    *
    * @param id The id of the desired instructor.
    * @return The instructor with specified id.  Or null, if none was found.
    */
   public abstract Instructor getInstructor(int id);
   
   
   /** Get a list of all instructors from database.
    *
    * @return A List of all instructors in the database, sorted by ID.
    */
   /*@ ensures 
    @       //ensures that returned list is sorted in ascending order.
    @       (\forall int i;
    @          0 < i && i < \result.size();
    @          \result.get(i-1).getID() <= \result.get(i).getID());
    @    
    @*/
   public abstract List<Instructor> getAllInstructors();
   
   
   /** Get a room from the database.
    *
    * @param id The id of the desired room.
    * @return The room specified by id.  Or null, if none was found.
    */
   public abstract Room getRoom(int id);
   
   
   /** Get a list of all rooms from database.
    *
    * @return A list of all rooms in the database, sorted by ID.
    */
   public abstract List<Room> getAllRooms();
   
   
   /** Get a course from the database.
    *
    * @param id The id of the desired course.
    * @return The course with the specified id.  Or null, if none was found.
    */
   public abstract Course getCourse(int id);
   
   
   /** Get a list of all courses from database.
    *
    * @return A list of all courses in the database, sorted by ID.
    */
   public abstract List<Course> getAllCourses();
   
   
}