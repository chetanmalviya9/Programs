public class Pattern1 {
    public static void main(String[] args) {
        int n=7;
        int k=1;
        for (int i=1;i<=n;i++){
            if(i%2==0){
                for(int j=1;j<=n-i+1;j++){
                    System.out.print(j+"  ");
                }
            }
            else{
            for(int j=n-i+k;j>=k;j--){
                System.out.print(j+"  ");
            }
            k++;
        }
            System.out.println();
        }
    }
}
