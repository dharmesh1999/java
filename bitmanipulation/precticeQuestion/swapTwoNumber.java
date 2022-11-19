package bitmanipulation.precticeQuestion;

public class swapTwoNumber {

    public static void main(String args[]) {
        int a = 10;
        int b = 15;
        System.out.println("A : " + a + " B : " + b);
        a = a + b;// a*b
        b = a - b;// a/b
        a = a - b;// a/b

        System.out.println("A : " + a + " B : " + b);
    }
}
