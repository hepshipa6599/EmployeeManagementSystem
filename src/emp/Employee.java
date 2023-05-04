package emp;
import pojopkg.Emp;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;

	 interface employee {
		void addemp();
		void viewemp();

	}
	public class Employee implements employee{
		static List<Emp> list =new ArrayList<Emp>();
		
		public void addemp()
		{
			System.out.println("Enter a Employee Id:");
			 Scanner scan=new Scanner(System.in);
			 int eid=scan.nextInt();
			 System.out.println("Enter a Employee Name:");
			 String ename =scan.next();
			 System.out.println("Enter a Employee Age:");
			 int age =scan.nextInt();
			 System.out.println("Enter a Employee Qualification:");
			 String qual =scan.next();
			 System.out.println("Enter a Employee Destination:");
			 String dest =scan.next();
			 System.out.println("Enter a Employee DOB:");
			 String dob =scan.next();
			 System.out.println("Enter a Employee Salary:");
			 int sal =scan.nextInt();
			 System.out.println("Enter a Employee LeaveCount:");
			 int leavecount =scan.nextInt();
			 System.out.println("Enter a Employee Experience:");
			 int exp =scan.nextInt();
			 list.add(new Emp(eid,ename,age,qual,dest,dob,sal,leavecount,exp));
			 System.out.println(list);
			 System.out.println("Employee Details Add Sucessfully");
		}
	public 	void viewemp() {
			System.out.println("\n View All Employees:");
	        for (Emp e :list)
	        {
	            System.out.println(e);
	        }
		}
	}


