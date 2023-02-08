
class DeleteDuplicate{
        
    public static int[] delete(int j,int arr[]) {
        for (int k = j; k < arr.length-1; k++) {
            int temp = arr[k];
            arr[k] = arr[k+1];
            arr[k+1] = temp;
        }
        return arr;
    }
}

public class DuplilcateArr{
    public static void main(String[] args) {
        int arr[]={11,22,22,22,22,45,77,777,77,777,77,1,11,56,15,22};
        int n=arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    arr[j]=0;
                    arr=DeleteDuplicate.delete(j, arr);
                    if(arr[i]==arr[j-1]){
                        arr=DeleteDuplicate.delete(j-1, arr); 
                }
                n--;
                j--;
                }
            }
        } 
        for(int i=0;i<n;i++){
            System.out.println( arr[i]);
        }
    }
}