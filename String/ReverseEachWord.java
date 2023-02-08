class ReverseString{
     public void reverse(String s1){
          String s2[]=s1.split(" ");
          String rev="";
          for(String element : s2)
          {
               int n=element.length();
               for(int i=n-1;i>=0;i--)
               {
                    rev=rev+element.charAt(i);

               } 
               rev=rev+" ";
          }
          System.out.println(rev);
     }
}

class ReverseEachWord{
     public static void main(String[] args) {
          String s1=new String("Java is Independent Platform");
          ReverseString r=new ReverseString();
          r.reverse(s1);
     }
}