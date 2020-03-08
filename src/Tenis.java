import java.time.LocalDate;
import static java.lang.System.*;

public class Tenis extends Sportivi
{
    int rank, recordPierderi, recordVictorii;
    String divizie;

    Tenis()
    {

    }Tenis(int cod ,String nume, String prenume, String gen , String DataNasterii ,
            double GreutateaInKilograme, double InaltimeaInCentimentri, boolean StudiiSuperioare,
            int rank, String divizie, int recordVictorii, int recordPierderi)
    {
        super(cod, nume, prenume, gen, DataNasterii, GreutateaInKilograme, InaltimeaInCentimentri, StudiiSuperioare);
        this.rank = rank;
        this.divizie = divizie;
        this.recordVictorii = recordVictorii;
        this.recordPierderi = recordPierderi;

    }

    @Override
    String getProbaSportiva()
    {
        return "tenis";
    }

    int getRank()
    {
        return rank;
    }

    String getDivizie()
    {
        return divizie;
    }

    int getRecordVictorii()
    {
        return recordVictorii;
    }

    int getRecordPierderi()
    {
        return recordPierderi;
    }

    @Override
    void afisare() //suprascriem metode afisare pentru a adauga parametir noi de afisare
    {
        super.afisare();
        out.println("rank : " + rank);
        out.println("divizie: " + divizie);
        out.println("victorii: " + recordVictorii);
        out.println("infringeri: " + recordPierderi);
        out.println("============================================");
    }

}
