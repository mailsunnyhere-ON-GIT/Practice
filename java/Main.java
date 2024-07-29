//check case of characters in java
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        char inn=input.next().trim().charAt(0);
        if(inn>='a'&&inn<='z')
        {
            System.out.print("it is in lower case");
        }
        else {
            System.out.print("Upper case");
        }

    }
}