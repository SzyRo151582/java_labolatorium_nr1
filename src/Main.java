import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int zmiennaInt = 7;
        System.out.println("zmienna int = " + zmiennaInt);
        /* ćw.2 */

        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */

        byte zmiennaTypuByte = 13;
        short zmiennaTypuShort = -2367;
        int zmiennaTypuInt = 3859746;
        long zmiennaTypuLong = -582785979589L;
        float zmiennaTypuFloat = 12.6998f;
        double zmiennaTypuDouble = -34581.2339;
        boolean zmiennaTypuBoolean = false;
        char zmiennaTypuChar = 'u';
        String zmiennaString = "Witam";


        /*
        *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
        *    mnożenia, dziealenia i modulo na zmiennych:
        *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
        *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
        *  */


        int liczbaA = 18 , liczbaB = -8;
        double liczbaX = 2.8 , liczbaY = -8.12;

        double wynik1 = liczbaA + liczbaX;
        double wynik2 = liczbaX - liczbaY;
        int wynik3 = liczbaA * liczbaB;
        int wynik4 = liczbaB / liczbaA;
        int wynik5 = liczbaA % liczbaB;

    }
}
