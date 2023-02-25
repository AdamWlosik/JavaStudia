package cw5;

import java.util.Scanner;

/* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */

public class zad2
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        System.out.print("Podaj numer indeksu: ");
        int indeks = input.nextInt();
        input.close();

        String sprawdzenie = (indeks % 2 == 0) ? "parzysty" : "nieparzysty";
        System.out.println("Numer indeksu jest " + sprawdzenie);
    }
}