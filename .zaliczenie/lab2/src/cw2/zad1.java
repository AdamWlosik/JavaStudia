package cw2;

import java.util.Scanner;

public class zad1 {

    public static void main(String[] args) {
        /* zad.1 Napisz program który będzie iterował od 100 do 0,
         *  i wyświetlał liczby które są podzielne przez ostatnią cyfrę waszego indeksu
         * (jesli tą liczbą jest 0 to przez 2 ostatnie)
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Podaj swoj numer indeksu: ");
        int indeks = input.nextInt();
        input.close();


        int x = 100;
        String ost_cyfry = Integer.toString(indeks);
        int dwie_ostatnie = Integer.parseInt(ost_cyfry.substring(ost_cyfry.length() - 2));
        int ostatnia = Integer.parseInt(ost_cyfry.substring(ost_cyfry.length() - 1));


        do {
            if (ostatnia == 0) {
                if (x % dwie_ostatnie == 0) {
                    System.out.printf("Liczba %d podzielna przez %d\n", x, dwie_ostatnie);
                }
            } else if (x % ostatnia == 0) {
                System.out.printf("Liczba %d podzielna przez %d\n", x, ostatnia);
            }
            x--;
        } while (x != 0);
    }
}