package cw1;

import java.util.Date;

//        ćw.1 napisać po kilka przykładów wypisywania tekstu w konsoli,
//        Użyć każdej z opcji

public class zad1
{
    public static void main(String[] args)
    {

        System.out.println("Witam, dzieki tej mozliwosci konczac ten tekst, kolejny wyswietli sie w kolejnym wierszu");
        System.out.print("Jak widac ten tekst jest wiersz nizej, inny sposob na przejście do kolejnego wiersza to\n");
        System.out.printf("Dzieki tej %s mozliwosci %s formatowac tekst i wstawiac nie %d, a wiele roznych zmiennych\n","ostatniej","mozemy", 1);
        System.out.print("Aczkolwiek wszystkie zmienne oznaczaja co innego: \n%s - zmienna tekstowa (string)\n%d - zmienna liczbowa (decimal integer)\nSs jeszcze inne jak np.:\n");
        System.out.print("%f");
        System.out.printf(" - liczba zmienno przecinkowa (floating-point number) np. %f\n", 12.5);
        Date date = new Date();
        System.out.print("%t");
        System.out.printf(" - wartosci daty/czasu (date/time values) np. %tT %1$td.%1$tm.%1$tY"+"r.", date);

    }
}