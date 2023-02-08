public class Uppercase {
    public static void main(String[] args) {
        String str ="Infobeans is good";
       String arr[] = str.split(" ");
        String str1 ="";
        str1+=(char)arr[0].charAt(0)+32;
    }
}
