

class Length{
     public void length(String s1){
          String []s2=s1.split(" ");
          int n=s2.length;
          int i=0;
          int count[]=new int [n];
          for(String element: s2)
          count[i++] = element.length();
          int max=0;
          int index=0;
          for(int j=0;j<n;j++){
               if(count[j]<max) 
               {
                    max=count[i];
                    index=i;
               }
          }
          System.out.println("the longest String is :-"+s2[index+1]);
     }
}

public class LongestLengthOfString {
     public static void main(String[] args) {
          String s1="Dear Student ,You have need to work hard";
         Length l=new Length();
         l.length(s1);
     }
}
