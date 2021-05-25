import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;


public class MultiClassExpl {
	
	 
		 //Attributes Projects class
		 static long project_num=Projects.getproject_num();
		 static String name=Projects.getname();
		 static String buid_type=Projects.getbuid_type();
		 static String address=Projects.getaddress();
		 static String erf=Projects.geterf();
		 static double total=Projects.gettotal();
		 static double paid=Projects.getpaid();
		 static String customer=Projects.getcustomer();
		 static String deadline=Projects.getdeadline();
		 static String architecture=Projects.getarchitecture();
		 static String contractor=Projects.getcontractor();
		 		 
		 //Attributes person class		
		 static String pers_name =  Person.getpersname();
		 static String telephone_num = Person.getperstel(); 
		 static String email_addr = Person.getpersemail();
		 static String physical_addr = Person.getpersaddr();
		 static String title = Person.getperstitle();
		//Attributes contractor class		  
		 static String contr_name =  Person.getcontracname();
		 static String telecontr_num = Person.getcontractel(); 
		 static String emailcontr_addr = Person.getcontracemail();
		 static String physicalcontr_addr = Person.getcontracaddr();
		 static String titlecontr = Person.getcontractitle();
		//Attributes architecture class
		 static String arch_name =  Person.getarchname();
		 static String telearch_num = Person.getarchtel(); 
		 static String emailarch_addr = Person.getarchsemail();
		 static String physicalarch_addr = Person.getarchaddr();
		 static String titlearch = Person.getarchtitle();
		 
		 		 
		 //constructor
		 public MultiClassExpl(long project_num, String name, String buid_type, String address, String erf, double total, double paid, String customer, String deadline, String architecture, String contractor) {
			  project_num = project_num;
			  name = name;
			  buid_type = buid_type;
			  address  = address;
			  erf = erf;
			  total = total;
			  paid = paid;
			  customer = customer;
			  deadline = deadline;
			  architecture = architecture;
			  contractor = contractor; 
			   	}
		  
		 public MultiClassExpl(String pers_name, String telephone_num, String email_addr,String physical_addr, String title, String contr_name, String telecontr_num, String emailcontr_addr,String physicalcontr_addr, String titlecontr,String arch_name, String telearch_num, String emailarch_addr,String physicalarch_addr, String titlearch) {
			   pers_name = pers_name;
			   telephone_num = telephone_num;
			   email_addr = email_addr;
			   physical_addr = physical_addr;
			   title = title;
			   contr_name = contr_name;
			   telecontr_num = telecontr_num;
			   emailcontr_addr = emailcontr_addr;
			   physicalcontr_addr = physicalcontr_addr;
			   titlecontr = titlecontr;
			   arch_name = arch_name;
			   telearch_num = telearch_num ;
			   emailarch_addr = emailarch_addr;
			   physicalarch_addr = physicalarch_addr;
			   titlearch = titlearch;
			   }
		 
	    
	 //toString Method for Project
	   public String project_string() throws ParseException {
	      String output = "Project_Number: " + project_num;
	     output += "\nName :" + name;
	     output += "\nBuilding Type : " + buid_type;
	     output += "\nERF Number : " + erf;
	     output += "\nTotal Amount : " + total;
		 output += "\nAmount paid:" + paid;
		 output += "\nCustomer : " + customer;
		 output += "\ndeadline " + deadline;
		 output += "\nArchitecture: " + architecture;
		 output += "\nContractor: " + contractor;
	     return output;
	  }
	   
	   public static void show_duedate() throws ParseException {
		    System.out.println(" Check DueDate  ");
	        String date1 = deadline;
			Date duedate=new SimpleDateFormat("ddMMyyyy").parse(date1);
			System.out.println(" DueDate for Project ID " + project_num +" is "+ duedate);
			}
	
