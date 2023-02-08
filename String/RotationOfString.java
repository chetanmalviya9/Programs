import java.util.Scanner;

class Rotation
{
     public void checkRotation(String s1,String s2)
     {
          String rev=s1+s1;
          if(rev.contains(s2))
             System.out.println("Strings are Rotation of each other");
          else
             System.out.println("Strings are not Rotation of each other");
     }
          
}
 
class RotationOfString{
     public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter first String");
          String s1=sc.next();
          System.out.println("Enter Second String");
          String s2=sc.next();
          Rotation r=new Rotation();
          r.checkRotation(s1,s2);
     }
}