package cw6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class zad1
{
    public static List<String> dodaj(List<String> slist, int min, boolean dubluj, Scanner input)
    {
        System.out.printf("\nPodaj %d lub wiecej zwierzat, jesli chcesz zakonczyc zostaw pole puste i wcisnij Enter: \n", min);
        for (int i = 1;;i++)
        {
            Random rand = new Random();
            System.out.print(i + ". ");
            String wyraz = input.nextLine();

            if (wyraz.isEmpty() && i <= min)
            {
                System.out.printf("Podaj przynajmniej %d zwierzat\n", min);
                i--;
            }
            else if (wyraz.isEmpty()) break;
            else
            {
                if (rand.nextInt(2) == 1 && dubluj) slist.add(wyraz);
                slist.add(wyraz);
            }
        }

        System.out.println();
        return slist;
    }

    public static List<String> dodaj(List<String> slist, int min, int max, Scanner input)
    {
        String s;

        switch (min)
        {
            case 1:
                s = "zwierze";
                break;

            case 2:
            case 3:
            case 4:
                s = "zwierzeta";
                break;

            default:
                s = "zwierzat";
                break;
        }

        if (min == max) System.out.printf("\nPodaj %d kolejne %s: \n", max, s);
        else System.out.printf("\nPodaj od %d do %d zwierzat: \n", min, max);

        for (int i = 1;i <= max;i++)
        {
            System.out.print(i + ". ");
            String wyraz = input.nextLine();

            if (wyraz.isEmpty() && i <= min)
            {
                System.out.printf("Podaj przynajmniej %d %s\n", min, s);
                i--;
            }
            else if (wyraz.isEmpty()) break;
            else slist.add(wyraz);
        }

        System.out.println();
        return slist;
    }

    public static void wypisz(List<String> slist)
    {
        int i = 1;
        System.out.println("Twoja lista:");
        for (String s : slist)
        {
            System.out.println(i + ". " + s);
            i++;
        }
    }

    public static List<String> usun(List<String> slist, int o)
    {
        slist.remove(o-1);
        return slist;
    }

    public static List<String> usun(List<String> slist, Scanner input)
    {
        for (;;)
        {
            System.out.println("\nWybierz numer elementu ktory chcesz usunac, pozostaw puste i wcisnij Enter by zakonczyc:");
            wypisz(slist);
            System.out.print("Numer do usunieca: ");
            String numer = input.nextLine();

            int rmv;
            if (numer.isEmpty()) break;

            try
            {
                rmv = Integer.parseInt(numer);
            }
            catch (NumberFormatException e)
            {
                System.out.println("\nPodany mial zostac numer!!! (liczba)");
                System.out.println("KOD B????DU: " + e);
                continue;
            }

            if (rmv > slist.size())
            {
                System.out.println("\nPodany numer jest zbyt duzy, sprobuj jeszcze raz!");
                continue;
            }

            System.out.println("Usunieto numer " + rmv + ": " + slist.get(rmv-1) + "\n");
            slist.remove(rmv-1);
        }

        return slist;
    }

    public static void main(String[] args)
    {
        /* zad.1 Napisa?? program kt??ry
                a) stworzy list?? ArrayList<String> (lista tablicowa),
                  Prosz?? dane wprowadza?? z klawiatury (mo??na u??y?? p??tli), lista ma mie?? przynajmniej 5
                  element??w i elementami maj?? by?? nazwy zwierz??t (niech niekt??re warto??ci dubluj?? si??).
                  -- podpowied??: List<String> nazwaListy = new ArrayList<>();
                b) prosz?? stworzy?? metod?? kt??ra b??dzie mia??a p??tle forEach i b??dzie wy??wietla??a elementy Listy
                  -- podpowied??: for(String zmienna : List<String>) { }
                c) prosz?? usun???? 2 ostatnie elementy listy i drugi element, nast??pnie doda?? do niej 4 inne elementy,
                  nast??pnie wy??wietli?? list?? i wielko???? listy,
                d) prosz?? wy??wietli?? posortown?? list??, oraz odwrotniee posortowan?? i zn??w u??y?? metody z punktu b) do wy??wietlenia
                  element??w listy
          */

        Scanner input = new Scanner(System.in);
        List<String> slist = new ArrayList<>();
        int warunek = 0;

        slist = dodaj(slist, 5, true, input);
        wypisz(slist);

        System.out.println("\nChcesz usunac elementy z listy wlasnorecznie, czy automatycznie?");
        while (true)
        {
            System.out.print("1) Wlasnorecznie\n2) Automatycznie\nWybor: ");

            try
            {
                warunek = input.nextInt();
            }
            catch (InputMismatchException e)
            {
                System.out.println("\nPodaj numer opcji! (Liczbe)\nblad: " + e + "\n");
                input.nextLine();
            }

            switch (warunek)
            {
                case 1:
                    input.nextLine();
                    usun(slist, input);
                    break;

                case 2:
                    usun(slist, slist.size() - 1);
                    usun(slist, slist.size());
                    usun(slist, 2);
                    input.nextLine();
                    break;

                default:
                    System.out.println("Prosze wybrac ktoras z opcji!");
                    break;
            }

            if (warunek == 1 || warunek == 2) break;
            else continue;
        }

        slist = dodaj(slist, 4, 4, input);
        input.close();

        wypisz(slist);
        System.out.println("Wielkosc listy: " + slist.size());

        Collections.sort(slist);
        System.out.print("\nPosortowana, ");
        wypisz(slist);

        Collections.sort(slist, Collections.reverseOrder());
        System.out.print("\nOdwrotnie posortowana, ");
        wypisz(slist);
    }
}
