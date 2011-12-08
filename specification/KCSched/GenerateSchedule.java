/*Created by Acrafts 10/20*/
package KCSched;

import java.util.*;
public abstract class GenerateSchedule {
	
	/*Created by Acrafts 10/20*/
	/* generates a schedule based on the inputted instructors, rooms, courses,
	preferences, and conflict resoultion settings */
	
	/*@
	requires 	instructors !=  null && instructors.size() > 0 &&
				rooms !=  null && rooms.size() > 0 &&
				courses !=  null && courses.size() > 0;
	ensures  IsScheduleValid(\result);
	@*/
	public abstract Schedule Schedule_Generate(Collection<Instructor> instructors,
										Collection<Room> rooms,
										Collection<Course> courses,
										Collection<Rule> preferences);
	
	
	
	/*Created by Acrafts 10/20*/
	/* verifies validity of schedule. May be called in Generate function, or in
	the edit schedule tab as well */
	/*@
	requires schedule.sections.size() > 1 ;
	
	ensures 
	(\forall Section sec_other; 
		(sec_other.time.equals(sec_other.time)) && !(sec_other.room.equals(sec_other.room))&& 
		(sec_other.time.equals(sec_other.time)) && !(sec_other.room.equals(sec_other.instructor));
		\result == true) 
		&&
	(\forall Section sec_other; 
		(sec_other.time.equals(sec_other.time)) && (sec_other.room.equals(sec_other.room)) ||
		(sec_other.time.equals(sec_other.time)) && (sec_other.room.equals(sec_other.instructor));
		\result == false)
		;
	@*/
	public abstract boolean IsScheduleValid(Schedule schedule);


	/* Added by cgaydosh 11/6 */
	public abstract void DisplayConflict(Conflict conflict);

	/*Created by Acrafts 10/20*/
	public abstract class Components{
		/*data fields for schedule generation*/
		Collection<Instructor> Instructors;
		Collection<Room> Rooms;
		Collection<Course> Courses;
		
		/*@
		ensures \forall Instructor instructor; instructor.isCurrent == true; Instructors.contains(instructor);
		@*/
		public abstract int ImportAllCurrentInstructors();
		
		/*@
		ensures \forall Room room; room.isCurrent == true; Rooms.contains(room);
		@*/
		public abstract int ImportAllCurrentRooms();
		
		/*@
		ensures \forall Course course; course.isCurrent == true; Courses.contains(course);
		@*/
		public abstract int ImportAllCurrentCourses();
		
		/*will be called in default constructor, will import all of the type that
		are marked as "active" or "current"*/
		public abstract int ImportAllCurrentType(Object Type);
		public abstract int ImportSelected(Object Type);
		/* added by cgaydosh 11/6 */
		public abstract int RemoveObjectFromList(Object Type); //when user clicks minus button
	}
	
	/** 
	 * Conflict is the container for 
	 *
	 */
	 
	/*removed KCConflict class 11/6/11 by acrafts*/
	/* added KCConflict class 11/6/11 by cgaydosh */
	public abstract class Conflict {
	   /** List of preferences that were violated */
      Collection<Rule> Violated;
      
      /**
       * Adds a rule to the violated rule list.
       * @param Pref a rule that is to be added to the list.
       */
       
      /*@ requires !(\exists Rule Pref; Violated.contains(Pref));
        @ ensures (\exists Rule Pref; Violated.contains(Pref);)
        @*/
      public abstract void addViolation(Rule Pref);
	}
	
	/**
    * Class Preferences is the container for all the instructor and schedule generation preferences.
    * 
    */
	/*Created by Acrafts 10/20*/
	public abstract class Preferences{
	
		/** preferences to be considered while generating schedules*/
		Collection<Rule> Preferences;
		
	   /**
       * Adds a rule to the violated rule list.
       * @param Pref a rule that is to be added to the preferences to be considered list.
       * @return if there was an error the error code 0 otherwise
       */
		/* added by cgaydosh 11/6 */
		/*@ requires !(\exists Rule Pref; Preferences.contains(Pref));
        @ ensures (\exists Rule Pref; Preferences.contains(Pref);)
        @*/ 
		public abstract int UpdatePreference(Rule Pref);
	
	}
	
	

}

