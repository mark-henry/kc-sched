/*
 * KCRoomTab.java
 * Author: Bradley Zeller
 * Date: 10-20-11
 *
 * This class is what is viewed when the main "Data" tab is selected from the top menu,
 * and then the "Rooms" tab is selected from the left.  This is only viewed by an
 * admin, instructors do not have access to this view.
 *
 */

import java.util.*;
public abstract class KCRoomsTab {
	Collection<KCRoom> roomList;
	
	/*
	 * Triggered when a user clicks the "+" button.
	 * This will pop up a dialogue box that will ask the user
	 * for all the room information.  It will then 
	 * add the room to the database. 
	 */
	public abstract void addRoom();
	
	/*
	 * This is triggered when a user clicks the column heading. 
	 * For example, if the user clicks the column "building," then
	 * the list of rooms becomes sorted by building.
	 */
	public abstract void sortColumn();
	
	public abstract Collection<KCRoom> getInstructors();
	
}