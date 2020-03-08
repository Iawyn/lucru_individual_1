import static java.lang.System.*;


public class Fotbal extends Sportivi
{
    String echipa, divizie, pozitie;
    int goluri, asistari;
    double pretJucator;

    Fotbal()
    {

    }Fotbal(int cod ,String nume, String prenume, String gen , String DataNasterii ,
            double GreutateaInKilograme, double InaltimeaInCentimentri, boolean StudiiSuperioare,
            String echipa, String divizie, String pozitie, int goluri, int asistari, double pretJucator)
    {
        super(cod, nume, prenume, gen, DataNasterii, GreutateaInKilograme, InaltimeaInCentimentri, StudiiSuperioare);
        this.echipa = echipa;
        this.divizie = divizie;
        this.pozitie = pozitie;
        this.goluri = goluri;
        this.asistari = asistari;
        this.pretJucator = pretJucator;
    }


    @Override
    String getProbaSportiva()
    {
        return "Fotbal";
    }

    String getEchipa()
    {
        return echipa;
    }

    String getDivizie()
    {
        return divizie;
    }

    String getPozitie()
    {
        return pozitie;
    }

    int getGoluri()
    {
        return goluri;
    }

    int getAsistari()
    {
        return asistari;
    }

    double getPretJucator()
    {
        return pretJucator;
    }

    @Override //suprascriem metode afisare pentru a adauga parametir noi de afisare
    void afisare()
    {
        super.afisare();
        out.println("echipa: " + getEchipa());
        out.println("divizie: " + getDivizie());
        out.println("pozitie: " + getPozitie());
        out.println("goluri: " + getGoluri());
        out.println("asistari: " + getAsistari());
        out.println("pretul jucatorului: " + getPretJucator() + " $");
        out.println("============================================");
    }
}
