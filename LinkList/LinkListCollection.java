import java.util.LinkedList;

public class LinkListCollection {
    public static void main(String args[]) {
        // create -- object here we can not use int , float
        LinkedList<Integer> ll = new LinkedList<>();
        // add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        // revmove
        ll.removeLast();
        ll.removeFirst();
        // print
        System.out.print(   ll);
    }
}
