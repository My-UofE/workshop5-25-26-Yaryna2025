import java.util.Arrays;
import java.util.ArrayList;

public class CopyArrayApp {
    public static void main(String[] args) {

        int nVals = args.length;
        int[] myVals = new int[nVals];

        for (int i = 0; i < nVals; i++) {
            int item = Integer.parseInt(args[i]);
            myVals[i] = item;
        }

        System.out.println("original values: " + Arrays.toString(myVals));

        ArrayList<Integer> uniqueVals = new ArrayList<>();

        for (int val : myVals) {
            if (!uniqueVals.contains(val)) {
                uniqueVals.add(val);
            }
        }

        System.out.println("unique values: " + uniqueVals);
    }
}
