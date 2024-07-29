class dectobin
{
    public static void main(String args[])
    {
        String a="10111";
        int m=1;
        int sum=0;
        for(int i=a.length()-1;i>=0;i--)
        {
            
          
          sum+=(a.charAt(i)-'0')*m;
          m*=2;
             

        }
         System.out.println(sum);
    }
}