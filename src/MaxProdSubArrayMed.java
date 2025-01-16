import java.util.Scanner;

public class MaxProdSubArrayMed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int n1 = sol(arr);
        System.out.println(n1);
    }

    private static int sol(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = 0;
        int res = arr[0];
        for (int i = 0; i < n; i++) {
            left = (left == 0 ? 1 : left) * arr[i];
            right = (right == 0 ? 1 : right) * arr[n-i-1];
            res = Math.max(res, Math.max(left,right));
        }
        return res;
    }
}
