/*
 * KCEditTab.java
 * Author: Mark Henry
 * Date: 10-20-2011
 * 
 * This class represents what is seen when the 'Edit' tab is selected.
 */
package KCSched;

import java.util.*;
public abstract class EditTab {
	Collection<Section> sections;
	
	// Add/remove a section to/from the document
	public abstract void addSection();
	public abstract void deleteSection();
	
	// Pins a Section to prevent auto-scheduling
	public abstract void pinSection();
	public abstract void unpinSection();
	
	// Get/set a Section's properties
	public abstract void readSection();
	public abstract void modifySection();
}
