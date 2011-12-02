package KCSched;

import java.util.*;


/**
 * Export is where the user can create a file that is in a 
 * user specified format.
 */
public abstract class Export {

   /**
    * Create a file in the format of html that conforms to the Peoplesoft standards.
    * @param schedule a generated schedule.
    * @param directory string that contains the directory that the file is put into.
    */
   /*@ requires (* must be a valid schedule *)
     @ ensures (* must be a valid html file in the format that 
     @ peopleSoft expects *)
     @*/ 
   // exports to peopleSoft
   public abstract void exportToPeopleSoft(Schedule schedule, String directory);
   
   /**
    * Create a file in the format of html that conforms to the Peoplesoft standards.
    * @param schedule a generated schedule.
    * @param directory string that contains the directory that the file is put into.
    */
   /*@ requires (* must be a valid schedule *)
     @ ensures (* must be a valid Excel file (.xls) in the format that 
     @ peopleSoft expects *)
     @*/ 
   // creates an excel file of the schedule
   public abstract void exportToExcel(Schedule schedule, String directory);
   
   /**
    * Create a file in the format of html that conforms to the Peoplesoft standards.
    * @param schedule a generated schedule.
    * @param directory string that contains the directory that the file is put into.
    */
   /*@ requires (* must be a valid schedule *)
     @ ensures (* must be a valid PDF file in the format that 
     @ peopleSoft expects *)
     @*/ 
   // creates a PDF of the schedule
   public abstract void exportToPDF(Schedule schedule, String directory);
   
}
