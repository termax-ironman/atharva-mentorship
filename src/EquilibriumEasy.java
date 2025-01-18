public class EquilibriumEasy {
    public static void main(String[] args) {
        int[] arr = {1,2,0,3};
        System.out.println(sol(arr));
    }
    public static int sol(int[] arr) {
        int totalsum = 0;
        int leftsum =0;
        int ritsum = 0;
        for(int t: arr) {
            totalsum += t;
        }
        for (int i = 0; i < arr.length; i++) {
            totalsum -= arr[i];
            if(leftsum == totalsum) {
                return i;
            }
            leftsum += arr[i];
        }
        return -1;
    }
}
