import java.time.*;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;


public class Test
{

    public static ArrayList<Sportivi> sportivi = new ArrayList<Sportivi>();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {

        Sportivi fotbalist1 = new Fotbal(1, "Ion", "Vasile", "Masculin","10/02/2002",
                62.2, 1.80, false, "Bayern Munich", "Bundesliga", "Mijlocas-Central", 13, 0, 4421412);
        Sportivi fotbalist2 = new Fotbal(2, "Bogdan", "Nurmagomedov", "Masculin","10/12/2002",
                80, 1.60, false, "Real Madrid", "LaLiga", "Atacant-Central", 50, 3, 421412);

        Sportivi basketbalist1 = new Basketball(3, "Dan", "Bryant", "Masculin", "10/02/2008", 78.9, 1.96, false, "Chicago Bulls", "Liga Nord Americana",
                "NBL", "Dunker", 30, 63, 5215125);
        Sportivi basketbalist2 = new Basketball(3, "Dan", "Bryant", "Masculin","05/10/1972", 80.5, 2.03, true, "Miami Heat",  "Liga Nord Americana",
                "NBL", "Defender", 55, 123, 231215125);

        Sportivi Tenisista1 = new Tenis(4, "Valeria", "Cuteleaba", "Femenin","05/01/2010", 45.5, 1.60, false, 103,
                "Juniori", 10, 1);

        Sportivi Tenisista2 = new Tenis(5, "Daniela", "ManaScurta", "Femenin","05/01/2012", 35.5, 1.56, false, 103,
                "Juniori", 5, 0);

        Sportivi Inotator1 = new Inot(6, "Valeria", "Robu", "Femenin","05/01/1990", 65.3, 1.72, true, 23,
                "Divizia1", "Seniori", "Moldova");

        Sportivi Inotator2 = new Inot(7, "Inna", "Salimer", "Femenin","05/01/2000", 85.3, 1.72, false, 23,
                "Divizia3", "Majori", "Romania");

        sportivi.add(fotbalist1);
        sportivi.add(fotbalist2);
        sportivi.add(basketbalist1);
        sportivi.add(basketbalist2);
        sportivi.add(Tenisista1);
        sportivi.add(Tenisista2);
        sportivi.add(Inotator1);
        sportivi.add(Inotator2);


        int celMaiInVarstaSportiv = 0;

        for(int i = 0; i < sportivi.size(); i++)
        {
            if(celMaiInVarstaSportiv < sportivi.get(i).getVarsta())
            {
                celMaiInVarstaSportiv = sportivi.get(i).getVarsta();
            }
        }

        out.println("Cel mai invarsta spartsmen: " + celMaiInVarstaSportiv);

        double medie = 0;

        for(int i = 0; i < sportivi.size(); i++)
        {
            medie = sportivi.get(i).getGreutateInKilograme() / i;
        }

        out.printf("mediaGreutate: %.2f", medie);


        out.println("Lista sportivilor de gen femenin sub 12 ani care joaca Tenis: ");

        for(int i = 0; i < sportivi.size(); i++)
        {
            if(sportivi.get(i).getProbaSportiva() == "tenis")
            {
                if(sportivi.get(i).getVarsta() <= 12)
                {
                    sportivi.get(i).afisare();
                }
            }
        }

        double inaltimeMax = 0;
        String ProbaInaltimeMaX = null;

        for(int i = 0; i < sportivi.size(); i++)
        {
            if(sportivi.get(i).getInaltimeaInCentimetri() > inaltimeMax)
            {
                inaltimeMax = sportivi.get(i).getInaltimeaInCentimetri();
                ProbaInaltimeMaX = sportivi.get(i).getProbaSportiva();
            }
        }

        out.print("Proba sportiva practicata de cel mai inalt sportiv este: " + ProbaInaltimeMaX);


        out.println("cea mai inalta femeie cu studii superioare ce practica inotul: ");

        double ceaMaiInaltaFemeie = 0;

        for(int i = 0; i < sportivi.size(); i++)
        {
            if(sportivi.get(i).getGen() == "Femenin")
            {
                if(sportivi.get(i).getInaltimeaInCentimetri() > ceaMaiInaltaFemeie)
                {
                    if(sportivi.get(i).getStudiiSuperioare() == true)
                    {
                        if (sportivi.get(i).getProbaSportiva() == "inot")
                        {
                            sportivi.get(i).afisare();
                        }
                    }
                }
            }
        }

    }

    static void FotbalAfisareCitire(Scanner sc)
    {
        out.println("Cati Fotbalisti doriti sa introduceti: ");
        int n = sc.nextInt();

        FotbalistiAfisareCitire.CitireaFotbalisti(sportivi, sc, n );
        FotbalistiAfisareCitire.Afisare(sportivi);
    }

    static void BasketAfisareCitire(Scanner sc)
    {
        out.println("Cati basketbalisti doriti sa introduceti: ");
        int n = sc.nextInt();

        BasketAfisareCitire.CitireaBasketball(sportivi, sc, n);
        BasketAfisareCitire.Afisare(sportivi);
    }

    static void TenisAfisareCitire(Scanner sc)
    {
        out.println("Cati tenisisti doriti sa introduceti: ");
        int n = sc.nextInt();

        TennisAfisareCitire.CitireaTenis(sportivi, sc, n);
        TennisAfisareCitire.Afisare(sportivi);
    }

    static void InotAfisareCitire(Scanner sc)
    {
        out.println("Cati Inotatori doriti sa introduceti: ");
        int n = sc.nextInt();

        InotAfisareCitire.CitireaInotatori(sportivi, sc , n);
        InotAfisareCitire.Afisare(sportivi);

    }
}
