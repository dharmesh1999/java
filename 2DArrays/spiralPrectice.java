//{ Driver Code Starts
    import java.io.*;
    import java.util.*;
    class GFG
    {
        public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            
            while(t-- > 0)
            {
                int r = sc.nextInt();
                int c = sc.nextInt();
                
                int matrix[][] = new int[r][c];
                
                for(int i = 0; i < r; i++)
                {
                    for(int j = 0; j < c; j++)
                     matrix[i][j] = sc.nextInt();
                }
                Solution ob = new Solution();
                ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
                for (Integer val: ans) 
                    System.out.print(val+" "); 
                System.out.println();
            }
        }
    }
    // } Driver Code Ends
    
    
    class Solution
    {
        //Function to return a list of integers denoting spiral traversal of matrix.
        static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
        {
            int startRow=0;
            int startCol=0;
            
            int endRow=r-1;
            int endCol=c-1;
            ArrayList<Integer> ans=new ArrayList<Integer>((r*c)); 
            while(startRow < endRow && startCol< endCol)
            {
                for(int i =startCol; i<= endCol ; i++)
                {
                    ans.add(matrix[startRow][i]);
                }
                for(int i =startRow+1; i<= endRow ; i++)
                {
                    ans.add(matrix[i][endCol]);
                }
                for(int i =endCol-1; i>= startCol ; i--)
                {
                    if(startCol == endCol)
                    {
                        break;
                    }
                    ans.add(matrix[endRow][i]);
                }
                 for(int i =endRow-1; i>= startRow+1 ; i--)
                {
                    if(startCol == endCol)
                    {
                        break;
                    }
                    ans.add(matrix[i][startCol]);
                }
                startCol++;
                startRow++;
                endCol++;
                endRow++;
                
            }
            return ans;
        }
    }
    