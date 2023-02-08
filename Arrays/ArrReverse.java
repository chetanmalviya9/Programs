public class ArrReverse {
    public static void main(String[] args) {
        int arr[]={2,3,45,5,2,1,65,3};
        int n = arr.length;
        for(int i=0; i < n/2; i++){
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] =temp;
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
