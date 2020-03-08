import java.util.InputMismatchException;
import java.util.Scanner;
import static java.lang.System.out;

/*

clasa folosita pentru citirea si afisarea datelor de la tastatura
        pentru tipul de date fotbalist
*/


//citirea tipului de date fotbalisti care vor fi introdusi in array-ul dinamic sportivi unde se vor afla si alte tipuri de date

class FotbalistiAfisareCitire {
        public static Fotbal CitireaFotbalisti(Scanner scanner, int n) throws InputMismatchException {

            out.println("======================================");
            out.println("Citirea datelor despre fotbalisti : ");
            out.println("======================================");

//Initializarea variabilileor care vor fi servite drept parametri a obiectelor create
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
            int goluri = 0;
            int assistari = 0;
            double pretJucator = 0;

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

                 scanner.nextLine();

                 out.print("echipa: ");
                 echipa = scanner.nextLine();

                 out.println("\n");

                 out.print("divizie: ");
                 divizie = scanner.nextLine();

                 out.println("\n");

                 out.print("pozitie: ");
                 pozitie = scanner.nextLine();

                 out.println("\n");

                 out.print("goluri: ");
                 goluri = scanner.nextInt();

                 out.println("\n");

                 out.print("asistari: ");
                 assistari = scanner.nextInt();

                 out.println("\n");

                 out.print("pretul jucatorului: ");
                pretJucator = scanner.nextDouble();

                 out.println("\n");

             }
         }catch (java.util.InputMismatchException e) //exceptie ce verifica daca toate datele au fost introduse conform tipului de date
             {
                 scanner.next();
                 out.println("Tipul de date este introdus gresit");
             }

         //returnam obiectul creat care il putem adauga pe parcurs in array-ul dinamic
            return new Fotbal(cod, nume, prenume, gen, dataNasterii, GreutateaInKilograme, InaltimeaInCentimentri,
                    StudiiSuperioare, echipa, divizie, pozitie, goluri, assistari, pretJucator);
        }
}
