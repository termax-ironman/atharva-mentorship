import java.util.Scanner;

public class MaxSubArrayMed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(sol(arr));
    }

    private static int sol(int[] arr) {
        int maxsofar = arr[0];
        int maxend = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxend = Math.max(arr[i],arr[i] + maxend);
            maxsofar = Math.max(maxend,maxsofar);

        }
        return maxsofar;
    }
}
