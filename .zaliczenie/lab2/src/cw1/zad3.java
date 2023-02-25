package cw1;

public class zad3
{
    public static void main(String[] args)
    {
        /* zad.3
        a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)
        b) a jak gdy damy false --> while(false)
        */

        /*
        while (false)
        {
            System.out.println("Nie wykonalna petla!");
        }
        bład java: unreachable statement
        */


        while (true)
        {
            System.out.println("Nieskonczone wykonanie petli");
        }
    }
}