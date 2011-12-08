package KCSched;

import java.util.Collection;

public abstract class InstructorWelcomeUI {

    /**
     * Commits the edited preferences to the database
     * @param instructor  The Instructor to modify in the database
     * @param preferences The updated Preferences to apply to the Instructor
     */
    /*@
         requires instructor != null && preferences != null;
    @*/ 
    public abstract void editPreferences(Instructor instructor, Collection<Preference> preferences);

    /**
     * Retrieves the latest schedule from the database
     * @return The most recently published schedule
     */
    public abstract Schedule viewSchedule();
}
