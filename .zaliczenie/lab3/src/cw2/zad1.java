package cw2;



public class zad1
{
    public static void main(String[] args)
    {
        /* ćw 2 klasy */
    /* zad.1
        a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
        klasa ma się znajdować w osobnym pliku Student.java
        b) stworzyć 3 objekty klasy student i wstawić je do tablicy
        c) wyświetlić dane z tablicy, użyć pętli for lub forEach
        d) dane powinny być estetycznie przedstawione
    */

        Student student1 = new Student("Adam","Wlosik",26,true);
        Student student2 = new Student("Kamil","Krawczyk",25,true);
        Student student3 = new Student("Michal", "Duchnowski",30,false);
        int licz = 1;

        Object[] studenci = {student1, student2, student3};

        for (Object s : studenci)
        {
            String imie = ((Student) s).getPoleS();
            String nazwisko = ((Student) s).getPoleS2();
            int wiek = ((Student) s).getPoleI();
            boolean student = ((Student) s).isPoleB();

            String czy_student = (student) ? "Tak" : "Nie";

            System.out.printf("\nStudent %d \n", licz );
            System.out.printf("Imie: %s\nNazwisko: %s\nWiek: %d\nCzy studiuje na WSB: %s\n", imie, nazwisko, wiek, czy_student);
            licz++;

        }

    }
}
