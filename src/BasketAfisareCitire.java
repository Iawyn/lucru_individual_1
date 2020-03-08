import java.util.InputMismatchException;
import java.util.Scanner;
import static java.lang.System.out;

/*

clasa folosita pentru citirea si afisarea datelor de la tastatura
        pentru tipul de date basket
*/

//citirea tipului de date basket care vor fi introdusi in array-ul dinamic sportivi unde se vor afla si alte tipuri de date
class BasketAfisareCitire
{
    public static Basketball CitireaBasketball(Scanner scanner, int n) throws InputMismatchException {

        out.println("======================================");
        out.println("Citirea datelor desper Basketbalisti: ");
        out.println("======================================");

        int cod = 0;
        String nume = null;
        String prenume = null;
        String gen = null;
        double InaltimeaInCentimentri = 0;
        double GreutateaInKilograme = 0;
        String dataNasterii = null;
        boolean StudiiSuperioare = false;
        String echipa = null;
        String divizie = null;
        String pozitie = null;
        String liga = null;
        int Marcari2Puncte = 0;
        int Marcari3Puncte = 0;
        double pretJucator = 0;

        try {
            for (int i = 0; i < n; i++) {
                 out.print("cod: ");
                 cod = scanner.nextInt();

                out.print("\n");

                out.print("Nume: ");
                nume = scanner.next();

                scanner.nextLine();
                out.print("\n");

                out.print("Prenume: ");
                prenume = scanner.next();

                out.print("\n");

                scanner.nextLine();

                out.print("gen: ");
                gen = scanner.nextLine();

                out.println("\n");

                out.print("Inaltimea: ");
                InaltimeaInCentimentri = scanner.nextDouble();

                out.println("\n");

                out.print("Masa: ");
                GreutateaInKilograme = scanner.nextDouble();

                out.println("\n");

                out.print("Data Nasterii (MM/DD/YY) : ");
                dataNasterii = scanner.next();

                out.println("\n");


                out.print("Studii Superioare: ");
                StudiiSuperioare = scanner.nextBoolean();

                out.println("\n");
                scanner.nextLine();

                out.print("echipa: ");
                echipa = scanner.nextLine();

                out.println("\n");

                out.print("divizie: ");
                divizie = scanner.nextLine();

                out.println("\n");

                out.print("liga: ");
                liga = scanner.nextLine();

                out.println("\n");

                out.print("pozitie: ");
                pozitie = scanner.nextLine();

                out.println("\n");

                out.print("Marcari2Puncte: ");
                Marcari2Puncte = scanner.nextInt();

                out.println("\n");

                out.print("Marcari3Puncte: ");
                Marcari3Puncte = scanner.nextInt();

                out.println("\n");

                out.print("Pret jucator: ");
                pretJucator = scanner.nextInt();
            }
        }catch(java.util.InputMismatchException e)
        {
            scanner.next();
            out.println("Tipul de date este introdus gresit");
        }
        return new Basketball(cod, nume, prenume, gen, dataNasterii, GreutateaInKilograme, InaltimeaInCentimentri,
                StudiiSuperioare, echipa, divizie, pozitie, liga, Marcari2Puncte, Marcari3Puncte, pretJucator);
    }
}
