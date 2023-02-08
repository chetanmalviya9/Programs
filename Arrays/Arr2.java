// import java.util.*;
// public class Arr2{
//     public static void main(String args[]){
//         int arr[]={10,12,304,50,50,60,3,10,30,550,20,12,3};
//          LinkedHashSet<Integer> al = new LinkedHashSet<>(); 
//         for(int x:arr)
//         al.add(x);
//         System.out.println(al);
//     }
// }

public class Arr2{
    public static void main(String args[]){
        int arr[]={10,12,304,50,50,50,60,3,10,30,550,20,12,3};
        int len =arr.length;
        for(int i=0; i<len-1; i++){
            for(int j=i+1; j<len; j++)
            {

                if(arr[i]==arr[j]){
                   for(int k=j; k< len-1; k++){
                    arr[k]=arr[k+1];
                   }
                   len--;
                   j--;
                }

            }
        }
        for(int i=0; i<len; i++)
        System.out.println(arr[i]);
    }
}