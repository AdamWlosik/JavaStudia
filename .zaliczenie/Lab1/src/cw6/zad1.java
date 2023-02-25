package cw6;

import java.util.Random;

public class zad1
{
    public static void main(String[] args)
    {
        /* Tablice - cw_6 */

        /* zad1. stworzyć tablicę 5-cio elementową typu:
            a) double[],
            b) char[],
            c) boolean[]
            przypisać do niej wartości i wyświetlić za pomocą dowolnej pętli.
        */

        Random rand = new Random();

        double[] doubletab = new double[5];
        char[] ctab = {'A','D','A','M','W'};
        boolean[] btab = new boolean[5];
        int x = 0;

        System.out.println("Tablica liczb typu double:");
        for (int i = 0; i < doubletab.length; i++)
        {
            doubletab[i] = (Math.random() * 100) + 1;
            System.out.printf("- %.2f\n",doubletab[i]);
        }

        System.out.println("\nTablica znakow typu char");
        for (char znak : ctab)
        {
            System.out.println("- " + znak);
        }

        System.out.println("\nTablica wartosci typu bool:");
        while (x != 5)
        {
            btab[x] = rand.nextBoolean();
            System.out.println("- " + btab[x]);
            x++;
        }
    }
}
