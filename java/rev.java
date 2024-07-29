import java.util.*;
public class rev
{
    public static void main(String args[])
    {
        Scanner i=new Scanner(System.in);
        int k=i.nextInt();
        int j=0;
        while(k>0)
        {
            int l=k%10;
            j=j*10+l;
            k=k/10;
        }
        System.out.println("rev is "+j);
    }
}