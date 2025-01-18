public class MajorityElementThreeMed {
    public static void main (String[] args) {
        int[] arr = {1,2};
        sol(arr);
    }

    public static void sol(int[] arr) {
        int count = 0, count1 = 0, candidate1 = 0, candidate2 = 0;
        for(int num: arr) {
            if(num == candidate1) {
                count++;
            }
            else if(num == candidate2) {
                count1++;
            }
            else if(count == 0) {
                candidate1 = num;
                count = 1;
            }
            else if(count1 == 0) {
                candidate2 = num;
                count1 = 1;
            }
            else {
                count--;
                count1--;
            }
        }
        int count2 = 0, count3 = 0;
        for(int num: arr) {
            if(num == candidate1) {
                count2++;
            }
            else if(num == candidate2) {
                count3++;
            }
        }
        if(count2 > arr.length/3) {
            System.out.print(candidate1);
        }
        if(count3 > arr.length/3) {
            System.out.println(","+candidate2);
        }
    }
}
