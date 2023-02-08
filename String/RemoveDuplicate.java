class Duplicate{
     public void remove(String s1){
          String s2="";
          for(int i=0;i<s1.length();i++)
          {
               char x=s1.charAt(i);
               
                    if(s2.indexOf(x)<0)
                    s2+=x;
          }
          System.out.println(s2);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
     } 
}
public class RemoveDuplicate {
     public static void main(String[] args) {
     String s1="aabbccdd";
     Duplicate obj=new Duplicate();
     obj.remove(s1);          
     }    
}
