import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.out;

class TennisAfisareCitire
{
    public static void CitireaTenis(ArrayList<Sportivi> Sportivi, Scanner scanner, int n) {
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

            out.print("rank: ");
            int rank = scanner.nextInt();

            out.println("\n");

            out.print("divizie: ");
            String divizie = scanner.next();

            out.println("\n");

            out.print("Victorii: : ");
            int victorii = scanner.nextInt();

            out.println("\n");

            out.print("Infrangeri: ");
            int infrangeri = scanner.nextInt();

            out.println("\n");

            Sportivi.add(new Tenis(cod, nume, prenume, gen, dataNasterii, GreutateaInKilograme, InaltimeaInCentimentri,
                    StudiiSuperioare,  rank, divizie, victorii, infrangeri));
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
