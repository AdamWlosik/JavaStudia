package cw7;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Map;

public class zad2
{
    public static Map<Long, String> dodaj(Map<Long, String> mapa, int min, Scanner input)
    {
        if (min == 0) System.out.println("\nPodaj tyle par wyrazow ile chcesz, jeśli chcesz zakonczyc zostaw pole puste i wcisnij Enter:");
        else if (min == 1) System.out.println("\nPodaj jedna lub wiecej par wyrazow, jesli chcesz zakonczyc zostaw pole puste i wcisnij Enter:");
        else System.out.printf("\nPodaj %d lub wiecej par wyrazow, jesli chcesz zakonczyc zostaw pole puste i wcisnij Enter: \n", min);
        for (int i = 1;;i++)
        {
            System.out.println(i + " para:");
            System.out.print("Klucz: ");
            String klucz_in = input.nextLine();
            Long klucz = 0L;

            if (klucz_in.isEmpty() && i <= min)
            {
                System.out.printf("Podaj prosze przynajmniej %d par\n", min);
                i--;
                continue;
            }
            else if (klucz_in.isEmpty()) break;

            try
            {
                klucz = Long.parseLong(klucz_in);
            }
            catch (NumberFormatException e)
            {
                System.out.println("\nPodany klucz nie jest wartoscia typu Long!\nblad: " + e + "\n");
                System.out.println("Sprobuj jeszcze raz: ");
                i--;
                continue;
            }

            System.out.print("Wartosc: ");
            String wartosc = input.nextLine();

            if (wartosc.isEmpty() && min == 0) break;
            else if (wartosc.isEmpty())
            {
                System.out.println("Nie uzupelniles wartosci, sprobuj jeszcze raz!");
                i--;
                continue;
            }
            else mapa.put(klucz, wartosc);
        }

        System.out.println();
        return mapa;
    }

    public static Map<Long, String> dodaj(Map<Long, String> mapa, int min, int max, Scanner input)
    {
        String s, k;

        switch (min)
        {
            case 1:
                s = "pare";
                k = "kolejna";
                break;

            case 2:
            case 3:
            case 4:
                s = "pary";
                k = "kolejne";
                break;

            default:
                s = "par";
                k = "kolejnych";
                break;
        }

        if (min == max) System.out.printf("\nPodaj %d %s %s, jesli chcesz zakonczyc zostaw pole puste i wcisnij Enter: \n", max, k, s);
        else
        {
            k = (max == 1) ? "pary" : "par";
            System.out.printf("\nPodaj od %d do %d %s, jesli chcesz zakonczyc zostaw pole puste i wcisnij Enter: \n", min, max, k);
        }

        for (int i = 1;i <= max;i++)
        {
            System.out.println(i + " para:");
            System.out.print("Klucz: ");
            String klucz_in = input.nextLine();
            Long klucz = 0L;

            if (klucz_in.isEmpty() && i <= min)
            {
                System.out.printf("Podaj prosze przynajmniej %d par\n", min);
                i--;
                continue;
            }
            else if (klucz_in.isEmpty()) break;

            try
            {
                klucz = Long.parseLong(klucz_in);
            }
            catch (NumberFormatException e)
            {
                System.out.println("\nPodany klucz nie jest wartoscia typu Long!\nblad: " + e + "\n");
                System.out.println("Sprobuj jeszcze raz: ");
                i--;
                continue;
            }

            System.out.print("Wartosc: ");
            String wartosc = input.nextLine();

            if (wartosc.isEmpty())
            {
                System.out.println("Nie uzupelniles wartosci, sprobuj jeszcze raz!");
                i--;
                continue;
            }
            else mapa.put(klucz, wartosc);
        }

        System.out.println();
        return mapa;
    }

    public static void wypisz(Map<Long, String> mapa)
    {
        System.out.println("Twoja mapa:");
        for (Map.Entry<Long, String> el : mapa.entrySet())
        {
            Long klucz = (Long)el.getKey();
            String wartosc = (String)el.getValue();

            System.out.println(klucz + ": " + wartosc);
        }
    }

