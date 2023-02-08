import java.util.Scanner;

class Check{
     public void checking(String s1)
     {
          int len=s1.length();
          int count=0;
          for(int i=0;i<s1.length();i++)
               if(s1.charAt(i)>=48&&s1.charAt(i)<=57)
                count++; 

          if(count==len)
              System.out.println("String contains digit only");
          else if(count>0)
              System.out.println("String contains digit and other character also");
          else
              System.out.println("String not contains any digit");
     }
}
public class CheckDigit
{
     public static void main(String[] args) 
     {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter String");
          String s1=sc.nextLine();
     
          Check s= new Check();
          s.checking(s1);
     }     
}
