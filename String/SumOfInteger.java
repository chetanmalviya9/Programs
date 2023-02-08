import java.util.Scanner;

class Sum{
     public void sum(String s1)
     {
          int sum=0;
          String s[]=s1.split(" ");
          for(int i=0;i<s.length;i++)
               sum+= Integer.parseInt(s[i]);
          System.out.println("sum of Integer is:- "+sum);
     }
} 
public class SumOfInteger 
{
     public static void main(String[] args) 
     {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter String");
          String s1=sc.nextLine();
     
          Sum s= new Sum();
          s.sum(s1);
     }     
}
