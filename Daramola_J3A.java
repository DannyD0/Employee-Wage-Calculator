// Student Info - Java 3A
// Daniel Daramola - F24

import javax.swing.JOptionPane ;

public class Daramola_J3A
{
   public static void main(String [] args)
   {
      //Declare
      String empNo ;
      double sales ;
      double salary ;
      double comm ;
      double comp ;
      char moreEmp ;
      double totSales ;
      double totComp ;
      double totSal ;
      double totComm ;
      
      totSales = 0 ; 
      totComp = 0 ; 
      totSal = 0 ;
      totComm = 0 ;

      
      
      
      do
      {
      empNo = JOptionPane.showInputDialog("Enter Employee Number :") ;
      sales = Double.parseDouble(JOptionPane.showInputDialog("Enter Sales :")) ;
      salary = Double.parseDouble(JOptionPane.showInputDialog("Enter Salary :")) ;
      
      comm = sales * 0.03 ;
      comp = salary + comm ;
      
      System.out.printf("EE #          Sales         Salary         Commission       Compensation\n") ;
      System.out.printf("%s   $%,12.2f   $%,12.2f   $%,12.2f   $%,12.2f\n",
                    empNo, sales, salary, comm, comp) ;
        
                    
      totSales += sales ;
      totSal += salary ;
      totComm += comm ;
      
                    
      moreEmp = JOptionPane.showInputDialog("Enter More Employees? (Y or N)").charAt(0) ;

      }while (moreEmp == 'Y') ;
      
      totComp = totSal + totComm ;
      
      
      System.out.println("\nSummary") ;
      System.out.printf("Total Sales:         $%,15.2f\n", totSal) ;
      System.out.printf("Total Compensation:  $%,15.2f\n", totComp) ;
      System.out.printf("Total Salary:        $%,15.2f\n", totSal) ;
      System.out.printf("Total Commission:    $%,15.2f\n", totComm) ;      
      
      System.exit(0);
      
      
      
     
      
   }
            
      

}