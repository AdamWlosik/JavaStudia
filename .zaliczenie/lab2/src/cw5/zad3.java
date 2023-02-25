package cw5;

import java.util.Scanner;

public class zad3
{

    public static void x(String imie)
    {
        System.out.println("Twoje imie: " + imie + "\n");
    }

    public static void x(String imie, String nazwisko)
    {
        System.out.println("Twoje imie: " + imie + ", Twoje nazwisko: " + nazwisko + "\n");

    }

    public static void x(String imie, String nazwisko, int wiek)
    {
        System.out.println("Twoje imie: " + imie + ", Twoje nazwisko: " + nazwisko + ", Twoj wiek: " + wiek + "\n");

    }

    public static void main(String[] args)
    {
        /* zad.3
        a) napisać metodę która przyjmuje 1 parametr typu String, metoda nic nie zwraca, tylko
            wyświetla w konsoli string który ma być waszym imieniem,
        b) napisać metodę o tej samej nazwie jak w punkcie a) z 2-oma parametrami typu String, która wyświetli
            wasze imie i nazwisko,
        c) napisać metodę o tej samej nazwie jak w punkcie a) i b) która przyjmuje wasze imie,
            nazwisko i wiek (int), a następnie wszystko wyświetli,
        */

        Scanner input = new Scanner(System.in);

        System.out.print("Podaj imie: ");
        String imie = input.nextLine();

        System.out.print("Podaj nazwisko: ");
        String nazwisko = input.nextLine();

        System.out.print("Podaj wiek: ");
        int wiek = input.nextInt();

        input.close();

        x(imie);
        x(imie, nazwisko);
        x(imie, nazwisko, wiek);
    }
}