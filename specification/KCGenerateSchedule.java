/*Created by Acrafts 10/20*/
import java.util.*;
public abstract class KCGenerateSchedule {
	
	/* generates a schedule based on the inputted instructors, rooms, courses,
	preferences, and conflict resoultion settings */
	public abstract KCSchedule Generate(Collection<KCInstructor> Instructors,
										Collection<KCRoom> Rooms,
										Collection<KCCourse> Courses,
										Collection<KCRule> Preferences);

	/* verifies validity of schedule. May be called in Generate function, or in
	the edit schedule tab as well */
	public abstract boolean IsScheduleValid(KCSchedule schedule);


	public abstract class KCComponents{
		/*data fields for schedule generation*/
		Collection<KCInstructor> Instructors;
		Collection<KCRoom> Rooms;
		Collection<KCCourse> Courses;
		/*will be called in default constructor, will import all of the type that
		are marked as "active" or "current"*/
		public abstract int ImportAllCurrentType(Object Type);
		public abstract int ImportSelected(Object Type);
	}
	/*removed KCConflict class 11/6/11 by acrafts*/
	
	public abstract class KCPreferences{
		/* preferences to be considered while generating schedules*/
		Collection<KCRule> Preferences;
	
	}
	
	

}

