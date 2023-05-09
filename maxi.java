public class maxi
{
    public static void main(String args[])
    {
        int[] arr={10,2,3,4,5000000,0};
        System.out.println(max(arr));
    }

    static int max(int[] arr)
    {
        int m=arr[0];
        for(int i=0;i<arr.length-1;i++)
        {

            if(m<arr[i+1])
            {
                m=arr[i+1];
            }
        
        }

        return m;
    }
}