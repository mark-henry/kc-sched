package KCSched;

import java.util.*;


/**
 * Export is where the user can create a file that is in a 
 * user specified format.
 */
public abstract class Export {

   /**
    * Create a file in the Key Cow format.
    * @param schedule a generated schedule.
    * @param directory string that contains the directory that the file is put into.
    * @return 0 if successful or an error code if there was an error
    */
  /*@
      requires ((dir != null) && (sched != null));
   @*/
  public abstract int exportTo(Schedule sched, String dir);
   
}
