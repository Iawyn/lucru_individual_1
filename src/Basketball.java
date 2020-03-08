import static java.lang.System.*;

public class Basketball extends Sportivi
{
    String echipa ,divizie, liga, pozitie;
    int MarcariTreiPuncte, MarcariDouaPuncte;
    double pretJucator;

    Basketball()
    {

    }Basketball(int cod ,String nume, String prenume, String gen , String DataNasterii ,
                double GreutateaInKilograme, double InaltimeaInCentimentri, boolean StudiiSuperioare,  String echipa ,
                String divizie, String liga, String pozitie, int MarcariTreiPuncte, int MarcariDouaPuncte, double pretJucator)
    {
        super(cod, nume, prenume, gen, DataNasterii, GreutateaInKilograme, InaltimeaInCentimentri, StudiiSuperioare);
        this.echipa = echipa;
        this.divizie = divizie;
        this.liga = liga;
        this.pozitie = pozitie;
        this.MarcariDouaPuncte = MarcariDouaPuncte;
        this.MarcariTreiPuncte = MarcariTreiPuncte;
        this.pretJucator = pretJucator;
    }

    @Override
    String getProbaSportiva()
    {
        return "Basket";
    }

    String getDivizie()
    {
        return divizie;
    }

    String getLiga()
    {
        return liga;
    }

    String getPozitie()
    {
        return pozitie;
    }

    int getMarcariDouaPuncte()
    {
        return MarcariDouaPuncte;
    }

    int getMarcariTreiPuncte()
    {
        return MarcariTreiPuncte;
    }

    double getPretJucator()
    {
        return pretJucator;
    }

    @Override
    void afisare() //suprascriem metode afisare pentru a adauga parametir noi de afisare
    {
        super.afisare();
        out.println("Divizie: " + getDivizie());
        out.println("Liga: " + getLiga());
        out.println("Pozitie: " + getPozitie());
        out.println("Marari 2 puncte: " + getMarcariDouaPuncte());
        out.println("Marcari 3 puncte: " + getMarcariTreiPuncte());
        out.println("Pretul Jucatorului: " + getPretJucator());
        out.println("============================================");

    }
}
