import static java.lang.System.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

class Sportivi
{
    String DataNasterii;
    int cod;
    double GreutateInKilograme, InaltimeaInCentimetri;
    String nume, prenume, gen;
    boolean StudiiSuperioare;

    Sportivi()
    {

    }Sportivi(int cod ,String nume, String prenume, String gen , String DataNasterii ,
              double GreutateaInKilograme, double InaltimeaInCentimentri, boolean StudiiSuperioare)
    {
        this.nume = nume;
        this.prenume = prenume;
        this.gen = gen;
        this.StudiiSuperioare = StudiiSuperioare;
        this.DataNasterii = DataNasterii;
        this.cod = cod;
        this.GreutateInKilograme = GreutateaInKilograme;
        this.InaltimeaInCentimetri = InaltimeaInCentimentri;
    }

    String getNume()
    {
        return nume;
    }

    String getPrenume()
    {
        return prenume;
    }

    String getGen()
    {
        return gen;
    }

    boolean getStudiiSuperioare()
    {
        return StudiiSuperioare;
    }

    LocalDate DataNasterii()
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        return LocalDate.parse(DataNasterii, formatter);
    }

    int getCod()
    {
        return cod;
    }

    double getGreutateInKilograme()
    {
        return GreutateInKilograme;
    }

    double getInaltimeaInCentimetri()
    {
        return InaltimeaInCentimetri;
    }

    String getProbaSportiva()
    {
        return "default";
    }

    int getVarsta()
    {
        LocalDate now = LocalDate.now();
        Period p = Period.between(DataNasterii(), now);
        int Varsta = p.getYears();

        return Varsta;

    }

    void afisare()
    {
        out.println("id: " + getCod());
        out.println("Nume: " + getNume());
        out.println("Prenume: " + getPrenume());
        out.println("Data Nasterii: " + DataNasterii());
        out.println("Varsta: " + getVarsta());
        out.println("Gen: " + getGen());
        out.println("Inaltime: " +  getInaltimeaInCentimetri() + "cm");
        out.println("Masa: " + getGreutateInKilograme() + "kg");
        out.println("Studii Superioare: " + getStudiiSuperioare());
    }
}
