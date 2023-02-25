package cw4;



public class zad2 {
    public static void main(String[] args) {
        /* zad.2
            a) stworzyć dowolny przykład z NullPonterException,
            b) stworzyć dowolny przykład z ArithmeticException ,
            c) stworzyć dowolny przykład z 2 lub 3 blokami catch i z blokiem finally,
        */

        String test = null;
        int x = 0;
        for(int y = 0; y <= 1; y ++)
        {
            try {
                int[] liczby = new int[10];
                liczby[13] = 30 / x;
            } catch (ArithmeticException e) {
                System.out.println("Nie dziel przez 0");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Podany indeks nie znajduje sie w tablicy");
            }

            try {
                System.out.println("Dlugosc wyrazu = " + test.length());
            } catch (NullPointerException e) {
                System.out.println("string nie moze byc NULL");
            } finally {
                System.out.println("Koniec programu.\n");
            }

             test = "test";
             x = 3;
        }

    }
}