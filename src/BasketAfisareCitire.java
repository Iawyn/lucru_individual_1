import java.time.LocalDate;
import java.util.Scanner;
import java.util.ArrayList;
import static java.lang.System.*;
import static java.lang.System.out;


class BasketAfisareCitire
{
    public static void CitireaBasketball(ArrayList<Sportivi> Sportivi, Scanner scanner, int n) {
        for (int i = 0; i < n; i++) {
            out.print("cod: ");
            int cod = scanner.nextInt();

            out.println("\n");

            out.print("Nume: ");
            String nume = scanner.next();

            out.println("\n");

            out.print("Prenume: ");
            String prenume = scanner.next();

            out.println("\n");

            out.print("gen: ");
            String gen = scanner.next();

            out.println("\n");

            out.print("Inaltimea: ");
            double InaltimeaInCentimentri = scanner.nextDouble();

            out.println("\n");

            out.print("Masa: ");
            double GreutateaInKilograme = scanner.nextDouble();

            out.println("\n");

            out.print("Data Nasterii: MM/DD/YY");
            String dataNasterii = scanner.next();

            out.println("\n");


            out.print("Studii Superioare: ");
            boolean StudiiSuperioare = scanner.hasNext();

            out.print("echipa: ");
            String echipa = scanner.next();

            out.println("\n");

            out.print("divizie: ");
            String divizie = scanner.next();

            out.println("\n");

            out.print("liga: ");
            String liga = scanner.next();

            out.println("\n");

            out.print("pozitie: ");
            String pozitie = scanner.next();

            out.println("\n");

            out.print("Marcari2Puncte: ");
            int Marcari2Puncte = scanner.nextInt();

            out.println("\n");

            out.print("Marcari3Puncte: ");
            int Marcari3Puncte = scanner.nextInt();

            out.println("\n");

            out.print("Pret jucator: ");
            double pret = scanner.nextInt();

            Sportivi.add(new Basketball(cod, nume, prenume, gen, dataNasterii, GreutateaInKilograme, InaltimeaInCentimentri,
                    StudiiSuperioare, echipa, divizie, pozitie, liga, Marcari2Puncte, Marcari3Puncte, pret));
        }
    }

    public static void Afisare(ArrayList<Sportivi> Sportivi)
    {
        for(int i = 0; i < Sportivi.size(); i++)
        {
            Sportivi.get(i).afisare();
        }
    }
}
