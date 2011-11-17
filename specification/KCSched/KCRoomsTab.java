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
package KCSched;

import java.util.*;
public abstract class RoomsTab {
	Collection<KCRoom> roomList;
	
	/*
	 * Triggered when a user clicks the "+" button.
	 * This will pop up a dialogue box that will ask the user
	 * for all the room information.  It will then 
	 * add the room to the database. 
	 */
	public abstract void addRoom(Room room);

	/*
	 * Triggered when a user clicks the "-" button.
	 * This will pop up a dialogue box that will ask the user
	 * to confirm that they want to completely remove this entry.
	 */
	public abstract void deleteRoom(Room room);
	
	/*
	 * Triggered when a user clicks the "edit" button.
	 * This will fill all the fields with the current information
	 * for the selected room so that the database may be edited.
	 */
	public abstract void editRoom(Room room);
	
	/*
	 * This is triggered when a user clicks the column heading. 
	 * For example, if the user clicks the column "building," then
	 * the list of rooms becomes sorted by building.
	 */
	public abstract void sortColumn();
	
	public abstract Collection<Room> getRooms();
	
}