	 		public String pers_string() {
		      String output = "Customer Name: " + pers_name;
		      output += "\nTelephone Nmber:" + telephone_num;
		      output += "\nEmail addr " + email_addr;
		      output += "\nPhysical Addr " + physical_addr;
		      output += "\nTitle: " + title;
		      return output;
	 		}
	 		public String contr_string(){
	 			String output ="\nContractor : " + contr_name;
		      output +="\nTelephone Nmber: "+ telecontr_num;
		      output +="\nEmail address: "+ emailcontr_addr;
		      output +="\nPhysical address :" + physicalcontr_addr;
		      output +="\nTitle :" + titlecontr;
		      return output;
	 		}
	 		public String arch_string(){
	 			String output ="\nArchitecture :"+ arch_name;
		      output +="\nTelephone Nmbr :"+ telearch_num ;
		      output +="\nEmail addr "+ emailarch_addr;
		      output +="\nPhysical Address :" + physicalarch_addr;
		      output +="\nTitle :"+ titlearch;
		      return output;
		   }
		 static void change_total() {
			 System.out.println("Change total amount ");
				Scanner nmber = new Scanner(System.in);
				System.out.println("Enter new total ");
				int new_total = nmber.nextInt();
			   total=new_total;
			   System.out.println(" Successfuly changed ");
			   System.out.println(" New Total is "+total);
			   }
		 
		 static void change_contractor() {
			 System.out.println("Change Contractor contact details ");
				Scanner con = new Scanner(System.in);
				System.out.println("Enter new details ");
				String new_con = con.nextLine();
				contractor=new_con;
			   System.out.println(" Successfuly changed ");
			   System.out.println(" Contractor details "+ contractor);
			   }
		
		 
		static void change_date() throws ParseException{
			System.out.println("Duedate change ");
			Date dateold=new SimpleDateFormat("ddMMyyyy").parse(deadline);
			System.out.println(" Current Due date :"+dateold);
			Scanner newdue = new Scanner(System.in);
			System.out.println("Enter new date ");
			System.out.print(" Follow the Format -  ddMMyy  " );
			deadline = newdue.nextLine();
			//String date1 = deadline;
			Date date1=new SimpleDateFormat("ddMMyyyy").parse(deadline);
			System.out.println(" New date " + deadline+"\t"+date1);
			 }

			 
	@SuppressWarnings("resource")
	public static void main (String [] args) throws ParseException{
		
		int choice = 0;
		System.out.println("Main Menu ");
		System.out.println("Print select one of the following options \n 1 - View Project \n 2 - View Customer \n 3 - View Contractor  \n 4 - View Architecture \n 5 - Change Project DueDate \n 6 - Check Due date \n 7 - Change Total Amount \n 8 -  Change Contractor details \n 9 -  exit "); 
		Scanner nmber = new Scanner(System.in);
		System.out.println("Enter choice ");
		choice = nmber.nextInt();
		while (choice!=9) {
		switch (choice){
		
		case 1: MultiClassExpl project = new MultiClassExpl(project_num, name, buid_type, address, erf, total, paid, customer, deadline, architecture, contractor);  
		      System.out.println(project.project_string());
		      break;
		case 2:MultiClassExpl person = new MultiClassExpl(pers_name,telephone_num ,email_addr ,physical_addr, title, contr_name, telecontr_num, emailcontr_addr, physicalcontr_addr, titlecontr, arch_name, telearch_num, emailarch_addr, physicalarch_addr, titlearch);
		      System.out.println(person.pers_string());
		      break;
		case 3:MultiClassExpl contractor = new MultiClassExpl(pers_name,telephone_num ,email_addr ,physical_addr, title, contr_name, telecontr_num, emailcontr_addr, physicalcontr_addr, titlecontr, arch_name, telearch_num, emailarch_addr, physicalarch_addr, titlearch);      
			  System.out.println(contractor.contr_string());
		      break;
		case 4:MultiClassExpl arch = new MultiClassExpl(pers_name,telephone_num ,email_addr ,physical_addr, title, contr_name, telecontr_num, emailcontr_addr, physicalcontr_addr, titlecontr, arch_name, telearch_num, emailarch_addr, physicalarch_addr, titlearch);      
				System.out.println(arch.arch_string());
				break;
		case 5: change_date();
	   	      	break;
		case 6: show_duedate() ;
        		break;     
		case 7: change_total();
		       	break;
		case 8: change_contractor();
				break;
						
		}
		    System.out.println("Print select one of the following options \n 1 - View Project \n 2 - View Customer \n 3 - View Contractor  \n 4 - View Architecture \n 5 - Change Project DueDate \n 6 - Check Due date \n 7 - Change Total Amount \n 8 -  Change Contractor details \n 9 -  exit "); 
			Scanner nmber1 = new Scanner(System.in);
			System.out.println("Enter choice ");
			choice = nmber1.nextInt();}
		
		System.out.println("  SYSTEM EXIT   "); 
	
	
	}
		
				   
	}


