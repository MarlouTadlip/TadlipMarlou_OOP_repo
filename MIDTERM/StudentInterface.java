import java.util.Scanner;

public class StudentInterface
{
   public static void main(String args[])
   {
   Scanner scan = new Scanner(System.in);
   Student s = new Student();
   
   System.out.println("Enter your first name: ");
   s.setFirstName(scan.nextLine());
   
   System.out.println("Enter your middle name: ");
   s.setMiddleName(scan.nextLine());

   System.out.println("Enter your last name: ");
   s.setLastName(scan.nextLine());

   System.out.println("Enter your suffix name: ");
   s.setSuffix(scan.nextLine());

   System.out.println("First Name: " + s.getFirstName());
   System.out.println("Middle: " + s.getFirstName());
   System.out.println("Last Name: " + s.getFirstName());
   System.out.println("Suffix Name: " + s.getFirstName());
   System.out.println("Full Name: " + s.getFullName());
   

  
   }
}