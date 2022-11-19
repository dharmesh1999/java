package ArrayList;

import java.util.ArrayList;

public class Classroom {

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        list.add(1, 9);

        list.set(2, 10);
        System.out.print(list);

        System.out.print(list.contains(11));

    }
}
