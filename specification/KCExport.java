import java.util.*;
public abstract class KCExport {

   // exports to peopleSoft
   public abstract void exportToPeopleSoft(KCSchedule schedule);
   
   // creates an excel file of the schedule
   public abstract void exportToExcel(KCSchedule schedule);
   
   // creates a PDF of the schedule
   public abstract void exportToPDF(KCSchedule schedule);
   
   // change directories that file is exporting to.
   public abstract void changeDirecttory();
   
   
   

}
