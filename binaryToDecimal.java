public class binaryToDecimal {
    public static void binToDec(int binNum)
    {
        int myNum = binNum;
        int pow = 0;
        int decimal = 0;
        while(binNum > 0){
            int lastDigit = binNum%10;

            decimal = decimal + (lastDigit *(int) Math.pow(2,pow));
            pow++;
            binNum=binNum/10;
        }
        System.out.println("decimal of " + myNum + "=" + decimal);
    }

    public static void main(String args[])
    {
        binToDec(101);
    }
}
