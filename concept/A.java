import javax.crypto.BadPaddingException;

class B{
    static {
        System.out.println("static parent");
    }
    {
        System.out.println("innit parent");
    }
    
    
    B(){
        System.out.println("constructor parent");
    }
    // B(int a){
    //     System.out.println("Default ddd B");
    // }
}
class C extends B {
   static {
        System.out.println("static child");
    }
    {
        System.out.println("innit child");
    }
    
    C(){
        System.out.println("constructor Child");
    }
    // C(int a){
        
    //     System.out.println("Default ddd");
    // }
}


public class A {
   public static void main(String[] args) {
    C obj = new C();
   }
}
