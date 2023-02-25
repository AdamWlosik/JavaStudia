package cw5;

import java.util.Scanner;

/* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
 * i stwórz konstrukcję else if z dowolnymi komunikatami */

public class zad3
{
    public static void main(String[] args)
    {


        Scanner input = new Scanner(System.in);

        System.out.print("Podaj liczbe z przecinkiem: ");
        double liczba = input.nextDouble();
        input.close();

        double polowa = liczba % 2;
        long sprawdzenie = Math.round(liczba);


        if (polowa == 0)
        {
            System.out.println("\nPodales liczbe calkowita");
            System.out.printf("PRZED: %f\nPO: %f", liczba, sprawdzenie - polowa);
        }
        else if (sprawdzenie > liczba)
        {
            System.out.println("\nTwoja liczba po zaokragleniu jest wieksza od oryginalu");
            System.out.printf("PRZED: %f\nPO: %d", liczba, sprawdzenie);
        }
        else
        {
            System.out.println("\nTwoja liczba po zaokragleniu jest mniejsza od oryginalu");
            System.out.printf("PRZED: %f\nPO: %d", liczba, sprawdzenie);
        }
    }
}