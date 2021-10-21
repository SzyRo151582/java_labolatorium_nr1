import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
        *   a) Imię, nazwisko, wiek, nr indeksu,
        *   dane mają być wprowadzane z klawiatury w konsoli
        *   b) wyświetlić dane za pomocą println i printf
        */

        Scanner scan = new Scanner(System.in);

        System.out.print("Wprowadź imie: ");
        String noweImie = scan.next();
        System.out.print("Wprowadź nazwisko: ");
        String noweNazwisko = scan.next();
        System.out.print("Wprowadź swój wiek: ");
        int iloscLat = scan.nextInt();
        System.out.print("Wprowadź numer indeksu: ");
        int nowyIndeks = scan.nextInt();

        System.out.println("Twoje nowe wprowadzone dane to: "+noweImie+", "+noweNazwisko+" \n"+iloscLat+", "+nowyIndeks+ ".");

        System.out.printf("Twoje nowe wprowadzone dane to: %s ,%s ,%d , %d .\n" ,noweImie ,noweNazwisko ,iloscLat ,nowyIndeks);


        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
        *   wynik wyświetlić w konsoli programu
        */

        int zmiennaInt1 = 8;
        int zmiennaInt2 = 12;

        int wynik1 = zmiennaInt2 + zmiennaInt1;
        System.out.println("Wynik pierwszego obliczenia to: " +wynik1);
        int wynik2 = zmiennaInt2 - zmiennaInt1;
        System.out.println("Wynik drugiego obliczenia to: " +wynik2);
        int wynik3 = zmiennaInt1 * zmiennaInt2;
        System.out.println("Wynik trzeciego obliczenia to: " +wynik3);
        int wynik4 = zmiennaInt1 / zmiennaInt2;
        System.out.println("Wynik czwartego obliczenia to: " +wynik4);
        int wynik5 = zmiennaInt1 % zmiennaInt2;
        System.out.println("Wynik piątego obliczenia to: " +wynik5);

    }
}
