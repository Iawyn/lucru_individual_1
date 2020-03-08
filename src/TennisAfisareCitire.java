import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.out;

/*

clasa folosita pentru citirea si afisarea datelor de la tastatura
        pentru tipul de date tenist
*/

//citirea tipului de date Tennis care vor fi introdusi in array-ul dinamic sportivi unde se vor afla si alte tipuri de date

class TennisAfisareCitire
{
    public static Tenis CitireaTenis(Scanner scanner, int n) throws InputMismatchException { //exceptie ce nu ne permite introducerea datelor de tip de date gresit

        out.println("======================================");
        out.println("Citirea datelor desper Tenisisti: ");
        out.println("======================================");

        int cod = 0;
        int rank = 0;
        int victorii = 0;
        int infrangeri  = 0;
        String nume = null;
        String prenume = null;
        String gen = null;
        String dataNasterii = null;
        String divizie = null;
        double InaltimeaInCentimentri = 0, GreutateaInKilograme = 0;
        boolean StudiiSuperioare = false;

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

                out.print("Victorii: ");
                victorii = scanner.nextInt();

                out.println("\n");

                out.print("Infrangeri: ");
                infrangeri = scanner.nextInt();

                out.println("\n");

            }
        }catch(java.util.InputMismatchException e) //exceptie ce nu ne permite introducerea datelor de tip de date gresit
        {
            scanner.next();
            out.println("Tipul de date este introdus gresit");
        }

        return new Tenis(cod, nume, prenume, gen, dataNasterii, GreutateaInKilograme, InaltimeaInCentimentri,
                StudiiSuperioare, rank, divizie, victorii, infrangeri); //returneaza un obiect nou creat
    }
//afisarea datelor citite

}
