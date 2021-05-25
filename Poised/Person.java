
import java.util.Scanner;


public class Person {
			 
				 // Attributes
				   
			  	   String pers_name;
				   String telephone_num;
				   String email_addr;
				   String physical_addr;
				   String title;
				   String contr_name;
				   String telecontr_num ; 
				   String emailcontr_addr ;
				   String physicalcontr_addr;
				   String titlecontr;
				   String arch_name;
				   String telearch_num; 
				   String emailarch_addr;
				   String physicalarch_addr;
				   String titlearch;
				   
				   static String getpersname(){
					   System.out.println();
					   System.out.println();
					   System.out.println("CUSTOMER DETAILS ");
				       System.out.print("Enter Person name: ");
					   Scanner pn = new Scanner(System.in);
					   String pers_name = pn.nextLine();
					   //pn.close();
					   return pers_name.toLowerCase();
					  
				   }
				   		
				   static String getperstel(){
				       System.out.print("Enter the Telephone number: ");
					   Scanner tp = new Scanner(System.in);
					   String pers_tel = tp.nextLine();
					   //n.close();
					   return pers_tel;
					   }
				   
				   static String getpersemail(){
					   System.out.print("Enter the email address: ");
					   Scanner em = new Scanner(System.in);
					   String pers_email = em.nextLine();
					   //b.close();
					   return pers_email.toLowerCase();
				   }
				   
				   static String getpersaddr(){
				       System.out.print("Enter the physical address: ");
					   Scanner pa = new Scanner(System.in);
					   String pers_addr = pa.nextLine();
					   //a.close();
					   return pers_addr.toLowerCase();
				   }
				   
				   static String getperstitle(){
					   System.out.print("Enter the Title of the person :");
					   Scanner tl = new Scanner(System.in);
					   String pers_title = tl.nextLine();
					   //e.close();
					   return pers_title.toLowerCase();
				   }
				   
				   static String getcontracname(){
					   System.out.println();
					   System.out.println();
					   System.out.println("CONTRACTOR DETAILS ");
				       System.out.print("Enter Contractor name: ");
					   Scanner cn = new Scanner(System.in);
					   String contr_name = cn.nextLine();
					   //pn.close();
					   return contr_name.toLowerCase();
					  
				   }
				   		
				   static String getcontractel(){
				       System.out.print("Enter the Telephone number: ");
					   Scanner tp = new Scanner(System.in);
					   String contr_tel = tp.nextLine();
					   //n.close();
					   return contr_tel;
					   }
				   
				   static String getcontracemail(){
					   System.out.print("Enter the email address: ");
					   Scanner em = new Scanner(System.in);
					   String contr_email = em.nextLine();
					   //b.close();
					   return contr_email.toLowerCase();
				   }
				   
				   static String getcontracaddr(){
				       System.out.print("Enter the physical address: ");
					   Scanner pa = new Scanner(System.in);
					   String contr_addr = pa.nextLine();
					   //a.close();
					   return contr_addr.toLowerCase();
				   }
				   
				   static String getcontractitle(){
					   System.out.print("Enter the Title of the person :");
					   Scanner tl = new Scanner(System.in);
					   String contr_title = tl.nextLine();
					   //e.close();
					   return contr_title.toLowerCase();
				   }
				   static String getarchname(){
					   System.out.println();
					   System.out.println();
					   System.out.println("ARCHITECTURE DETAILS ");
				       System.out.print("Enter name: ");
					   Scanner pn = new Scanner(System.in);
					   String arch_name = pn.nextLine();
					   //pn.close();
					   return arch_name.toLowerCase();
					  
				   }
				   		
				   static String getarchtel(){
				       System.out.print("Enter the Telephone number: ");
					   Scanner tp = new Scanner(System.in);
					   String arch_tel = tp.nextLine();
					   //n.close();
					   return arch_tel;
					   }
				   
				   static String getarchsemail(){
					   System.out.print("Enter the email address: ");
					   Scanner em = new Scanner(System.in);
					   String arch_email = em.nextLine();
					   //b.close();
					   return arch_email.toLowerCase();
				   }
				   
				   static String getarchaddr(){
				       System.out.print("Enter the physical address: ");
					   Scanner pa = new Scanner(System.in);
					   String arch_addr = pa.nextLine();
					   //a.close();
					   return arch_addr.toLowerCase();
				   }
				   
				   static String getarchtitle(){
					   System.out.print("Enter the Title of the person :");
					   Scanner tl = new Scanner(System.in);
					   String arch_title = tl.nextLine();
					   //e.close();
					   return arch_title.toLowerCase();
				   }
				   
			}
		    
		   
		







