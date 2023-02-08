public class MergeSort {
    public static void main(String[] args) {
        int A[] = { 1, 3, 5, 7, 9 };
        int m = A.length;
        int B[] = { 2, 4, 6, 8, 10 };
        int n = B.length;
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (k >= 0) {
            if (j < 0 || (i >= 0 && A[i] > B[j]))
                A[k--] = A[i--];
            else
                A[k--] = B[j--];
        }
        // for (int k2 = 0; k2 < B.length; k2++) {
        //     System.out.println();
        // }
    }
}
