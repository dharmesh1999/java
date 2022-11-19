public class primeNumber {
    public static boolean isPrime(int n){
        if(n==2)
        {
            return true;
        }

        for(int i =2 ; i<n-1 ;i++){
            if(n%i==0)
            {
                return false;
            }
        }

        return true;
    }
    //optimized prime number
    public static boolean isPrimeOptimized(int n)
    {
        int limit = n/2;
        if(n==2){
            return true;
        }
        for(int i =2 ; i < limit; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void primesNumberInReange(int n)
    {
        for(int i = 2; i<=n;i++)
        {
            if(isPrime(i))
            {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String args[]){
        System.out.println(isPrime(12));
        System.out.println(isPrimeOptimized(5));
        primesNumberInReange(16);
    }
}
