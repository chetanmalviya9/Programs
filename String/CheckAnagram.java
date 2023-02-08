import java.util.Scanner;

class Check{
     public boolean checkAnagram(String s1,String s2)
     {
          int sum1=0;
          int sum2=0;
          s1=s1.trim();
          s2=s2.trim();
          if(s1.length()==s2.length())
          {
               for(int i=0;i<s1.length();i++)
                {
                    sum1 += s1.charAt(i);
                    sum2 += s2.charAt(i);
               }
               
               if(sum1==sum2)
                 return true;
               else
                 return false;
          }
          else
               return false;
     }
}
public class CheckAnagram
{
     public static void main(String[] args) 
     {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter first String");
          String s1=sc.nextLine();
          System.out.println("Enter first String");
          String s2=sc.nextLine();
          
          Check s= new Check();
          
          boolean check=s.checkAnagram(s1,s2);
          
          if(check)
              System.out.println("True");
          else
              System.out.println("False");
     }     
}
