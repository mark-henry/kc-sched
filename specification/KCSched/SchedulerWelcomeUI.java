package KCSched;

import java.util.*;

public abstract class SchedulerWelcomeUI {

    /** 
     * Constructs the initial DataTab object from the database 
     * @return An DataTab object containing all scheduling data (instructors, rooms, and courses)
     */
    public abstract DataTab loadData();

    /**
     * Constructs a Schedule Generater from the scheduling data
     * @param data The scheduling data to be used for generation
     * @return The Schedule Generator
     */
    public abstract GenerateSchedule loadGenerate(DataTab data);

    public abstract Schedule loadEdit();

    public abstract Export loadPublish();
}
