//check if string is palindrom or not
import java.util.*;
public class pal
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        boolean flag=true;
        System.out.println("Enter the String");
        String all=in.next();
        all=all.toLowerCase();
        if(all==null||all=="")
            System.out.println("not valid");
        for(int i=0;i<all.length()/2;i++)
        {
            char i1=all.charAt(i);
            char f=all.charAt(all.length()-1-i);

            if(i1!=f){
            System.out.println("not a palindrom");
            flag=false;
            break;}
            flag=true;

            
        }
        if(flag==true)
        System.out.println("it is a palindrom");
    }
}