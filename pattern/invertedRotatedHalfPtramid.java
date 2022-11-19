
public class invertedRotatedHalfPtramid {

    public static void pyramid(int n )
    {
        for(int i =1 ; i<=n ;i++){
            for(int j = 1 ; j <= n-i;j++)
            {
                System.out.print("_");
            }
            for(int j=1; j<= i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

// Inverted half-prymid with number
    public static void halfPyramid(int n)
    {
        for(int i =5 ;i> 0;i--)
        {
            for(int j =1 ; j <= i;j++ )
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void floyedTriangle(int n)
    {
        int count = 1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1 ;j<=i;j++)
            {
                if((i+j)%2 == 0)
                {
                    System.out.print("1 ");
                }else
                {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

    }

    public static void butterfly(int n)
    {
        for(int i =1 ; i<=n;i++){
            for(int j = 1; j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=1; j<=((n-i)*2);j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();

        }

        for(int i =n ; i>= 1;i--){
            for(int j = 1; j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=1; j<=((n-i)*2);j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void solidRhombus(int n){
        for(int i = 5; i >= 0;i--)
        {
            for(int k=0;k<i;k++ )
            {
                System.out.print(" ");
            }
            for(int j=0; j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void hollowRhombus(int n){
        for(int i = 5; i >= 0;i--)
        {
            for(int k=0;k<i;k++ )
            {
                System.out.print(" ");
            }
            for(int j=0; j<=n;j++)
            {
                if(j==0 || i==0||j==n || i==n)
                    System.out.print("*");
                else
                    System.out.print(" ");

            }   
            System.out.println();
        }
    }

    public static void dimondPattern(int n)
    {
        for(int i =1; i<=n;i++)
        {
            for(int j=i;j<=(n-1);j++)
            {
                System.out.print(" ");
            }
            
            for(int k=1; k<=(2*i)-1;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i =n; i>=1;i--)
        {
            for(int j=i;j<=(n-1);j++)
                System.out.print(" ");
            
            for(int k=1; k<=(2*i)-1;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        // pyramid(4);
        // halfPyramid(5);
        // floyedTriangle(5);
        // butterfly(5);
        // solidRhombus(5);
        // hollowRhombus(5);
        dimondPattern(5);
    }
}
