package cw4;

public class Osoba
{
    /* zad.1
        a) Stworzyć klasę Osoba z polami prywatnymi:
        - imie (String),
        - nazwisko (String),
        - indeks (Integer)
        b) stworzyc konstruktory, gettery i settery
        c) napisać metodę w klasie Osoba która zwróci informację o osobie,
    */


    private String imie, nazwisko;
    private int indeks;


    public Osoba(String imie, String nazwisko, int indeks)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.indeks = indeks;
    }


    @Override
    public String toString()
    {
        return
                "\nImie: " + imie +
                        "\nNazwisko: " + nazwisko +
                        "\nIndeks: " + indeks;
    }



    public String getImie()
    {
        return imie;
    }

    public void setImie(String imie)
    {
        this.imie = imie;
    }

    public String getNazwisko()
    {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko)
    {
        this.nazwisko = nazwisko;
    }

    public int getIndeks()
    {
        return indeks;
    }

    public void setIndeks(int indeks)
    {
        this.indeks = indeks;
    }

}
