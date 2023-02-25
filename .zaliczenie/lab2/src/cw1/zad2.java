package cw1;

import java.util.Random;

public class zad2
{
    public static void main(String[] args)
    {
        /* zad 2
            a) stworzyć tablicę typu int wielkosci 5, przypisac jej dowolne wartości,
            przeiterować tablicę po elementach i wyswietlić, użyć pętli while
            b) jak wyżej tylko dla tablicy typu double[],
            c) jak wyżej dla tablicy String[], przeiterować i wyświetlić od ostatniego elementu
        */

        Random rand = new Random();

        int[] itab = new int[5];
        double[] dtab = new double[5];
        String[] stab = {"a", "b", "c", "d", "e"};

        int k = 0;

        while (k != 5)
        {
            System.out.printf(" %d wypis tablicy:\n", k+1);
            itab[k] = rand.nextInt(100);
            System.out.println(" INT: " + itab[k]);
            dtab[k] = (Math.random() * 100) + 1;
            System.out.printf(" DOUBLE: %.2f\n",dtab[k]);
            System.out.println(" STRING: " + stab[k]);
            System.out.println("\n");
            k++;
        }

        System.out.print("=========================");
    }
}