public class MaxValExpressionMed {
    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        int[] arr1 = new int[4];
        arr1[0] = -1;
        arr1[1] = 4;
        arr1[2] = 5;
        arr1[3] = 6;
        int n = maxvalue(arr,arr1);
        System.out.println(n);
    }

    private static int maxvalue(int[] arr, int[] arr1) {
        int res = 0;
        int n  = arr.length;
        int[] P = {-1,1};
        for(int p: P) {
            for(int q: P) {
                int smallest = p * arr[0] + q * arr1[0];
                for(int i = 1; i < n; ++i) {
                    int curr = p * arr[i] + q * arr1[i] + i;
                    res = Math.max(res, curr-smallest);
                     smallest = Math.min(smallest, curr);
                }
            }
        }
        return res;
    }
}
