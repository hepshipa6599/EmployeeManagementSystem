package pojopkg;
import java.util.Scanner;
import pojopkg.Emp;
import emp.Employee;
public class MainEmployee {
	    static Employee obj =new Employee();
	public static void main(String args[])
    {
	 int choice;
    Scanner sc=new Scanner(System.in);
        System.out.println("*****************************");
     	System.out.println("Payroll Management System");
     	System.out.println("*****************************");
     	System.out.println("****");
     	System.out.println("Menu");
     	System.out.println("****");
      	System.out.println("1.Add Employee");
      	System.out.println("2.View Single Employee");
      	System.out.println("3.View Employees ");
      	System.out.println("4.Add Salary ");
        System.out.println("5.Calculate Salary");
        System.out.println("6.Leave Balance ");
        System.out.println("7.View Designation");
        System.out.println("Exit loop");
        System.out.println("*****************************");
         int n=1;
    do {
   System.out.println("Enter your  choice");
         choice=sc.nextInt();
 switch(choice)
 {
     case 1:
    	 
    	    obj.addemp();
            break;
      case 2:
     	 
              break;
      case 3:
    	  
    		 break;
      case 4:
     
              break;
      case 5:
     	
              break;
      case 6:
     
             break;
     case 7:
     	      break;
     case 8:n=2;
     System.out.println("Exit loop");
      	 break;
     default:
    	 System.out.println("default switch");
}
}while(n==1);
n=sc.nextInt();
 }
}




