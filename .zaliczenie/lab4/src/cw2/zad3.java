package cw2;
import cw2.cw2klasy.Pracownik;
import cw2.cw2klasy.Student;

import java.util.LinkedHashMap;


public class zad3
{
    public static void main(String[] args)
    {
        /* zad.3
        a) stworzyć 2 objekty typu Student i uzupełnić wszystkie pola,
        b) stworzyć 2 objekty typu Pracownik i uzupełnić wszystkie pola,
        c) wypisać metody toString() wszystkich objektów,
        */




        String[] przedmioty = {"Jezyk angielski", "Modele chmury obliczeniowej", "Cyberterroryzm", "Projektowanie systemów informatycznych", "Zaawansowane technologie internetowe"};

        // STUDENT I
        int[] oceny1 = {4,2,6,3,3,2,5};

        LinkedHashMap<String, Integer> zaliczenia1 = new LinkedHashMap<>();
        zaliczenia1.put("Matma", 5);
        zaliczenia1.put("Polski", 3);
        zaliczenia1.put("Informatyka", 6);



        int[] oceny2 = {4,3,2,5,2,4,6};

        LinkedHashMap<String, Integer> zaliczenia2 = new LinkedHashMap<>();
        zaliczenia2.put("Matma", 3);
        zaliczenia2.put("Polski", 5);
        zaliczenia2.put("Informatyka", 4);



        LinkedHashMap<String, String> grupy = new LinkedHashMap<>();
        grupy.put("PR3","Programista");
        grupy.put("PR2","Programista");
        grupy.put("PR1","Programista");

        LinkedHashMap<String, Integer> oceny = new LinkedHashMap<>();
        oceny.put("Adam", 6);
        oceny.put("Bartek", 5);
        oceny.put("Pawel", 4);

        LinkedHashMap<String, String> terminy = new LinkedHashMap<>();
        terminy.put("Programowanie w Java","9.06.2022");
        terminy.put("Programowanie w C#","02.06.2022");
        terminy.put("Programowanie w Python","20.06.2022");


        Student student1 = new Student(null, 0 , przedmioty, oceny1, zaliczenia1);
        Student student2 = new Student("Bartek", 23, przedmioty, oceny2, zaliczenia2);


        Pracownik pracownik1 = new Pracownik("Pawel", 25, grupy, oceny, terminy);
        Pracownik pracownik2 = new Pracownik(null, 0, grupy, oceny, terminy);


        System.out.println(student1.toString() + "\n");
        System.out.println(student2.toString() + "\n");
        System.out.println(pracownik1.toString() + "\n");
        System.out.println(pracownik2.toString());
    }
}