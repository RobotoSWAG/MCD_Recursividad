public class Ejercicio {


    public static int mcd(int a, int b)
    {
        int mcd;
        if(a == b)
        {
            mcd = b;
        }else
        {
            if(a > b)
            {
                a=a-b;
            }else
            {
                b=b-a;
            }
            mcd = mcd(a,b);
        }
        return mcd;
    }

}
