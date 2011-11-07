/*Created by Acrafts 10/20*/
import java.util.*;
public abstract class KCGenerateSchedule {
	
	/*Created by Acrafts 10/20*/
	/* generates a schedule based on the inputted instructors, rooms, courses,
	preferences, and conflict resoultion settings */
	public abstract void KCSchedule_Generate(Collection<KCInstructor> Instructors,
										Collection<KCRoom> Rooms,
										Collection<KCCourse> Courses,
										Collection<KCRule> Preferences);
	/*Created by Acrafts 10/20*/
	/* verifies validity of schedule. May be called in Generate function, or in
	the edit schedule tab as well */
	public abstract boolean IsScheduleValid(KCSchedule Schedule);
	/* Added by cgaydosh 11/6 */
	public abstract void DisplayConflict(KCConflict Conflict);
	public abstract void DismissConflict(Collection<KCConflict> ConflictList, 
	                                     KCConflict Conflict);
   public abstract void ResolveConflictLater(Collection<KCConflict> ConflictList,
                                             KCConflict Conflict);

	/*Created by Acrafts 10/20*/
	public abstract class KCComponents{
		/*data fields for schedule generation*/
		Collection<KCInstructor> Instructors;
		Collection<KCRoom> Rooms;
		Collection<KCCourse> Courses;
		/*will be called in default constructor, will import all of the type that
		are marked as "active" or "current"*/
		public abstract int ImportAllCurrentType(Object Type);
		public abstract int ImportSelected(Object Type);
		/* added by cgaydosh 11/6 */
		public abstract int RemoveObjectFromList(Object Type); //when user clicks minus button
	}
	/*removed KCConflict class 11/6/11 by acrafts*/
	/* added KCConflict class 11/6/11 by cgaydosh */
	public abstract class KCConflict {
      Collection<KCRule> Violated;
	}
	
	/*Created by Acrafts 10/20*/
	public abstract class KCPreferences{
		/* preferences to be considered while generating schedules*/
		Collection<KCRule> Preferences;
		/* added by cgaydosh 11/6 */
		public abstract int UpdatePreference(KCRule Pref);
	
	}
	
	

}

