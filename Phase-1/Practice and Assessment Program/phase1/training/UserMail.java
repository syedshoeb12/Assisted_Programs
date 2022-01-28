package phase1.training;

import java.util.regex.*;
import java.util.*;

public class UserMail {
	
public static void main(String[] args) {
 
 ArrayList<String> emails = new ArrayList<String>(); 
       emails.add("syedShoeb@domain.co.in"); 
       emails.add("akasKumar@domain.com"); 
       emails.add("javaT-point#@domain.co.in"); 
       emails.add("RumanT_pasha@domain.com"); 
       emails.add("javaTpoint@domaincom");
 
 //Add invalid emails in list 
       emails.add("@trend.com"); 
       emails.add("07javaTpoint#domain.com");
 
 //Regular Expression 
     String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
 
 //Compile regular expression to get the pattern 
      Pattern pattern = Pattern.compile(regex);
 
 //Iterate emails array list 
      for(String email : emails){
 
 //Create instance of matcher 
      Matcher matcher = pattern.matcher(email); 
     System.out.println(email +" : "+ matcher.matches()+"\n"); 
 
     } 
   }
}
