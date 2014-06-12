/**
 * Created by Samir on 12.06.14.
 */
import java.util.Scanner;
public class MyScanner {


        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("Willkommen zum Testprogramm!");
            System.out.println("Bitte geben Sie Ihren Vorname ein:");
            String vorname = s.nextLine();
            System.out.println("Bitte geben Sie Ihren Nachname ein:");
            String nachname = s.nextLine();
             String nachname = s.nextLine();
              //String nachname = s.nextLine();
               String familienname = s.nextLine();
                String nachname = s.nextLine();

            System.out.println("Hallo " + vorname + " " + nachname + "!");
            s.close();
        }



}
