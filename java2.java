public class test2
{
    public static void main(String args[])
    {
        int n=7; 
        int[][] pattern= new int[n][n];
        for(int i=0;i<n;i=i+2)
        {
            for(int j=i;j<n-i;j=j++)
            {
                pattern[i][j]=0;
                pattern[j][i]=0;
            }
        }
        for(int i=1;i<n;i=i+2)
        {
            for(int j=i;j<n-i;j=j++)
            {
                pattern[i][j]=1;
                 pattern[j][i]=1;
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n-i;j++)
            {
                System.out.print(pattern[i][j]);
            }
            System.out.println();
        }
    }
}