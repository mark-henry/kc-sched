/*
 * KCEditTab.java
 * Author: Mark Henry
 * Date: 10-20-2011
 * 
 * This class represents what is seen when the 'Edit' tab is selected.
 */

import java.util.*;
public abstract class KCEditTab {
	Collection<KCSection> sections;
	
	// Adds a section to the grid
	public abstract void addSection();
	
	// Pins a Section to prevent auto-scheduling
	public abstract void pinSection();
	
	// Moves a section from one time to another
	public abstract void moveSection();
	
	// Opens a section for editing
	public abstract void editSection();
	
	// Displays/hides rollover info pane for a section
	public abstract void displayRollover();
	public abstract void hideRollover();
	
	// View controls
	public abstract void zoomInVertical();
	public abstract void zoomOutVertical();
	public abstract void zoomInHorizontal();
	public abstract void zoomOutHorizontal();
	public abstract void scrollDown();
	public abstract void scrollUp();
	public abstract void scrollLeft();
	public abstract void scrollRight();
}
