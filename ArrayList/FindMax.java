package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class FindMax {

    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(9);
        list.add(7);
        list.add(5);

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            // if (max < list.get(i)) {
            // max = list.get(i);
            // }

            max = Math.max(max, list.get(i));
        }
        // System.out.println("Max elements = " + max);
        System.out.println(list);

        // Collections.sort(list); //asending
        Collections.sort(list, Collections.reverseOrder());
        // swap(list, 1, 3);
        System.out.println(list);
    }
}
