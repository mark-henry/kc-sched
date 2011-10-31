/*Created by Acrafts 10/20*/
import java.util.*;
public abstract class KCGenerateScheduleUI {
	
	/* generates a schedule based on the inputted instructors, rooms, courses,
	preferences, and conflict resoultion settings */
	public abstract KCSchedule Generate(Collection<KCInstructor> instructors,
										Collection<KCRoom> rooms,
										Collection<KCCourse> courses,
										Collection<KCRule> conflicts,
										Collection<KCRule> preferences);

	/* verifies validity of schedule. May be called in Generate function, or in
	the edit schedule tab as well */
	public abstract boolean IsScheduleValid(KCSchedule schedule);


	public abstract class KCComponents{
		/*data fields for schedule generation*/
		Collection<KCInstructor> instructors;
		Collection<KCRoom> rooms;
		Collection<KCCourse> courses;
		/*will be called in default constructor, will import all of the type that
		are marked as "active" or "current"*/
		public abstract int ImportAllCurrentType(Object Type);
	}
	
	public abstract class KCPreferences{
		/* preferences to be considered while generating schedules*/
		Collection<KCRule> preferences;
		/* verifies the program understands the rule as written by user*/
		public abstract boolean IsRuleValid(KCRule rule);
	}
	
	public abstract class KCConflicts{
		/* Settings to be followed when a conflict is being resolved by generation*/
		Collection<KCRule> conflicts;
		/* Verifies the program understands the rule as written by user */
		public abstract boolean IsRuleValid(KCRule conflict);
			/* deals with conflicting sections as defined in conflict settings*/ 
		public abstract int DisplayConflict(Collection<KCSection> sections,Collection<KCRule> conflicts);
	}
	

}

