package cw3;

import java.util.Scanner;

/*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
 *   a) Imię, nazwisko, wiek, nr indeksu,
 *   dane mają być wprowadzane z klawiatury w konsoli
 *   b) wyświetlić dane za pomocą println i printf
 */

public class zad1
{
    public static void main(String[] args)
    {


        Scanner input = new Scanner(System.in);

        System.out.print("Podaj imie: ");
        String imie = input.next();

        System.out.print("Podaj nazwisko: ");
        String nazwisko = input.next();

        System.out.print("Podaj wiek: ");
        int wiek = input.nextInt();

        System.out.print("Podaj numer indeksu: ");
        int nrIndeksu = input.nextInt();

        input.close();

        System.out.print(
                "\nTwoje dane:" +
                        "\nImie - " + imie +
                        "\nNazwisko - " + nazwisko +
                        "\nWiek - " + wiek +
                        "\nNumer indeksu - " + nrIndeksu
        );
    }
}
