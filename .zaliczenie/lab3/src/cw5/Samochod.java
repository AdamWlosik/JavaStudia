package cw5;

public class Samochod
{

    protected String rodzaj;
    protected String nazwa;
    protected int koszt;
    private boolean czySchemat;


    public Samochod()
    {
        this.rodzaj = "";
        this.nazwa = "";
        this.koszt = 0;
        czySchemat = false;
    }

    public Samochod(String rodzaj, String nazwa, int koszt)
    {
        this.rodzaj = rodzaj;
        this.nazwa = nazwa;
        this.koszt = koszt;
        czySchemat = true;
    }


    public int wyliczKoszta()
    {
        return this.koszt;
    }


    @Override
    public String toString()
    {
        return
                         "Schemat:" +
                        "\nRodzaj = " + rodzaj +
                        "\nNazwa = " + nazwa +
                        "\nczy schemat jest gotowy? = " + (czySchemat ? "Tak" : "Nie") +
                        "\nKoszt schematu = " + koszt;
    }


    public String getRodzaj()
    {
        return rodzaj;
    }

    public String setRodzaj(String rodzaj)
    {
        return this.rodzaj = rodzaj;
    }

    public String getNazwa()
    {
        return nazwa;
    }

    public String setNazwa(String nazwa)
    {
        return this.nazwa = nazwa;
    }

    public int getKoszt()
    {
        return koszt;
    }

    public int setKoszt(int koszt)
    {
        return this.koszt = koszt;
    }

    public boolean isCzySchemat()
    {
        return czySchemat;
    }

    public void setCzySchemat(boolean czySchemat)
    {
        this.czySchemat = czySchemat;
    }
}