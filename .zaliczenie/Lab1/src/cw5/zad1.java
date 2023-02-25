package cw5;

import java.util.Scanner;

/* zad.1 podziel swój wiek przez modulo 3 i jeśli twój wiek zwraca 0 wyświetl napis "Podzielny przez 3",
 * w innym wypadku "Niepodzielny przez 3" użyj kontrukcji if else
 * */

public class zad1
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        System.out.print("Podaj swoj wiek: ");
        int wiek = input.nextInt();
        input.close();

        if (wiek % 3 == 0)
        {
            System.out.println("Podzielny przez 3");
        }
        else
        {
            System.out.println("Niepodzielny przez 3");
        }
    }
}