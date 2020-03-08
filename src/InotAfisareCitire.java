import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.out;

/*

clasa folosita pentru citirea si afisarea datelor de la tastatura
        pentru tipul de date inotator
*/

//citirea tipului de dateinotatori care vor fi introdusi in array-ul dinamic sportivi unde se vor afla si alte tipuri de date
class InotAfisareCitire {
    public static Inot CitireaInotatori(Scanner scanner, int n) throws InputMismatchException {

        out.println("======================================");
        out.println("Citirea datelor desper Inotatori: ");
        out.println("======================================");

        int cod = 0;
        String nume = null;
        String prenume = null;
        String gen = null;
        double InaltimeaInCentimentri = 0;
        double GreutateaInKilograme = 0;
        String dataNasterii = null;
        boolean StudiiSuperioare = false;
        int rank = 0;
        String divizie = null;
        String Categorie = null;
        String Nationala = null;

        try {
            for (int i = 0; i < n; i++) {
                out.print("cod: ");
                cod = scanner.nextInt();

                out.println("\n");

                out.print("Nume: ");
               nume = scanner.next();

                out.println("\n");

                out.print("Prenume: ");
                prenume = scanner.next();

                out.println("\n");

                out.print("gen: ");
                gen = scanner.next();

                out.println("\n");

                out.print("Inaltimea: ");
                InaltimeaInCentimentri = scanner.nextDouble();

                out.println("\n");

                out.print("Masa: ");
                GreutateaInKilograme = scanner.nextDouble();

                out.println("\n");

                out.print("Data Nasterii (MM/DD/YY): ");
                dataNasterii = scanner.next();

                out.println("\n");

                out.print("Studii Superioare: ");
                StudiiSuperioare = scanner.nextBoolean();

                out.println("\n");

                out.print("rank: ");
                rank = scanner.nextInt();

                out.println("\n");

                scanner.nextLine();

                out.print("divizie: ");
                divizie = scanner.nextLine();

                out.println("\n");

                out.print("Categorie: ");
                Categorie = scanner.nextLine();

                out.println("\n");

                out.print("Nationala: ");
                Nationala = scanner.nextLine();

                out.println("\n");

            }
        } catch (java.util.InputMismatchException e) {
            scanner.next();
            out.println("Tipul de date este introdus gresit");
        }

        return new Inot(cod, nume, prenume, gen, dataNasterii, GreutateaInKilograme, InaltimeaInCentimentri,
                StudiiSuperioare, rank, divizie, Categorie, Nationala);
    }

}
