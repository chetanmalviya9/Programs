import java.util.Scanner;

class Count{
     public void count(String s1){
          String s2[]=s1.split(" ");
          int n=s2.length;
          boolean flag=false;
          for(int i=0;i<n;i++)
          {
               flag = false;
               int len=s2[i].length();
               for(int j=0;j<len;j++)
               { 
                    char k=s2[i].charAt(j);               
                    
                    if(k=='a'||k=='e'||k=='i'||k=='o'||k=='u'||k=='A'||k=='E'||k=='I'||k=='O'||k=='U')
                    {
                         flag = true;
                    }
               }
               if(flag == true)
               System.out.println("length of "+s2[i]+" = "+len);
          }
     }
}
public class CountWordWithVowel 
{
     public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter String ");
          String s1=sc.nextLine();
          Count c=new Count();
          c.count(s1);
     }
}
