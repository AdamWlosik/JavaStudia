package cw2.cw2interfejsy;


public interface CzlowiekI
{
    default String imie()
    {
        String imie = "Adam";
        return imie;
    }

    default int wiek()
    {
        int wiek = 21;
        return wiek;
    }
}