    public static void najdluzszy(Map<Long, String> mapa)
    {
        Map.Entry<Long, String> najwiekszy = null;

        for (Map.Entry<Long, String> iteracja : mapa.entrySet())
        {
            if (najwiekszy == null || iteracja.getValue().length() > najwiekszy.getValue().length())
            {
                najwiekszy = iteracja;
            }
        }

        System.out.println("Najdluzsza wartosc: " + najwiekszy.getValue());
    }

    public static Map<Long, String> usun(Map<Long, String> mapa, int o)
    {
        int i = 1;
        for (Map.Entry<Long, String> el : mapa.entrySet())
        {
            Long klucz = (Long)el.getKey();
            i++;

            if (i == o)
            {
                mapa.remove(klucz);
                break;
            }
        }

        return mapa;
    }

    public static Map<Long, String> usun(Map<Long, String> mapa, Scanner input)
    {
        for (;;)
        {
            System.out.println("\nWybierz klucz ktory chcesz usunac z mapy, pozostaw puste i wcisnij Enter by zakonczyc:");
            wypisz(mapa);
            System.out.print("Klucz do usunieca: ");
            String klucz_in = input.nextLine();
            Long klucz = 0L;

            if (klucz_in.isEmpty()) break;

            try
            {
                klucz = Long.parseLong(klucz_in);
            }
            catch (NumberFormatException e)
            {
                System.out.println("\nPodany klucz nie jest wartoscia typu Long!\nblad: " + e + "\n");
                System.out.println("Sprobuj jeszcze raz: ");
                continue;
            }

            if (!(mapa.containsKey(klucz)))
            {
                System.out.println("\nMapa nie posiada danego klucza, sprobuj jeszcze raz!");
                continue;
            }

            System.out.println("Usunieto klucz '" + klucz + "'!\n");
            mapa.remove(klucz);
        }

        return mapa;
    }

    public static Map<Long, String> zamien(Map<Long, String> mapa, Scanner input)
    {
        for (;;)
        {
            System.out.println("\nWybierz klucz ktorego wartosc chcesz podmienic w mapie, pozostaw puste i wcisnij Enter by zakonczyc:");
            wypisz(mapa);
            System.out.print("Klucz: ");
            String klucz_in = input.nextLine();
            Long klucz = 0L;

            if (klucz_in.isEmpty()) break;

            try
            {
                klucz = Long.parseLong(klucz_in);
            }
            catch (NumberFormatException e)
            {
                System.out.println("\nPodany klucz nie jest wartością typu Long!\nblad: " + e + "\n");
                System.out.println("Sprobuj jeszcze raz: ");
                continue;
            }

            if (!(mapa.containsKey(klucz)))
            {
                System.out.println("\nMapa nie posiada danego klucza, sprobuj jeszcze raz!");
                continue;
            }

            System.out.print("Nowa wartosc: ");
            String wartosc = input.nextLine();
            System.out.println("Zmieniono wartosc klucza '" + klucz + "' na '" + wartosc + "'!\n");
            mapa.put(klucz, wartosc);
        }

        System.out.println();
        return mapa;
    }

    public static void main(String[] args)
    {
        /* zad.2* Napisać program:
            a) Stworzyć mapę Map<Long, String>,
            b) wstawić 5 par klucz-wartość z klawiatury (Klucz wprowadzamy jako indeks za pomocą pętli for),
            c) wykonać dowolne operacje dodawania, usuwania, zamiany wartości,
            d) znaleść parę o wartości z najdłuższą długościa wyrazu (map.getValue().length - jak największy),
            e) przeiterować i wyświetlić wartości w pętli
        */
        Scanner input = new Scanner(System.in);
        Map<Long, String> mapa = new LinkedHashMap<Long, String>();

        mapa = dodaj(mapa, 5, 5, input);

        mapa = dodaj(mapa, 0, input);
        usun(mapa, input);
        zamien(mapa, input);

        input.close();

        najdluzszy(mapa);
        wypisz(mapa);
    }
}