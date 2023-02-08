import java.util.ArrayList;
public class Arr1{
    public static void main(String args[]){
        int arr[]={10,12,304,50,50,60,3,10,30,550,20,12,3};
        int arr1[]=new int[arr.length];
        int k = 0;
        // ArrayList<Integer> a1= new ArrayList<>();
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++)
            {

                if(arr[i]==arr[j]){
                   
                    arr1[k]=arr[i];
                   k++;
				   
                }
            }
        }
        for(int i=0; i<k; i++)
        System.out.println(arr1[i]);
    }
}
//---------With ArrayList------------//
// public class Arr1{
//     public static void main(String args[]){
//         int arr[]={10,12,304,50,50,60,3,10,30,550,20,12,3};
//         ArrayList<Integer> a1= new ArrayList<>();
//         for(int i=0; i<arr.length; i++){
//             for(int j=i+1; j<arr.length; j++)
//             {

//                 if(arr[i]==arr[j]){
//                     a1.add(arr[i]);
//                 }

//             }
//         }
//         System.out.println(a1);
//     }
// }
//--------------------------------------------
// Java program to Demonstrate asList() method
// of Arrays class For an integer value

// Importing utility classes
// import java.util.*;

// public class Arr1 {

// 	public static void main(String[] argv) throws Exception
// 	{
// 		try {

// 			 Integer a1[] = new Integer[]{ 10, 20, 30, 40 };
// 			int a[] ={ 166,0, 20, 30, 40 };
//           System.out.println(a1.getClass().getName());
//           System.out.println(a.getClass().getName());

//           //   a1=a;
// 			//List<Integer> list = Arrays.asList(a1);

// 		//	System.out.println("The list is: " + list);
// 		}

// 		catch (NullPointerException e) {
// 			System.out.println("Exception thrown : " + e);
// 		}
// 	}
// }
