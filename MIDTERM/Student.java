public class Student 
{

   public Student(){};
   String first_name = "";
   String middle_name = "";
   String last_name = "";
   String suffix = "";
   
   //getters
   public String getFirstName()
   {
   return first_name;
   }
   
   public String getMiddleName()
   {
   return middle_name;
   }
   
   public String getLastName()
   {
   return last_name;
   }
   
   public String getSuffix()
   {
   return suffix;
   }
   
   public String getFullName()
   {
   return first_name + " " + middle_name + " " + last_name + " " + suffix;
   }
   
   //setters
   
   public void setFirstName(String fname)
   {
   first_name = fname;
   }
   
   public void setMiddleName(String mname)
   {
   middle_name = mname;
   }
   
   public void setLastName(String lname)
   {
   last_name = lname;
   }
   
   public void setSuffix(String sfx)
   {
   suffix = sfx;
   }

}
   
   

   