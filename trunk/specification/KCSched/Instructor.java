/*
 * Instructor.java
 * Author: Bradley Zeller
 * Date: 12-4-11
 */

package KCSched;

import java.util.*;

/**
 * Instructor represents a single instructor in the program.
 */
public abstract class Instructor {
   
   /** Unique id to identify instructor */
   private int id;
   /** Instructor's first name */
	private String firstName;
   /** Instructor's last name */
   private String lastName;
   /** Instructor's phone number */
   private String phoneNumber;
   /** Instructor's office number */
   private String office;
   /** Instructor's department */
   private String department;
   /** Instructor's email address */
   private String email;
   /** Instructor's WTUs */
   private int WTUs;
   /** List of instructor's preferences */
   List<Preference> preferences;
   
	
   /** Updates the instructor's WTU's.
    *
    * @param newWTUs The new amount of WTUs this instructor has.
    */
   
   /*@ requires newWTUs >= 0;
    @    
    @  ensures WTUs == newWTUs;
    @*/
   public abstract void changeWTUs(int newWTUs);
   
   /** Get all of the instructor's preferences.
    *
    * @return List of preferences, ordered by their id.  Or null if the instructor does not have any preferences.
    */
   
   /*@ ensures
    @       (\forall int i;
    @          0 < i && i < \result.size();
    @          \result.get(i-1).getPrefID() <= \result.get(i).getPrefID());
    @*/
   public abstract List<Preference> getPreferences();
   
   /** Add a new preference to the instructor.
    *
    * @param newPref The new preference to add.
    */
   
   /*@ requires newPref != null
    @   &&
    @    (\forall int i; 0 < i && i < preferences.size();
    @       preferences.get(i-1).doesNotConflictWith(preferences.get(i)));
    @    
    @  ensures \old(preferences.size()) == preferences.size() - 1;
    @*/
   public abstract void addPreference(Preference newPref);
   
   /** Removes the preference specified by the preference id.
    *
    * @param prefID The preference ID of the preference to be removed.
    * @return The removed preference.  Or null if none was found with the specified id.
    */
   
   /*@ requires prefID >= 0;
    @    
    @*/
   public abstract Preference removePreference(int prefID);
   
   /** Public getter method to retrieve ID member of the instructor.
    *
    * @return The instructor's id.
    */
   public abstract int getID();
}