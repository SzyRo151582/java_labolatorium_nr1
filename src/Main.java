import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.5 */

        /* zad.1 podziel swój wiek przez modulo 3 i jeśli twój wiek zwraca 0 wyświetl napis "Podzielny przez 3",
         * w innym wypadku "Niepodzielny przez 3" użyj kontrukcji if else
         * */

        Scanner scan = new Scanner(System.in);

        System.out.print("Wprowadź swój wiek: ");
        int mojWiek = scan.nextInt();

        if (mojWiek % 3 == 0)
        {
            System.out.println("Podzielny przez 3");
        }
        else
        {
            System.out.println("Niepodzielny przez 3");
        }


        /* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */

        System.out.print("Wprowadź swój numer indeksu: ");
        int mojNumerIndeksu = scan.nextInt();

        int wynik = (mojNumerIndeksu % 2 == 0) ? 0 : 1;
        System.out.println(wynik);


        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */

        System.out.print("Wprowadź dowolną liczbę rzeczywistą: ");
        double mojaLiczba = scan.nextDouble();

        if (mojaLiczba > 0)
        {
            System.out.println("Liczba ta jest większa od zera");
        }
        else if (mojaLiczba < 0)
        {
            System.out.println("Liczba ta jest mniejsza od zera");
        }
        else System.out.println("Liczba ta jest równa zero");

    }
}
