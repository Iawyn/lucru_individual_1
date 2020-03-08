import static java.lang.System.*;
import java.time.*;
import java.time.format.DateTimeFormatter; //librarie ce ne va permite sa lucram cu tipul de date DATE si prelucrarea unei dati calendaristice

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

    LocalDate DataNasterii() //data a fost initial de tip de date String si acum va fi convertita in tipul de date LocalDate ce ne va permite sa efectuam oepratii cu Data calendaristica
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

    int getVarsta() //cu ajutorul tipului de date LocalDate efectuam operatii pentru a afla varsta sportivului nostru
    {
        LocalDate now = LocalDate.now();
        Period p = Period.between(DataNasterii(), now);

        return p.getYears();

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
