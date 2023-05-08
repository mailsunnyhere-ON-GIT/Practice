import java.util.*;
public class AdPrime
{
    public static void main(String[] args)
    {
        System.out.println("Enter the number");
        Scanner in=new Scanner(System.in);
        int k=in.nextInt();
        System.out.println(CheckPm(k));
        
    }
    static boolean CheckPm(int k)
    {
        boolean x;
        if(k==1)
        { return false;}
        for(int i=2;i*i<=k;i++)
        {
            if(k%i==0){
             return false;}
            
        }
        return true;
    }
}