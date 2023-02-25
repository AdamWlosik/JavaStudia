package cw5;

public class Produkcja extends Samochod
{

    protected int kosztProdukcji;


    public Produkcja()
    {
        super();
        this.kosztProdukcji = 0;
    }

    public Produkcja(int kosztProdukcji)
    {
        this.kosztProdukcji = kosztProdukcji;
    }

    public Produkcja(String rodzaj, String nazwa, int koszt, int kosztProdukcji)
    {
        super(rodzaj, nazwa, koszt);
        this.kosztProdukcji = kosztProdukcji;
    }


    @Override
    public int wyliczKoszta()
    {
        return super.wyliczKoszta() + kosztProdukcji;
    }


    @Override
    public String toString()
    {
        return
                        "Produkcja:" +
                        "\nKoszty produkcji = " + kosztProdukcji +
                        "\n" + super.toString();

    }


    public int getKosztProdukcji()
    {
        return kosztProdukcji;
    }

    public int setKosztProdukcji(int kosztProdukcji)
    {
        return this.kosztProdukcji = kosztProdukcji;
    }


}
