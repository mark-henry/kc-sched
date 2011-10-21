import java.util.*;
public abstract class KCEditScheduleUI {
	public abstract class KCComponents{
	Collection<KCInstructor> instructors;
	Collection<KCRoom> rooms;
	Collection<KCCourse> courses;
	}
	
	public abstract class KCPreferences{
	Collection<KCRule> rules;
	}
	
	public abstract class KCConflicts{
	Collection<KCRule> conflicts;
	}
	
	public abstract class KCGenerate{

	}
	
}

