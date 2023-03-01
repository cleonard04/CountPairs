import java.util.Arrays;

public class CountPairs {

    public static int findPairs(int[] a) {

        Integer[] pairsFound = new Integer[a.length];
        Arrays.fill(pairsFound, 0);

        int addpaircount = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    boolean needToAdd = true;
                    for (int k = 0; k < pairsFound.length; k++) {
                        if (pairsFound[k] != null && pairsFound[k] == a[i]) {
                            needToAdd = false;
                        }
                    }
                    if (needToAdd) {
                        pairsFound[addpaircount] = a[i];
                        addpaircount++;
                    }
                }
            }
        }

        return addpaircount;

    }

    public static void main(String[] args) {

        int[] a1 = {1, 3, 1}; // 1 pairs
        int[] a2 = {1, 2, 3, 1, 1, 3}; // 2 pairs
        int[] a3 = {1, 1, 2, 2, 3, 3}; // 3 pairs

        System.out.println("An array of size " + a1.length + " has " + findPairs(a1) + " pairs");
        System.out.println("An array of size " + a2.length + " has " + findPairs(a2) + " pairs");
        System.out.println("An array of size " + a3.length + " has " + findPairs(a3) + " pairs");

    }
}