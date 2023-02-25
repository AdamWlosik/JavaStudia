package cw1;

public class zad1
{
    public static void main(String[] args)
    {
    /* zad.3
      a) w klasie Main stworzyć 2 objekty typu Dom deklarując pierwszy objekt Typem Dom,
      drugi objekt typem Budynek,
      b) wykorzystać wszystkie metody do implementacji pól,
      c) wyświetlić w konsoli metodę toString (na obu objektach) opisującą zachowanie klasy Dom,
      d) sprawdzić czy idzie wywołać z obu instancji objektu (deklaracja z interfejsu i z klasy)
      metodę której nie ma zadeklarowane w interfejsie Budynek, ale jest dopisana w klassie Dom,
    */


        Dom dom = new Dom();
        Budynek budynek = new Dom();


        dom.setCena(3000);
        dom.setKodPocztowy("82-283");
        dom.setKolor(KolorEnum.ZIELONY);
        dom.setMiejscowosc("Gdańsk");
        dom.setNrDomu(26);
        dom.setNrLokalu("11");
        dom.setPowBudynku(35.5);
        dom.setPowParkingu(0.0);
        dom.setPowPodworka(0.0);
        dom.setUlica("Morenowe Wzgorze");
        dom.setFundusz(100000);
        dom.liczbaMieszkancow(4);
        dom.liczbaOkien(5);


        budynek.adresBudynku("Gdańsk", "Grnuwaldzka", 260, "3", "80-530");
        budynek.powierzchnia(10, 10, 10);
        budynek.liczbaOkien(3);
        budynek.liczbaMieszkancow(2);
        budynek.kolorDomu(KolorEnum.BIALY);
        budynek.wyliczCene(20, 1500);
        budynek.kupMieszkanie(130000, 2800);

        System.out.println(dom.toString());
        dom.dziala();
        System.out.println(budynek.toString());


    }
}