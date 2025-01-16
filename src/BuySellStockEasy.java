public class BuySellStockEasy {
    public static void main(String[] args) {
        int[] arr1= {7,1,5,3,6,4};
        int[] arr2= {1,2,3,4,5};
        System.out.println(maxprofit(arr1));
    }

    private static int maxprofit(int[] arr1) {
        int lsp = Integer.MAX_VALUE;
        int op = 0;
        int pist = 0;
        for(int i = 0; i < arr1.length; i++) {
            if(arr1[i] < lsp) {
                lsp = arr1[i];
            }
            pist = arr1[i] -lsp;
            if(pist > op) {
                op = pist;
            }
        }
        return op;
    }
}
