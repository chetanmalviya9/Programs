class Occurence{
     public void occurence(String s1){ 
          int j=0;
          int n = s1.length(); 
          int count[]=new int[n];
          String x="";
          int k=0;
          int value=0;
          for(int i=0;i<n;i++)
          {    value=0;
               char c=s1.charAt(i);
               if(x.indexOf(c)<0)
               { 
                    for(j=i+1;j<n;j++)
                    {
                         if(s1.charAt(i)==s1.charAt(j)&&i!=j)
                         count[k]=++value;
                    }
                    count[k]=++value;
                    x+=s1.charAt(i);
                    k++;
               }
          }
          for(int i=0;i<x.length();i++)
          {
               System.out.println("Occurence of"+x.charAt(i)+" ="+count[i]);
          }
     }
}

public class OccurenceOfString 
{
     public static void main(String[] args) 
     {
          String s1="aabbccddd";
          Occurence s=new Occurence();
          s.occurence(s1);
     }
}
