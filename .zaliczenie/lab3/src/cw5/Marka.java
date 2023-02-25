package cw5;


public class Marka extends Produkcja
{

    protected int premiaMarki;


    public Marka()
    {
        super();
        this.premiaMarki = 0;
    }

    public Marka(int premiaMarki)
    {
        this.premiaMarki = premiaMarki;
    }

    public Marka(int kosztProdukcji, int premiaMarki)
    {
        super(kosztProdukcji);
        this.premiaMarki = premiaMarki;
    }

    public Marka(String rodzaj, String nazwa, int koszt, int kosztProdukcji)
    {
        super(rodzaj, nazwa, koszt, kosztProdukcji);
    }

    public Marka(String rodzaj, String nazwa, int koszt, int kosztProdukcji, int premiaMarki)
    {
        super(rodzaj, nazwa, koszt, kosztProdukcji);
        this.premiaMarki = premiaMarki;
    }


    @Override
    public int wyliczKoszta()
    {
        return super.wyliczKoszta() + premiaMarki;
    }


    @Override
    public String toString()
    {
        return
                "Marka:" +
                        "\nPremia za marke = " + premiaMarki +
                        "\n" + super.toString();

    }


    public int getPremiaMarki()
    {
        return premiaMarki;
    }

    public int setPremiaMarki(int premiaMarki)
    {
        return this.premiaMarki = premiaMarki;
    }

}
