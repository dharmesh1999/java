public class pairArray {

    public static void printpairs(int numbers[])
    {
        for(int i =0; i< numbers.length ;i++)
        {
            for(int j=0; j<numbers.length;j++)
            {
                System.out.print("(" + numbers[i] + "," +numbers[j] +")");
            }
        }
    }
    public static void main(String args[])
    {
        int number[] = {2,4,6,8,10};
        printpairs(number);
    }
}
