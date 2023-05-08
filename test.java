public class test
{
    public static void main(String[] args)
    {
        String k="sunny";
        System.out.println(k);
        calling(k);
        System.out.println(k);

    }
    static String calling(String k){
    k="notsunny";
    return k;}

}