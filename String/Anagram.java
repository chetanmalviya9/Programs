import java.util.Scanner;

class Check{
     public void checkAnagram(String s1,String s2)
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
                 System.out.println("both Strings are Anagram");
               else
                 System.out.println("Both Strings are not Anagram");
          }
          else
               System.out.println("Both Strings are not Anagram");
     }
}
public class Anagram
{
     public static void main(String[] args) 
     {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter first String");
          String s1=sc.nextLine();
          System.out.println("Enter first String");
          String s2=sc.nextLine();
          Check s= new Check();
          s.checkAnagram(s1,s2);
     }     
}
