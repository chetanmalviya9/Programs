class A2{
    A2(){}
A2(int b){
        System.out.println("hiii");
    }
}
class A1 extends A2{
    A1(int a){
        System.out.println("hiii");
    }
    public static void main(String args[]){
        A1 a= new A1(23);
    }
}