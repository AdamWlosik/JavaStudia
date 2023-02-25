package cw4;

import java.util.ArrayList;

public class zad3
{
    public static void main(String[] args)
    {
        /* zad.3
            a) W klasie Main stworzyć 5 różnych studentów, (można za pomocą tego samego objektu)
            b) dodać studentów do Listy ArrayList,
            c) przeiterować listę za pomocą pętli forEach wywołując na każdym objekcie metodę toString() (w każdej iteracji);
        */


        int licz = 1;


        ArrayList<Object> studentList = new ArrayList<Object>();


        Osoba osoba = new Osoba("Adam", "Wlosik", 62078);
        Student student = new Student(osoba, WydzialEnum.GDANSK);
        studentList.add(student);


        osoba = new Osoba("Pawel", "Banach", 96277);
        student = new Student(osoba, WydzialEnum.KRAKOW);
        studentList.add(student);


        osoba = new Osoba("Rafal", "Pochopien", 32596);
        student = new Student(osoba, WydzialEnum.GDYNIA);
        studentList.add(student);


        osoba = new Osoba("Kamil", "Krawczyk", 75963);
        student = new Student(osoba, WydzialEnum.POZNAN);
        studentList.add(student);


        osoba = new Osoba("Paula", "Wasilewska", 46835);
        student = new Student(osoba, WydzialEnum.WARSZAWA);
        studentList.add(student);


        for (Object o : studentList)
        {
            System.out.printf("============= Student %d =============\n", licz);
            System.out.println(o.toString());
            licz++;
        }
        System.out.print("=====================================");
    }
}