package KCSched;

import java.util.*;

public abstract class Room {
   int id;
	int buildingNumber;
	int roomNumber;
    int capacity;
    boolean lab;
    int stations;
	Collection<KCSched.ClassRoomTools> ToolsInRoom;
	boolean isCurrent;
}
