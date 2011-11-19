package KCSched;

import java.util.*;
public abstract class Export {

   // exports to peopleSoft
   public abstract void exportToPeopleSoft(Schedule schedule);
   
   // creates an excel file of the schedule
   public abstract void exportToExcel(Schedule schedule);
   
   // creates a PDF of the schedule
   public abstract void exportToPDF(Schedule schedule);
   
   // change directories that file is exporting to.
   public abstract void changeDirecttory();
   
   
   

}
