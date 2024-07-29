public class test1
{
    
    public static void main(String args[])
    {
        int arr[][]=new int[7][7];
        for(int i=0;i<7;i++)
        {
            for(int j=0;j<7;j++)
            {
                if(i==0||j==0||i==6||j==6){
                arr[i][j]=1;}

                if((i+1<6)&&(j+1)<6)
                {
                    arr[i+1][j+1]=(arr[i][j]==0)?1:0;
                }

            }
        }
      for(int k=0;k<7;k++)
      {
        for(int l=0;l<7;l++){
           System.out.print(" "+arr[k][l]);

        }
        System.out.println("");

      }


    }
}