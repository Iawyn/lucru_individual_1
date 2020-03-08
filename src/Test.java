import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;

//clasa pentru testarea solutiilor pentru exercitiile propuse fara a introduce date de la tastatura

public class Test
{

    public static ArrayList<Sportivi> sportivi = new ArrayList<>(); //Array-uL dinamic global care va fi folosit pentru prelucrarea datelor si condiitlor
    public static Scanner sc = new Scanner(System.in); //Scanner global care va fi acceptat ca argument in fiecare metoda pentru a evita redeclararea

    public static void menu(Scanner sc) throws IOException //menu
    {
        boolean conditie = true; //conditia de rulare a menu-lui

        while (conditie) {
            out.println("\t \t \t \t \t \t Menu");
            out.println("---------------------------------------------------------");
            out.println("1) Introducerea Datelor: ");
            out.println("2) Afisarea Datelor Introduse: ");
            out.println("3) Afișarea celui mai în vârstă sportiv care practică fotbal: ");
            out.println("4) Afișarea greutății medii a tuturor sportivilor: ");
            out.println("5) Afișarea listei sportivilor de gen feminin, sub 12 ani care practică tenisul: ");
            out.println("6) Afișarea denumirii probei practicată de cel mai înalt sportiv: ");
            out.println("7) Afișarea datelor celui mai înalt sportiv de gen feminin care practică înotul și are studii superioare: ");
            out.println("8) 0 pentru a iesi din menu");
            out.println("---------------------------------------------------------");

            int userInput = sc.nextInt();

            out.println("---------------------------------------------------------");

            try {
                switch (userInput) {
                    case 1: {
                        out.println("Cati Fotbalisti doriti sa introduceti: ");
                        int nFotbal = sc.nextInt();

                        sportivi.add(FotbalistiAfisareCitire.CitireaFotbalisti(sc, nFotbal));

                        out.println("Cati Basketbalisti doriti sa introduceti: ");
                        int nBasket = sc.nextInt();

                        sportivi.add(BasketAfisareCitire.CitireaBasketball(sc, nBasket));

                        out.println("Cati Inotatori doriti sa introduceti:  ");
                        int nInot = sc.nextInt();

                        sportivi.add(InotAfisareCitire.CitireaInotatori(sc, nInot));

                        out.println("Cati Tenisisti doriti sa introduceti: ");
                        int nTenisisti = sc.nextInt();

                        sportivi.add(TennisAfisareCitire.CitireaTenis(sc, nTenisisti));
                        break;
                    }
                    case 2: {
                        for (Sportivi value : sportivi) {
                            value.afisare();
                        }
                        out.println("\n");
                        break;
                    }
                    case 3: {
                        //Afișarea celui mai în vârstă sportiv care practică fotbal;

                        out.println("-------------------------------------------------");

                        int celMaiInVarstaSportiv = 0;

                        for (Sportivi item : sportivi) {
                            if (item.getProbaSportiva().equals("Fotbal")) {
                                if (celMaiInVarstaSportiv < item.getVarsta()) {
                                    celMaiInVarstaSportiv = item.getVarsta();
                                }
                            }

                            if (item.getVarsta() == celMaiInVarstaSportiv) {
                                out.println("Cel mai in varsta sportiv care practica fotbali: ");
                                item.afisare();
                            }
                        }

                        out.println("-------------------------------------------------");
                        out.println("\n");

                        break;

                    }
                    case 4: {
                        //Afișarea greutății medii a tuturor sportivilor;

                        out.println("-------------------------------------------------");

                        double medie = 0;

                        for (int i = 0; i < sportivi.size(); i++) {
                            medie = sportivi.get(i).getGreutateInKilograme() / i;
                        }

                        out.printf("Greutatea medie a tuturor sportivilor este : %.2f", medie);
                        out.println("\n");

                        out.println("-------------------------------------------------");
                        out.println("\n");
                        break;
                    }
                    case 5: {
                        //Afișarea listei sportivilor de gen feminin, sub 12 ani care practică tenisul;
                        out.println("-------------------------------------------------");

                        out.println("Lista sportivilor de gen femenin sub 12 ani care joaca Tenis : ");

                        for (Sportivi value : sportivi) {
                            if (value.getProbaSportiva().equals("tenis")) {
                                if (value.getGen().equals("femenin")) {
                                    if (value.getVarsta() <= 12) {
                                        value.afisare();
                                    }
                                }
                            }
                        }
                        out.println("-------------------------------------------------");
                        out.println("\n");
                        break;
                    }
                    case 6: {
                        //Afișarea denumirii probei practicată de cel mai înalt sportiv;
                        out.println("-------------------------------------------------");

                        double inaltimeMax = 0;

                        for (Sportivi value : sportivi) {
                            if (value.getInaltimeaInCentimetri() > inaltimeMax) {
                                inaltimeMax = value.getInaltimeaInCentimetri();
                            }

                            if (value.getInaltimeaInCentimetri() == inaltimeMax) {
                                out.println("Proba sportiva practicata de cel mai inalt sportiv este : " + value.getProbaSportiva());
                            }
                        }

                        out.println("\n");
                        break;
                    }
                    case 7: {
                        // Afișarea datelor celui mai înalt sportiv de gen feminin care practică înotul și are studii superioare.
                        out.println("-------------------------------------------------");

                        double ceaMaiInaltaFemeie = 0;

                        for (Sportivi value : sportivi) {
                            if (value.getGen().equals("Femenin")) {
                                if (value.getInaltimeaInCentimetri() > ceaMaiInaltaFemeie) {
                                    if (value.getStudiiSuperioare()) {
                                        if (value.getProbaSportiva().equals("inot")) {
                                            value.afisare();
                                        }
                                    }
                                }
                            }
                        }
                        out.println("-------------------------------------------------");
                        out.println("\n");
                        break;
                    }
                    case 0: { //in cazul in care introducem 0 variabila de tip boolean se va redefini in false ceea ce va opri while loop-ul
                        conditie = false;
                    }

                }
            } catch (IllegalArgumentException e) { //exceptie pentru tipul de date introdus gresit
                out.println("ati introdus tipul de date gresit");
                e.printStackTrace();
            }

            System.in.read(); //la apasarea butonului enter menu-ul va aparea din nou

        }
    }


    public static void main(String[] args)
    {
        try {
            menu(sc);
        } catch (IOException e) { //exceptie pentru parametri de tip de date introdus gresit
            e.printStackTrace();
        }
    }

}
