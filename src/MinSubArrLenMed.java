import java.util.Scanner;

    public class MinSubArrLenMed {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int target = sc.nextInt();
                int n = sc.nextInt();
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
                System.out.println(sol(target,arr));
            }

        private static int sol(int s,int[] nums) {
            int sum = 0, from = 0, win = Integer.MAX_VALUE;
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                while (sum >= s) {
                    win = Math.min(win, i - from + 1);
                    sum -= nums[from++];
                }
            }
            return (win == Integer.MAX_VALUE) ? 0 : win;
        }
    }

