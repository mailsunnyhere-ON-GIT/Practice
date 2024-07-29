import java.util.*;
public class arlist
{
    public static void main(String args[])
    {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
         Scanner in=new Scanner(System.in);
         //declaration part
        for(int i=0;i<3;i++)
        {
            list.add(new ArrayList<>());
        }
        //initializing part
        for(int l=0;l<3;l++){
        for(int j=0;j<3;j++)
        {
            list.get(l).add(in.nextInt());
        }
        }

        System.out.println(list);


    }
}