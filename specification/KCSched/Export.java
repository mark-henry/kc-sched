package KCSched;

import java.util.*;
public abstract class Export {


   /*@ requires (* must be a valid schedule *)
     @ ensures (* must be a valid html file in the format that 
     @ peopleSoft expects *)
     @*/ 
   // exports to peopleSoft
   public abstract void exportToPeopleSoft(Schedule schedule);
   
   /*@ requires (* must be a valid schedule *)
     @ ensures (* must be a valid Excel file (.xls) in the format that 
     @ peopleSoft expects *)
     @*/ 
   // creates an excel file of the schedule
   public abstract void exportToExcel(Schedule schedule);
   
   /*@ requires (* must be a valid schedule *)
     @ ensures (* must be a valid PDF file in the format that 
     @ peopleSoft expects *)
     @*/ 
   // creates a PDF of the schedule
   public abstract void exportToPDF(Schedule schedule);
   
}
