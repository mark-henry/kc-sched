import java.util.*;

public abstract class KCInstructorPreferencesUI {

    /* Setups the user interface and calls helper methods to populate preference
     * fields and load any interface settings */
    public abstract void setupUI();

    /* Called by SetupUI()
     * Fills out fields with the instructors current preferences */
    public abstract void getPreferences(KCInstructor instuctor);

    /* Called by SetupUI()
    /* Populates the list of items the instructor can request for their room */
    public abstract Collection<KCRoomItem> getRoomItems();

    /* Returns to the login screen for another user to login */
    public abstract void logout();

    /* Called by logout()
     * Updates the database with the modified preferences */
    public abstract void savePreferences(KCInstructor instructor);
}
