/*Created by Acrafts 10/20*/
import java.util.*;
public abstract class KCCourse {
	String DepartmentName;
	String ClassNum;
	Collection<String> PreReqs;
	Collection<String> ConCurrent;
	Collection<KCClassRoomTools> NecessaryTools;
	int NumUnitsLecture;
	int NumUnitsLab;
	
	//Added by Acrafts 10/31
	boolean IsLab;
	boolean IsLecture;
	int NumUnits;
	

}
