/*Created by Acrafts 10/20*/
package KCSched;

import java.util.*;
public abstract class Course {
   int id;
	String DepartmentName;
	String ClassNum;
	Collection<String> PreReqs;
	Collection<String> ConCurrent;
	Collection<ClassRoomTools> NecessaryTools;
	int NumUnits;
	boolean IsLab;
	boolean IsLecture;
	boolean isCurrent;

	

}
