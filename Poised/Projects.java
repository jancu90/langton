import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;

 public class Projects {
		 // Attributes
		   long project_num;
		   String name;
		   String buid_type;
		   String address;
		   String erf;
		   double total;
		   double paid;
		   String customer;
		   String deadline;
		   String architecture;
		   String contractor;
		   		
			   
		   public static long getproject_num(){
			   System.out.println("PROJECT DETAILS");
		       System.out.print("Enter a Project Number:");
			   Scanner pn = new Scanner(System.in);
			   long local_pn = pn.nextLong();
			   //pn.close();
			   return local_pn;
			  
		   }
		   		
		   public static String getname(){
		       System.out.print("Enter Project name:");
			   Scanner n = new Scanner(System.in);
			   String local_name = n.nextLine();
			   //n.close();
			   return local_name.toLowerCase();
			   }
		   
		   public static String getbuid_type(){
			   System.out.print("Enter a Building Type:");
			   Scanner b = new Scanner(System.in);
			   String local_buid_type = b.nextLine();
			   //b.close();
			   return local_buid_type.toLowerCase();
		   }
		   
		   public static String getaddress(){
		       System.out.print("Enter address of the Project:");
			   Scanner a = new Scanner(System.in);
			   String local_address = a.nextLine();
			   //a.close();
			   return local_address.toLowerCase();
		   }
		   
		   public static String geterf(){
			   System.out.print("Enter the ERF number:");
			   Scanner e = new Scanner(System.in);
			   String local_erf = e.nextLine();
			   //e.close();
			   return local_erf;
		   }
		   
		   public static double gettotal(){
		       System.out.print("Enter the Total Amount of the Project:");
			   Scanner t = new Scanner(System.in);
			   double local_total = t.nextDouble();
			   //t.close();
			   return local_total;
		   }
		   
		   public static double getpaid(){
		       System.out.print("Enter the Amount Paid:");
			   Scanner pa = new Scanner(System.in);
			   double local_paid = pa.nextDouble();
			   //pa.close();
			   return local_paid;
		   }
		   
		   public static String getcustomer(){
		       System.out.print("Enter a Customer name:");
			   Scanner c = new Scanner(System.in);
			   String local_customer = c.nextLine();
			   //c.close();
			   return local_customer.toLowerCase();
		   }
		   
		   public static String getdeadline() {
		       System.out.println("Enter the Dead Line Date: ");
		       System.out.print(" Follow the Format -  ddMMyy  " );
			   Scanner d = new Scanner(System.in);
			   String local_deadline = d.nextLine();
			   return local_deadline;
			   //d.close();
			   }
		   
		   public static String getarchitecture(){
		       System.out.print("Enter the name of the Architecture:");
			   Scanner a = new Scanner(System.in);
			   String local_arch = a.nextLine();
			   //a.close();
			   return local_arch.toLowerCase();
		   }
		   
		   public static String getcontractor(){
		       System.out.print("Enter the name of the Contractor:");
			   Scanner c = new Scanner(System.in);
			   String local_contractor = c.nextLine();
			   //c.close();
			   return local_contractor.toLowerCase();
		   }
		      
		   		   
}
    
	   
