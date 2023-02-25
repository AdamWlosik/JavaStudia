package cw6;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class zad2
{
    public static void main(String[] args)
    {
         /* zad.2 Napisać program który :
                a) stworzy Set<Integer> i wprowadzamy 10 liczb z klawiatury, liczby mają się powtarzać,
                b) następnie wyświetlić zawartość set-a w konsoli,
                c) następnie przeiterować i wyświetlić forEach-em (jak wyżej)
         */

        Random rand = new Random();
        Set<Integer> liczby = new TreeSet<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj 10 liczb: ");
        for (int i = 1; i <= 10; i++)
        {
            System.out.print(i + ". ");
            int liczba = input.nextInt();
            liczby.add(liczba);

            if (rand.nextInt(2) == 1)
            {
                System.out.println("Twoja liczba sie powtorzyla!");
                liczby.add(liczba);
                i++;
                System.out.println(i + ". " + liczba);
            }
        }

        input.close();

        System.out.print("\nTwoje liczby: ");
        System.out.println(liczby);

        System.out.print("Twoje liczby forEach-em: ");
        liczby.forEach(l -> System.out.print(l + " "));
    }
}
