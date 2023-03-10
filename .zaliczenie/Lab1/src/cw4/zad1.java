package cw4;

import java.util.Random;

/* ćw.4 */

/* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów arytmetycznych i logicznych */

/* Biblioteka Random to generator losowych liczb */

public class zad1
{
    public static void main(String[] args)
    {

        Random rand = new Random();

        /* nextBoolean() w bibliotece Random wytwarza jedną losową wartość - true lub false, za każdym razem gdy funkcja ta jest użyta */
        /* Generujemy sobie 3 losowe wartości typu bool */

        boolean a = rand.nextBoolean();
        boolean b = rand.nextBoolean();
        boolean c = rand.nextBoolean();

        System.out.printf("=======================================\n=   a = %b   b = %b   c = %b   =\n=======================================\n", a, b, c);

        System.out.println("((a && b) || (a && c)) = " + ((a && b) || (a && c)));
        System.out.println("((b && c) || (a && c)) = " + ((b && c) || (a && c)));
        System.out.println("((!a && b) || (a && !c)) = " + ((!a && b) || (a && !c)));
        System.out.println("((!b && c) || (a && !c)) = " + ((!b && c) || (a && !c)));

        System.out.println("(a || b) = " + (a || b));
        System.out.println("(a || c) = " + (a || c));
        System.out.println("(false || b) = " + (false || b));

        System.out.println("!a = " + !a);
        System.out.println("!b = " + !b);
        System.out.println("!c = " + !c);

        System.out.println("!(a && b) = " + !(a && b));
        System.out.println("!((a && c) || (!a || b) = " + !((a && c) || (!a || b)));

        /* Math.random() generuje liczbe typu double pomiędzy lub równe 0.0 i 1.0 */
        /* Losowanie liczby od 0 do 100, (int) przekształca podaną przez Math.random() liczbę z double na int, krótko mówiąc (int) usuwa wszystko po przecinku w liczbie*/

        int x = (int)(Math.random() * 100) + 1;
        int y = (int)(Math.random() * 100) + 1;

        System.out.printf("========================\n=    x = %d   y = %d   =\n========================\n", x, y);
        System.out.println("(x == y) = " + (x == y));

        System.out.println("(x != y) = " + (x != y));

        System.out.println("(x > y) = " + (x > y));
        System.out.println("(x < y) = " + (x < y));
        System.out.println("(y >= x) = " + (y >= x));

        System.out.print("((x > y) || (a && b)) = " + ((x > y) || (a && c)));
    }
}