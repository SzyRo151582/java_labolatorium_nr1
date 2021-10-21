import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.4 */

        /* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów arytmetycznych i logicznych */

        boolean a = true;
        boolean b = false;
        boolean c = true;

        boolean zlozonaOperacja1 = (a && b) || c;
        System.out.println("Wynik pierwszej operacji to: " +zlozonaOperacja1);

        boolean zlozonaOperacja2 = (!(b || c)) && (c && a);
        System.out.println("Wynik drugiej operacji to: " +zlozonaOperacja2);

        boolean zlozonaOperacja3 = (!c || a) || (!(a && b));
        System.out.println("Wynik trzeciej operacji to: " +zlozonaOperacja3);

    }
}
