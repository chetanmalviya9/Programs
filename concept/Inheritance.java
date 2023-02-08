public class Inheritance{
    public static void main(String[] args) {
        A obj = new A();
        obj.turn();
    }
}
class B {
    B(){
        System.out.println("B class constructor........");
    }
    static{
        System.out.println("B class static........");
    }
    {
        System.out.println("B class non-static........");
    }
     void turn(){
        System.out.println("instance method");
    }
}
class A extends B{
    A(){
        System.out.println("A class constructor........");
    }
    static{
        System.out.println("A class static........");
    }
    {
        System.out.println("A class non-static........");
    }
     void turn(){
        System.out.println("turn");
    }
}