/*
 * Preference.java
 * Author: Bradley Zeller
 * Date: 12-4-11
 */

package KCSched;

import java.util.*;

/**
 * Preference represents a single Instructor preference.
 */
public abstract class Preference {
   
   /**  Provides three common types that a preference can be:  A time preference
    (prefer to teach from 10 - 12), a course preference (prefer to teach cpe 101)
    and a day preference (prefer to teach Mondays and Tuesdays)*/
   public enum PreferenceType {
      TIME, PREF_COURSE, DAY
   }
   
   
   /** Unique preference id */
	private int prefID;
   /** Type of preference, used to determine how to parse description*/
   private PreferenceType prefType;
   /** Formatted description of the preference.  Its value is determined by the type.*/
   private String prefDesc;
   
   /** isSatisfied looks at the generated schedule and checks to see if the preference was met or not.
    *
    * @param sched The generated schedule of interest to check preference against.
    * @return True if the specified schedule satisfies this preference.  False otherwise.
    */
   /*@ requires sched != null;
    @
    @*/
   public abstract boolean isSatisfied(Schedule sched);
   
   
   /** doesNotConflictWith checkes to see if two preferences conflict.  This is mainly used to make sure that when adding preferences, they aren't conflicting with otheres.
    *
    * @param other The other preference in which to compare against.
    * @return True if there is no confliction.  False otherwise.
    */
   /*@ requires other != null;
    @    
    @  ensures 
    @    !other.getPrefDesc().equals(this.prefDesc);
    @*/
   public abstract boolean doesNotConflictWith(Preference other);
   
   
   /** Getter method to private prefID member.
    *
    * @return The preference id.
    */
   public abstract int getPrefID();
   
   /** Getter method to private prefDesc member.
    *
    * @return The preference description.
    */
   public abstract String getPrefDesc();
   
}